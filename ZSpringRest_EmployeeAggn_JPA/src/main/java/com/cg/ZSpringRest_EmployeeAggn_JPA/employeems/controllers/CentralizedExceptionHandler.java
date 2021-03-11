package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.controllers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestControllerAdvice
public class CentralizedExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleStudentNotFound(EmployeeNotFoundException e) {

		return e.getMessage();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidEmployeeNameException.class)
	public String handleInvalidName(InvalidEmployeeNameException e) {

		return e.getMessage();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidDepartmentException.class)
	public String handleInvalidScore(InvalidDepartmentException e) {

		return e.getMessage();
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String handleCatchAll(Exception e) {

		return e.getMessage();
	}

}
