package com.shop.pl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		userRepository.save(user);
	}

	public Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}
}
