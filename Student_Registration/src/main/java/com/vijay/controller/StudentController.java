package com.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.entity.StudentEntity;
import com.vijay.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/")
	public StudentEntity SaveStudent(@RequestBody StudentEntity entity) {
	return	service.saveStudent(entity);
		
	}
	
	@GetMapping("/{id}")
    public StudentEntity findStudentEntityById(@PathVariable("id") Integer studentId) {
		
		return service.findBystudentId(studentId); 
    	
    }
}
