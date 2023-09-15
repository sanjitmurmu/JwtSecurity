package com.security.jwt.learn.JwtSecurityLearn.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.jwt.learn.JwtSecurityLearn.entity.User;
import com.security.jwt.learn.JwtSecurityLearn.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return user;
	}

}
