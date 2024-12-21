package app.netlify.sachin1008.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.netlify.sachin1008.Entity.Users;
import app.netlify.sachin1008.Repository.userRepo;
import app.netlify.sachin1008.service.UserService;
import jakarta.transaction.Transactional;



@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private userRepo UserRepo;

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		return  UserRepo.save(user);
		
	}

	@Override
	public String deleteUser(String chatId) {
		
		 return UserRepo.deleteByChatId(chatId);
	}


	
	

}
