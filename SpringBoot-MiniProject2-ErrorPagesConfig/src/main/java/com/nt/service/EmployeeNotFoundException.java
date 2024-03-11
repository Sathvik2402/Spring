package com.nt.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.BAD_GATEWAY)
public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException() {
	super();
	}
	public EmployeeNotFoundException(String msg) {
		super(msg);
		}
	
}
