package com.security.jwt.learn.JwtSecurityLearn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.jwt.learn.JwtSecurityLearn.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	Optional<User> findByEmail(String email);

}
