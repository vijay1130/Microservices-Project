package com.vijay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.entity.PhoneBookEntity;
import com.vijay.exception.ExceptionPhoneBook;
import com.vijay.service.PhoneBookService;

@RestController
@RequestMapping("/Phone")
public class PhoneBookController {
	
	@Autowired
	private PhoneBookService bookService;
	
	
	@PostMapping("/")
	public PhoneBookEntity savePhoneBookEntity(@RequestBody PhoneBookEntity entity) {
		
		//PhoneBookEntity entity2 = bookService.savePhoneBookEntity(entity);
		
		return bookService.savePhoneBookEntity(entity);
		
		
		
	}
	
	@GetMapping("/{id}")
	public PhoneBookEntity RetrieveData(@PathVariable("id") Integer phoneId){
		PhoneBookEntity phoneBookEntityById = bookService.findByphoneId(phoneId);
		System.out.println(phoneBookEntityById);
		return phoneBookEntityById;
		
		
	}
	
	@PutMapping("/{id}")
	public PhoneBookEntity updatePhoneBook(@RequestBody PhoneBookEntity entity1, @PathVariable("id") Integer phoneId) {
		 PhoneBookEntity phoneid = bookService.findByphoneId(phoneId);
		if(phoneid!=null) {
			PhoneBookEntity BookEntity = bookService.updatePhoneBookEntity(entity1,phoneId);
			return BookEntity;
		}
		else {
			return null;
		}
		
		
	}
	
	@PutMapping("/update")
	public PhoneBookEntity update1PhoneBook(@RequestBody PhoneBookEntity entity2) {
		
		PhoneBookEntity phoneBookEntity = bookService.savePhoneBookEntity(entity2);
		return phoneBookEntity;
		
		
		
		
		
	}
	
	
	

}
