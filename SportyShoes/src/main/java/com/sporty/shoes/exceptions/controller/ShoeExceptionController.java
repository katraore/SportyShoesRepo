package com.sporty.shoes.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sporty.shoes.exceptions.ShoeNotFoundException;

@ControllerAdvice
public class ShoeExceptionController {
	
	@ExceptionHandler(value = ShoeNotFoundException.class)
	public ResponseEntity<Object> exception(ShoeNotFoundException exception)
	{
		return new ResponseEntity<Object>("Request Not Found", HttpStatus.NOT_FOUND);
		
	}

}
