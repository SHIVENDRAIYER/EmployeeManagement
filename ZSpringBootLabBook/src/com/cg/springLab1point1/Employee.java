package com.cg.springLab1point1;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("$(emp.Id)")
	private int employeeId;
	
	@Value("$(emp.Name)")
	private String employeeName;
	
	@Value("$(emp.Salary)")
	private double salary;
	
	@Value("$(emp.BusinessUnit)")
	private String businessUnit;
	
	@Value("$(emp.Age)")
	private int age;
	
	
	
	
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		
		this.employeeName = employeeName;
	}
	
	public double getEmployeeSalary() {
		
		return salary;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		
		this.salary = employeeSalary;
	}
	
	public String getBusinessUnit() {
		
		return businessUnit;
	}
	
	public void setBusinessUnit(String businessUnit) {
		
		this.businessUnit = businessUnit;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	
	public void displayEmployeeInfo() {
		
		System.out.println("Employee details: " + employeeId + " " + employeeName + " " +  salary + " " +  businessUnit + " " + age);
	}
	
	
	
	
	

}
