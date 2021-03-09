package com.cg.springBootLab1point1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
		Employee emp = context.getBean(Employee.class);
		System.out.print(emp);
	}

}
