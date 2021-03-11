package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.service;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import java.util.*;

public interface IEmployeeService {

	Employee addEmployee(String name, String department);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();
	
	Employee updateName(int id,String name);


}
