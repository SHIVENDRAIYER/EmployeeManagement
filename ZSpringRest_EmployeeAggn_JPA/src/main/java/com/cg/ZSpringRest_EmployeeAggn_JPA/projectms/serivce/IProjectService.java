package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.serivce;

import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;

public interface IProjectService {

	Project addProject(String name);

	Project addEmployeeInProject(int projectId, int employeeId);

	Project removeEmployeeFromProject(int projectId, int employeeId);

	Project findById(int projectId);

}
