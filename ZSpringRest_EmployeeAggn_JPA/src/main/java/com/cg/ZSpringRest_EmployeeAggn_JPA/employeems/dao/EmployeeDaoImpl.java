package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dao;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import java.util.*;


import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.exceptions.*;


import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void add(Employee employee) {

		entitymanager.persist(employee);

	}

	@Override
	public Employee findById(int id) {

		Employee employee = entitymanager.find(Employee.class, id);

		if (employee == null) {

			throw new EmployeeNotFoundException(" employee doesn't exist for id=" + id);
		}

		return employee;

	}

	@Override
	public Employee update(Employee employee) {

		entitymanager.merge(employee);
		return employee;
	}

	@Override
	public void removeById(int id) {

		Employee employee = findById(id);
		entitymanager.remove(employee);
	}

	@Override
	public List<Employee> findAll() {

		String ql = "from Employee";

		TypedQuery<Employee> query = entitymanager.createQuery(ql, Employee.class);

		List<Employee> employee = query.getResultList();

		return employee;

	}

}
