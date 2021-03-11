package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.util;

import java.util.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;
import org.springframework.stereotype.Component;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dto.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;



@Component
public class EmployeeUtil {

	public EmployeeDetails toDetails(Employee employee) {

		EmployeeDetails details = new EmployeeDetails();

		details.setId(employee.getId());
		details.setName(employee.getName());
		details.setDepartment(employee.getDepartment());

		Project project = employee.getProject();

		if (project != null) {

			details.setProjectId(project.getProjectId());
			details.setProjectName(project.getProjectName());
		}
		return details;
	}

	public List<EmployeeDetails> toDetailsList(Collection<Employee> employees) {

		List<EmployeeDetails> desired = new ArrayList<>();

		for (Employee employee : employees) {

			EmployeeDetails details = toDetails(employee);
			desired.add(details);
		}
		return desired;

	}

}
