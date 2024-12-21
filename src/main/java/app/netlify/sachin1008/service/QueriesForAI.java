package app.netlify.sachin1008.service;

import java.util.List;

import org.springframework.stereotype.Component;

import app.netlify.sachin1008.Entity.Users;


@Component
public interface QueriesForAI {
	
	String genarateKeyWordQuery(List<Users> user);
	String genrateQueryForAI(String url);

}
