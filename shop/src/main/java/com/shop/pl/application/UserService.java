package com.shop.pl.application;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		user.setIsActive(false);
		user.setActiveKey(UserService.generateKey());
		userRepository.save(user);
	}

	public void setActiveUser(User user) {
		user.setIsActive(true);
		userRepository.save(user);
	}

	private static String generateKey() {
		final String pattern = "qwertyuiopasdfghjklzxcvbnm1234567890";
		Random random = new Random();
		String key = "";
		for (int i = 0; i < 32; i++) {
			key += pattern.charAt(random.nextInt(pattern.length()));
		}
		return key;
	}

}
