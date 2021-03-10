package com.cg.empmgt.service;

import com.cg.empmgt.beans.Employee;
import java.util.*;

public interface iEmployeeService {

	Employee add(String name, String department);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();


}
