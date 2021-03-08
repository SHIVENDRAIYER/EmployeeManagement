package com.cg.springLab1point3;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(EmployeeConfig.class);
		context.refresh();

		SBU sbu = context.getBean(SBU.class);
		
		System.out.println("SbuCode: " + sbu.getSbuCode() + "SbuName: " + sbu.getSbuName()+ "SbuHead: "
				+ sbu.getSbuHead());
		
		List<Employee> empLists = sbu.getEmplist();
		
		empLists.stream().forEach(emp-> System.out.println("Employee: " + emp.getEmployeeId() + emp.getEmployeeName() + emp.getEmployeeSalary()));

		
		context.close();

	}

}
