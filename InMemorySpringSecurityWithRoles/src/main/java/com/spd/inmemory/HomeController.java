package com.spd.inmemory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		System.out.println("WelcomeController");
		return ("<hi>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		System.out.println("WelcomeController user()");
		return ("<hi>Welcome User</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		System.out.println("WelcomeController admin()");
		return ("<hi>Welcome Admin</h1>");
	}
}
