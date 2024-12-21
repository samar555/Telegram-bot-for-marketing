package app.netlify.sachin1008.service;

import org.springframework.stereotype.Component;

import app.netlify.sachin1008.Entity.Users;

@Component
public interface UserService {
	Users saveUser(Users user);
	String deleteUser(String chatId);
	
	

}
