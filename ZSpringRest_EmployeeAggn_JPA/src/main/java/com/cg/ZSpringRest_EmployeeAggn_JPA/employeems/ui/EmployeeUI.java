package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.ui;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.exceptions.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.service.*;

@Component
public class EmployeeUI {

	@Autowired
	private IEmployeeService service;

	public void start() {
		try {
			Employee shivendra = service.addEmployee("shivendra", "ece");
			display(shivendra);

			Employee vishy = service.addEmployee("vishy", "mech");
			display(vishy);

			Employee iyer = service.addEmployee("iyer", "agri");
			display(iyer);

			Employee fetchedEmployee = service.findById(shivendra.getId());
			System.out.println("displaying fetched student for id=" + shivendra.getId() + " ");
			display(fetchedEmployee);

			int inputId = 3;
			service.removeById(inputId);

			System.out.println("\n***displaying all employees***");
			List<Employee> list = service.findAll();
			displayAll(list);

		}

		catch (InvalidIdException e) {

			System.out.println(e.getMessage());

		}

		catch (InvalidEmployeeNameException e) {

			System.out.println(e.getMessage());

		}

		catch (InvalidDepartmentException e) {

			System.out.println(e.getMessage());

		}

		catch (EmployeeNotFoundException e) {

			System.out.println(e.getMessage());
		}

		catch (Exception e) {

			System.out.println("something went wrong");

		}

	}

	public void displayAll(Collection<Employee> employees) {
		for (Employee employee : employees) {
			display(employee);
		}
	}

	public void display(Employee employee) {
		System.out.println(employee.getId() + "-" + employee.getName() + "-" + "-" + employee.getDepartment());
	}

}
