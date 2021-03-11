package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dao;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import java.util.List;

public interface IEmployeeDao {

	void add(Employee employee);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();

	Employee update(Employee employee);

}
