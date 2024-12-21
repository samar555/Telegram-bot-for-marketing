package app.netlify.sachin1008.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@Component
public interface OptionService {
	
	InlineKeyboardMarkup getOptionIndustriesBussiness();
	InlineKeyboardMarkup getOptionBussinessObjective(String Bussiness);
	InlineKeyboardMarkup getOptionCategory();
	InlineKeyboardMarkup getOptionLocation();
	InlineKeyboardMarkup getOptionScrapingAndAI();
	

}
