package app.netlify.sachin1008.service;

import org.springframework.stereotype.Component;

@Component
public interface WebScraping {
	
	String scrapingWeb(String url);

}
