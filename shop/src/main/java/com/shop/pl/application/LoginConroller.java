package com.shop.pl.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginConroller {

	@GetMapping("/login")
	public String showLoginPage() {

		return "login";
	}
}
