package com.vijay.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vijay.entity.LibraryEntity;
import com.vijay.repository.LibraryRepository;
import com.vijay.vo.PhoneBookEntity;
import com.vijay.vo.RestTempletVo;

@Service
public class LibraryServiceImpl implements LibraryService {
	private LibraryEntity save;
	
	@Autowired
	private LibraryRepository repositoty;
	
	@Autowired
	private RestTemplate templet;
	

	@Override
	public LibraryEntity saveLibrary(LibraryEntity entity) {
		save = repositoty.save(entity);
		return save;
	}

	  
	
	@Override
	public RestTempletVo getLibararyDataWithPhoneBookData( Integer libraryId) {
		
		RestTempletVo vo=new RestTempletVo();
		
		LibraryEntity libEntity=repositoty.findBylibraryId(libraryId);
		PhoneBookEntity bookEntity=templet.getForObject("http://localhost:3333/Phone/"+libEntity.getPhoneId(), PhoneBookEntity.class);
		
		vo.setLibrary(libEntity);
		vo.setPhone(bookEntity);
		return vo;
		
	}
	
	
	
	

}
