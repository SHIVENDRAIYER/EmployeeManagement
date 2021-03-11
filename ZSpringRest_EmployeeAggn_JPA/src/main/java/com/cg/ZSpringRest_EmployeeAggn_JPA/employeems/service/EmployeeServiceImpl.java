package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.service;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dao.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.exceptions.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;

	@Transactional
	@Override
	public Employee addEmployee(String name, String department) {

		validateName(name);
		validateDepartment(department);
		Employee employee = new Employee(name, department);
		dao.add(employee);
		return employee;
	}

	@Override
	public Employee findById(int id) {

		validateId(id);
		Employee employee = dao.findById(id);
		return employee;
	}

	@Transactional
	@Override
	public Employee updateName(int id, String name) {
		validateName(name);
		Employee employee = findById(id);
		employee.setName(name);
		employee = dao.update(employee);
		return employee;
	}

	@Override
	public List<Employee> findAll() {

		List<Employee> employees = dao.findAll();
		return employees;
	}

	@Transactional
	@Override
	public void removeById(int id) {

		dao.removeById(id);

	}

	public void validateId(int id) {
		if (id < 0) {
			throw new InvalidIdException("id cannot be negative or zero" + id);
		}

	}

	public void validateName(String name) {
		if (name == null || name.isEmpty() || name.trim().isEmpty()) {
			throw new InvalidEmployeeNameException("name is invalid " + name);
		}

	}

	public void validateDepartment(String department) {
		if (department == null || department.isEmpty() || department.trim().isEmpty()) {
			throw new InvalidDepartmentException("department is invalid " + department);
		}

	}
}
