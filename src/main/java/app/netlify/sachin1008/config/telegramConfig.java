package app.netlify.sachin1008.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import app.netlify.sachin1008.addTeskBot.marketingBot;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class telegramConfig {
	
	
	

	
	@Bean
	public marketingBot telegramBot(@Value("${bot.name}") String botName, @Value("${bot.Token}") String botToken) {
		
		marketingBot bot=new marketingBot(botName, botToken);
		try {
			TelegramBotsApi	telegrambot=new TelegramBotsApi(DefaultBotSession.class);
			telegrambot.registerBot(bot);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("Error accurred in registering",e);
		}
		return bot;
	}

}
