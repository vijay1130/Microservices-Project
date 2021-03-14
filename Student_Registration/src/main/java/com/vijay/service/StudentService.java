package com.vijay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vijay.entity.StudentEntity;
import com.vijay.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentEntity saveStudent(StudentEntity entity) {
		StudentEntity save = repository.save(entity);
		return save;
	}

	

	public StudentEntity findBystudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return repository.findBystudentId(studentId);
	}

     
	

	
	
	
}
