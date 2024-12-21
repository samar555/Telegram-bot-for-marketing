package app.netlify.sachin1008.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import app.netlify.sachin1008.Entity.Users;
import app.netlify.sachin1008.service.QueriesForAI;


@Service
public class QueriesForAIImpl implements QueriesForAI {

	@Override
	public String genarateKeyWordQuery(List<Users> user) {
		String industry="Not Applicable",BussinessObjective="Not Applicable",TargetAudience="Not Applicable",Location="Not Applicable";
		String query="";
		for(Users u:user) {
			if(u.getQuestion().trim().equalsIgnoreCase("Industry")) {
				industry=u.getAnswer();
			}
			else if(u.getQuestion().trim().equalsIgnoreCase("Objective")){
				BussinessObjective=u.getAnswer();
			}else if (u.getQuestion().trim().equalsIgnoreCase("Who are you trying to reach")) {
				TargetAudience=u.getAnswer();
			}else if(u.getQuestion().trim().equalsIgnoreCase("location")) {
				Location=u.getAnswer();
			}
		}
		 query="Generate a list of highly relevant advertisement keywords for a business. Consider the following details:\r\n"
					+ "\r\n"
					+ "Industry of the business: "+industry+"\r\n"
					+ "Business objective: "+BussinessObjective+"\r\n"
					+ "Target audience: "+TargetAudience+"\r\n"
					+ "Location of advertisement targeting: "+Location+"\r\n"
					+ "Ensure the keywords align with the business's goals, audience preferences, and regional relevance. Provide a mix of broad, specific, and long-tail keywords to maximize engagement and effectiveness. and Not Applicable means not to add for Genrate keyword";	
		
		return query;
	}

	@Override
	public String genrateQueryForAI(String url) {
		String query="";
		query+=url+" in 100-200 words only";
		return query;
	}

}
