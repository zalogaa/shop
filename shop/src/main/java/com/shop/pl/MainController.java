package com.shop.pl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showIndex() {

		userService.addUser(new User("adam", "cos@wp.pl", "haslo"));

		Optional<User> u = userService.findUserById((long) 1);
		if (u.isPresent()) {
			System.out.println(u.get().getEmail());
		}
		return "index";
	}

}
