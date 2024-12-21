package app.netlify.sachin1008.service.impl;

import org.springframework.stereotype.Service;

import app.netlify.sachin1008.service.GenAIService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GenAIImpl implements GenAIService{

	@Override
	public String getResponse(String question) {
	var model= OpenAiChatModel.builder().apiKey("demo").modelName(OpenAiChatModelName.GPT_4_O_MINI).build();
	String response=model.generate(question);	
	return response	;
	}

}
