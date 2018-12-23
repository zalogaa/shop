package com.shop.pl.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showIndex(Model model) {

		User u = new User();
		u.setName("test");
		userService.addUser(u);
		model.addAttribute("hello", "przykladowa wiadomosc");
		return "index";
	}
}