package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//Adding Request Mapping -->URL
	
	@RequestMapping("/hello")

	public String giveHelloMessage() {
		return"hello";
	}
}
