package com.vijay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vijay.entity.User;
import com.vijay.repository.UserRepository;
import com.vijay.vo.ResponseTempletVo;
import com.vijay.vo.StudentEntity;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate template;

	
	public User saveUser(User user) {
		
		return repository.save(user);
	}

	
	public ResponseTempletVo getUserWithStudentEntity(Integer userId) {
		ResponseTempletVo templetVo=new ResponseTempletVo();
		User user=repository.findByuserId(userId);
		System.out.println(user);
		StudentEntity entity=template.getForObject("http://localhost:5656/Student/"+user.getStudentId(), StudentEntity.class);
		System.out.println(user.getStudentId());
		
		templetVo.setUser(user);
		templetVo.setEntity(entity);
		
		return templetVo;
	}

}
