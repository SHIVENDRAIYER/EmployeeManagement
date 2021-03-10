package com.cg.empmgt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.empmgt.beans.Employee;
import com.cg.empmgt.ui.EmployeeUI;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
		
		Employee emp = context.getBean(Employee.class);
		emp.start();
	}

}
