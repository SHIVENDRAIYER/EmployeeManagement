package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.serivce;

import javax.transaction.Transactional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dao.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dao.*;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private IProjectDao projectDao;

	@Autowired
	private IEmployeeDao employeeDao;

	@Transactional
	@Override
	public Project addProject(String projectName) {

		Project project = new Project();
		project.setProjectName(projectName);
		project = projectDao.add(project);
		return project;
	}

	@Override
	public Project findById(int projectId) {

		Project project = projectDao.findById(projectId);
		return project;
	}

	@Transactional
	@Override
	public Project addEmployeeInProject(int projectId, int employeeId) {

		Project project = findById(projectId);
		Set<Employee> employees = project.getEmployees();

		if (employees == null) {

			employees = new HashSet<>();
			project.setEmployees(employees);
		}

		Employee employee = employeeDao.findById(employeeId);
		employees.add(employee);
		project = projectDao.update(project);
		employee.setProject(project);
		employeeDao.update(employee);
		return project;
	}

	@Transactional
	@Override
	public Project removeEmployeeFromProject(int projectId, int employeeId) {

		Project project = findById(projectId);
		Set<Employee> employees = project.getEmployees();

		if (employees == null) {

			return project;
		}
		Employee employee = employeeDao.findById(employeeId);
		employees.remove(employee);
		return project;
	}

}
