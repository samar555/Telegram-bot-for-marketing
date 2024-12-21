package app.netlify.sachin1008;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.netlify.sachin1008.Entity.Users;
import app.netlify.sachin1008.Repository.userRepo;

@SpringBootApplication
public class TelegramBotsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TelegramBotsApplication.class, args);
		
		
		
	}

}
