package com.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.entity.LibraryEntity;
import com.vijay.service.LibraryService;
import com.vijay.vo.RestTempletVo;

@RestController
@RequestMapping("/library")
public class LibraryController {
	private LibraryEntity saveLibrary;
	
	@Autowired
	private LibraryService service;

	private RestTempletVo libararyDataWithPhoneBookData;
	
	
	
	@PostMapping("/save")
	public LibraryEntity InsertLibraryEntity(@RequestBody LibraryEntity entity) {
		saveLibrary = service.saveLibrary(entity);
		return saveLibrary;
	}
	
	
	@GetMapping("/{libraryId}")
	public RestTempletVo Retrieve(@PathVariable Integer libraryId) {
		
		libararyDataWithPhoneBookData = service.getLibararyDataWithPhoneBookData(libraryId);
		
		return libararyDataWithPhoneBookData;
		
	}

}
