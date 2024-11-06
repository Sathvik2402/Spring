package com.example.demo.controller;

import java.util.List;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ChatController {

	private ChatClient chatClient;
	
	public ChatController(ChatClient.Builder chatClient) {
		this.chatClient=chatClient.build();
	}
	
	@GetMapping("/start")
	public List<Generation> generate() {
		String message="define framework";
		PromptTemplate pt=new PromptTemplate(message);
		Prompt prompt = pt.create();
		ChatClient.ChatClientRequest.CallPromptResponseSpec rs=chatClient.prompt(prompt).call();
		return rs.chatResponse().getResults();
	}
	
}
