package org.cs320.ozyegin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "loginPage";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
