package com.cognizant.greet_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
	@GetMapping("/greet")
	public String sayHello() {
		return "Hello World!!";
	}
}