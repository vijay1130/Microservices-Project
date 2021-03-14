package com.vijay.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PhoneBookExceptionHandler {
	
	@ExceptionHandler(ExceptionPhoneBook.class)
	public String handlingPhoneBookException() {
		return "error";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String NullPointerException() {
		return "error";
	}

}
