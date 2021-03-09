package com.cg.springBootLab1point2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);

		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee details");
		System.out.println();
		System.out.println(employee);
		System.out.println(employee.getSbuDetails());

		context.close();

	}

}
