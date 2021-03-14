package com.vijay.service;

import com.vijay.entity.LibraryEntity;
import com.vijay.vo.RestTempletVo;

public interface LibraryService {
	
	public LibraryEntity saveLibrary(LibraryEntity entity);
	
	
	
	public RestTempletVo getLibararyDataWithPhoneBookData( Integer libraryId);

}
