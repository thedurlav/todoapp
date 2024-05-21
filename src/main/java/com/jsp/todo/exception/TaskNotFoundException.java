package com.jsp.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TaskNotFoundException extends Exception {

	public TaskNotFoundException(String string) {
		super(string);
	}

}
