package com.cg.springLab1point1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(EmployeeConfig.class);
		context.refresh();

		Employee emp = context.getBean(Employee.class);

		System.out.println("Employee: " + emp.getEmployeeId() + " " + emp.getEmployeeName() + " "
				+ emp.getEmployeeSalary() + " " + emp.getBusinessUnit() + " " + emp.getAge());
		
		context.close();
	}

}
