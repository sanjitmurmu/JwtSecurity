package com.security.jwt.learn.JwtSecurityLearn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.security.jwt.learn.JwtSecurityLearn.model.User;

@Service
public class UserService {
	
	List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"sanjit","sanjit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Arka","arksanjit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Gaurav","gaurav@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Jishnu","jishnu@gmail.com"));

	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
