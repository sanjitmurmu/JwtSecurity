package com.security.jwt.learn.JwtSecurityLearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.learn.JwtSecurityLearn.entity.User;
import com.security.jwt.learn.JwtSecurityLearn.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		System.out.println("getting users");
		return userService.getUsers();
	}
	
}
