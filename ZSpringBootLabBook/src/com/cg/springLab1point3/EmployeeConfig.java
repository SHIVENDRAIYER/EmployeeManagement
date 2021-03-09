package com.cg.springLab1point3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:emps.properties")
@ComponentScan("com.cg.springLab1point3")
@Configuration

public class EmployeeConfig {
	
	@Autowired
	private Environment environment;	
		
		@Bean
		public SBU sbu(){
			
			SBU sbu = new SBU();
			
			Employee emp1 = new Employee();
			
			int empId1=environment.getProperty("emp1.id", Integer.class);
			String empName1=environment.getProperty("emp1.name");
			int empSalary1=environment.getProperty("emp1.salary", Integer.class);
			
			emp1.setEmployeeId(empId1);
			emp1.setEmployeeName(empName1);
			emp1.setEmployeeSalary(empSalary1);
			
            Employee emp2 = new Employee();
			
			int empId2=environment.getProperty("emp1.id", Integer.class);
			String empName2=environment.getProperty("emp1.name");
			int empSalary2=environment.getProperty("emp1.salary", Integer.class);
			
			emp2.setEmployeeId(empId2);
			emp2.setEmployeeName(empName2);
			emp2.setEmployeeSalary(empSalary2);
			
			
			
	        List <Employee> list =new ArrayList<>();
			list.add(emp1);
			list.add(emp2);
			
			sbu.setEmplist(list);
			return sbu;
			
		}
	
	
	
	

}
