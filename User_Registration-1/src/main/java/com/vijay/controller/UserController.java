package com.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vijay.entity.User;
import com.vijay.service.UserService;
import com.vijay.vo.ResponseTempletVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Insude SaveUser");
		return service.saveUser(user);
		
		
	}
	
	public ResponseTempletVo getUserWithStudentEntity(Integer userId) {
		return service.getUserWithStudentEntity(userId);
		
	}
	
	

}
