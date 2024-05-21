package com.jsp.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(TaskNotFoundException.class)
	public ResponseEntity<String> handleTaskNotFoundException(TaskNotFoundException exception) {
		return new ResponseEntity<>("Task Not Found : "+exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllException(Exception exception) {
		return new ResponseEntity<>("Some Exception Occured : "+exception.getMessage(),HttpStatus.FORBIDDEN);
	}
}
