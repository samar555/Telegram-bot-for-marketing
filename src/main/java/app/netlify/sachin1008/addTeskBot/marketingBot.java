package app.netlify.sachin1008.addTeskBot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import app.netlify.sachin1008.Entity.Users;
import app.netlify.sachin1008.Repository.userRepo;
import app.netlify.sachin1008.service.impl.GenAIImpl;
import app.netlify.sachin1008.service.impl.OptionServiceImpl;
import app.netlify.sachin1008.service.impl.QueriesForAIImpl;
import app.netlify.sachin1008.service.impl.UserServiceImpl;
import app.netlify.sachin1008.service.impl.WebScrapingImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class marketingBot extends TelegramLongPollingBot {
	Users user = new Users();
	private final String botName;

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Autowired
	private WebScrapingImpl scrapingImpl;
	@Autowired
	private userRepo repo;

	@Autowired
	private GenAIImpl aiImpl;

	@Autowired
	private QueriesForAIImpl forAIImpl;

	@Autowired
	private OptionServiceImpl optionServiceImpl;

	public marketingBot(String botName, String botToken) {
		super(botToken);
		this.botName = botName;
	}

	@Override
	public void onUpdateReceived(Update update) {
		try {
			SendMessage sendMessage = new SendMessage();
			Message message = update.getMessage();

			if (update.hasMessage() && update.getMessage().hasText()) {

				switch (message.getText().trim().toLowerCase()) {
				case "/start": {

					user.setChatId(message.getChatId().toString());
					user.setQuestion("Industry");

					sendMessage.setChatId(message.getChatId());
					sendMessage.setText("Welcome to AdTesk " + message.getChat().getFirstName()
							+ " \nPromote Your Bussiness With Some Questions");
					execute(sendMessage);
					sendMessage = new SendMessage();
					sendMessage.setChatId(message.getChatId().toString());
					sendMessage.setText("What industry is your business in?");
					sendMessage.setReplyMarkup(optionServiceImpl.getOptionIndustriesBussiness());
					System.out.println();

//					sendMessage.setReplyMarkup(new ReplyKeyboardMarkup(List.of(row)));

					execute(sendMessage);

					log.info(message.getText());
					break;

				}
				case "/stop": {
					userServiceImpl.deleteUser(message.getChatId().toString());
					sendMessage.setChatId(message.getChatId());
					sendMessage.setText("Thanku for using Adtask");
					execute(sendMessage);
					break;
				}

				default: {
					if (user != null && user.getQuestion() != null) {
						if (user.getQuestion().trim().equalsIgnoreCase("Do you have a website")) {
							sendMessage.setChatId(message.getChatId());
							user = new Users();
							user.setChatId(message.getChatId().toString());
							user.setQuestion("website");
							user.setAnswer(message.getText());
							userServiceImpl.saveUser(user);
							sendMessage.setText("Do you have any social media platforms?\nupload URL");
							user.setQuestion("Do you have any social media platforms?\nupload URL");
							execute(sendMessage);

						} else if (user.getQuestion().trim()
								.equalsIgnoreCase("Do you have any social media platforms?\nupload URL")) {
							sendMessage.setChatId(message.getChatId());
							user = new Users();
							user.setChatId(message.getChatId().toString());
							user.setQuestion("social meadia");
							user.setAnswer(message.getText());
							userServiceImpl.saveUser(user);
							sendMessage.setText("Do you use PPC campaigns? \nEnter campaigns");
							user.setQuestion("Do you use PPC campaigns? \nEnter campaigns");
							execute(sendMessage);
						} else if (user.getQuestion().trim()
								.equalsIgnoreCase("Do you use PPC campaigns? \nEnter campaigns")) {
							sendMessage.setChatId(message.getChatId());
							user = new Users();
							user.setChatId(message.getChatId().toString());
							user.setQuestion("campaigns");
							user.setAnswer(message.getText());
							userServiceImpl.saveUser(user);
							sendMessage.setText("Who are you trying to reach");
							sendMessage.setReplyMarkup(optionServiceImpl.getOptionCategory());
							user.setQuestion("Who are you trying to reach");
							execute(sendMessage);
						} else if (user.getQuestion().trim().equalsIgnoreCase("Who are you trying to reach")) {
							sendMessage.setChatId(message.getChatId());
							user = new Users();
							user.setChatId(message.getChatId().toString());
							user.setQuestion("campaigns");
							user.setAnswer(message.getText());
							userServiceImpl.saveUser(user);
							sendMessage.setText("What location would you like to target?");
							user.setQuestion("What location would you like to target?");
							execute(sendMessage);
						}
					} else {
						sendMessage.setChatId(message.getChatId());
						sendMessage.setText(aiImpl.getResponse(forAIImpl.genrateQueryForAI(message.getText())));
						execute(sendMessage);
					}
				}

				}

//				execute(new SendMessage(message.getChatId().toString(),"testing bot"));
			} else {
				if (update.hasCallbackQuery()) {
					String callbackData = update.getCallbackQuery().getData();
					Long chatId = update.getCallbackQuery().getMessage().getChatId();
					System.out.println(callbackData);
					user.setAnswer(callbackData);
					if (user.getQuestion() != null) {
						userServiceImpl.saveUser(user);
					}
					sendMessage = new SendMessage();
					sendMessage.setChatId(chatId);
					if (repo.findByChatId(chatId.toString()).size() == 1
							&& !callbackData.trim().equalsIgnoreCase("show Ad Click In Different Industries")
							&& !callbackData.trim().equalsIgnoreCase("AI")) {
						sendMessage.setText("What is your business objective?");
						user = new Users();
						user.setChatId(chatId.toString());
						user.setQuestion("Objective");
						sendMessage.setReplyMarkup(optionServiceImpl.getOptionBussinessObjective(callbackData));
						System.out.println();
					} else if (repo.findByChatId(chatId.toString()).size() == 5
							&& !callbackData.trim().equalsIgnoreCase("show Ad Click In Different Industries")
							&& !callbackData.trim().equalsIgnoreCase("AI")) {
						user = new Users();
						user.setChatId(chatId.toString());
						user.setQuestion("location");
						sendMessage.setText("What location would you like to target?");
						sendMessage.setReplyMarkup(optionServiceImpl.getOptionLocation());

					} else if (repo.findByChatId(chatId.toString()).size() == 2) {
						user = new Users();
						user.setChatId(chatId.toString());
						user.setQuestion("Do you have a website");
						sendMessage.setText(
								"Do you have a website? \nif Yes then write your website url otherwise write No");
					} else if (repo.findByChatId(chatId.toString()).size() == 6
							&& !callbackData.trim().equalsIgnoreCase("show Ad Click In Different Industries")
							&& !callbackData.trim().equalsIgnoreCase("AI")) {

//						System.out.println(aiImpl.getResponse("define gravity"));
						sendMessage.setText(aiImpl.getResponse(
								forAIImpl.genarateKeyWordQuery(repo.findByChatId(chatId.toString().trim()))));
//						userServiceImpl.deleteUser(chatId.toString());
						sendMessage.setReplyMarkup(optionServiceImpl.getOptionScrapingAndAI());
						user = new Users();
					} else if (callbackData.trim().equalsIgnoreCase("show Ad Click In Different Industries")) {
						sendMessage.setText(scrapingImpl.scrapingWeb("https://databox.com/ppc-industry-benchmarks"));
						sendMessage.setReplyMarkup(optionServiceImpl.getOptionScrapingAndAI());

					} else if (callbackData.trim().equalsIgnoreCase("AI")) {
						sendMessage.setText("write your query");
						sendMessage.setReplyMarkup(optionServiceImpl.getOptionScrapingAndAI());

					}
					execute(sendMessage);

				}
			}
		} catch (Exception e) {
			log.error("Error accurred", e);
		}

	}

	@Override
	public String getBotUsername() {

		return this.botName;
	}

}
