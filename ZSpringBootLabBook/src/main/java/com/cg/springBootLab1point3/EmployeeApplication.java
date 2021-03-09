package com.cg.springBootLab1point3;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		
		
ConfigurableApplicationContext context=SpringApplication.run(EmployeeApplication.class, args);
		
		Employee e1=context.getBean(Employee.class);
		e1.setEmployeeId(12345);
		e1.setEmployeeName("Harriet");
		e1.setEmployeeSalary(100000);
		
		Employee e2=context.getBean(Employee.class);
		e2.setEmployeeId(27);
		e2.setEmployeeName("Shivendra");
		e2.setEmployeeSalary(380000.0);
		
		SBU sbu=context.getBean(SBU.class);
		List<Employee>list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		

		System.out.println(sbu);
	
		for(Employee e :list)
		{
			System.out.println(e);
		}
		
		
		
		context.close();
		

	}

}
