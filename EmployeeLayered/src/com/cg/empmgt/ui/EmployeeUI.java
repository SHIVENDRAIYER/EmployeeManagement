package com.cg.empmgt.ui;

import java.util.*;

import com.cg.empmgt.beans.*;
import com.cg.empmgt.exceptions.*;
import com.cg.empmgt.service.*;

public class EmployeeUI {

	private iEmployeeService service = new EmployeeServiceImpl();

	public static void main(String[] args) {
		EmployeeUI admin = new EmployeeUI();
		admin.start();
	}

	public void start() {
		try {
			Employee shivendra = service.add("shivendra", "ece");
			display(shivendra);

			Employee vishy = service.add("vishy", "mech");
			display(vishy);

			Employee iyer = service.add("iyer", "agri");
			display(iyer);


			Employee fetchedEmployee = service.findById(shivendra.getId());
			System.out.println("displaying fetched student for id=" + shivendra.getId() + " ");
			display(fetchedEmployee);

			int inputId=3;
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

		catch (NameGreaterThan10Exception e) {

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
