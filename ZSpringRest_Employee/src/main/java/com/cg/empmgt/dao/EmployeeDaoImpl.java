package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.*;

import javax.annotation.PostConstruct;
import com.cg.empmgt.exceptions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private MarketHolder marketHolder;

	private Map<Integer, Employee> market;

	@PostConstruct
	public void afterInit() {
		market = marketHolder.getMarket();
	}

	private int generateId = 0;

	public int generateId() {
		generateId++;
		return generateId;
	}

	@Override
	public void add(Employee employee) {

		int id = generateId();
		employee.setId(id);
		market.put(id, employee);
	}

	@Override
	public Employee findById(int id) {

		if(!market.containsKey(id)) {
			throw new EmployeeNotFoundException(" employee doesn't exist for id="+id);
		}
		Employee employee = market.get(id);

		return employee;

	}

	@Override
	public Employee update(Employee employee) {
		
		market.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public void removeById(int id) {

		market.remove(id);
	}

	@Override
	public List<Employee> findAll() {

		Collection<Employee> employees = market.values();

		List<Employee> list = new ArrayList<>(employees);

		return list;

	}

}
