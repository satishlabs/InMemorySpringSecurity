package com.spd.inmemory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String Home() {
		System.out.println("WelcomeController");
		return "Welcome";
	}
}
