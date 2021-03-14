package com.vijay.service;


import com.vijay.entity.PhoneBookEntity;

public interface PhoneBookService {

	PhoneBookEntity savePhoneBookEntity(PhoneBookEntity entity);

	PhoneBookEntity findByphoneId(Integer phoneId);

	PhoneBookEntity updatePhoneBookEntity(PhoneBookEntity entity1, Integer phoneId);

	
	

}
