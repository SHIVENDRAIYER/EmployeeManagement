package com.cg.empmgt.service;

import com.cg.empmgt.beans.Employee;
import java.util.*;

public interface IEmployeeService {

	Employee addEmployee(String name, String department);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();
	
	Employee updateName(int id,String name);


}
