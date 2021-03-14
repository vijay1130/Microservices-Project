package com.vijay.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.entity.PhoneBookEntity;
import com.vijay.exception.ExceptionPhoneBook;
import com.vijay.repository.PhoneRegistory;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PhoneBookServiceImpl implements PhoneBookService {
	
	@Autowired
	private PhoneRegistory repository;

	@Override
	
	public PhoneBookEntity savePhoneBookEntity(PhoneBookEntity entity) {
		
		try {
		
		PhoneBookEntity phoneBook = repository.save(entity);
	    log.info("Save Phone Book Data");
		return phoneBook;
		}
		catch (Exception e) {
			throw new ExceptionPhoneBook("failed");
		}
	}

	@Override
	public PhoneBookEntity findByphoneId(Integer phoneId) {
		PhoneBookEntity findByphoneId = repository.findByphoneId(phoneId);
		return findByphoneId;
	}

	@Override
	public PhoneBookEntity updatePhoneBookEntity(PhoneBookEntity entity1, Integer phoneId) {
		PhoneBookEntity update = repository.save(entity1);
		return update;
	}

	

	


	
	
	
}
