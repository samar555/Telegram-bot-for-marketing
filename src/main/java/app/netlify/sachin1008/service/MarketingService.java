package app.netlify.sachin1008.service;

import org.springframework.stereotype.Service;

@Service
public interface MarketingService {
	public void replyToName(String chatid,String message);
	public void setIndustry(String chatid,String message);
	
	public void setBussinessObjective(String chatid,String message);
	public void setWebsite(String chatid,String message);
	public void setSocialMediaPlatform(String chatid,String message);
	public void setPPccampaigns(String chatid,String message);
	public void setReachPeopleCatagory(String chatid,String message);
	public void setLocationDoYouWantToTarget(String chatid,String message);

	
}
