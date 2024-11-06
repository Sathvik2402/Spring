package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/App")
public class Messenger {

	@GetMapping("/send")
	public String transfer() {
		return "Message sent";
	}
}
