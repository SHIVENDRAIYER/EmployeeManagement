package com.cg.springLab1point3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {

	@Value("{$emp.Id}")
	private int employeeId;

	@Value("${emp.Name}")
	private String employeeName;

	@Value("${emp.Salary}")
	private double salary;

	

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



}
