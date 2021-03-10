package com.cg.empmgt.controllers;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.empmgt.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestControllerAdvice
public class CentralizedExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleStudentNotFound(EmployeeNotFoundException e){
		
        return  e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidEmployeeNameException.class)
    public  String handleInvalidName(InvalidEmployeeNameException e){
    	
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidDepartmentException.class)
    public String handleInvalidScore(InvalidDepartmentException e){
    	
        return e.getMessage();
    }


}
