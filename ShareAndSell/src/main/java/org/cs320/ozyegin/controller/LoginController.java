package org.cs320.ozyegin.controller;

import org.cs320.ozyegin.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String directToLogin() {
		return "loginPage";
	}


	@GetMapping("/")
	public String directToMain() {
		return "mainPage";
	}

	@GetMapping("/register")
	public String directToSignUp() {
		return "signUpPage";
	}


}
