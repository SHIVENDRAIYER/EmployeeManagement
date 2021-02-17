package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.*;

public class EmployeeDaoImpl implements iEmployeeDao {

	
	private int generateId=0;
	public int generateId() {
		generateId++;
		return generateId;
	}

	@Override
	public void add(Employee employee) {

		Map<Integer, Employee> market = MarketHolder.market;

		int id = generateId();
		employee.setId(id);
		market.put(id, employee);
	}

	@Override
	public Employee findById(int id) {

		Map<Integer, Employee> market = MarketHolder.market;

		Employee employee = market.get(id);

		return employee;

	}

	@Override
	public void removeById(int id) {

		Map<Integer, Employee> market = MarketHolder.market;

		market.remove(id);
	}

	@Override
	public List<Employee> findAll() {

		Map<Integer, Employee> market = MarketHolder.market;

		Collection<Employee> employees = market.values();

		List<Employee> list = new ArrayList<>(employees);

		return list;

	}

}
