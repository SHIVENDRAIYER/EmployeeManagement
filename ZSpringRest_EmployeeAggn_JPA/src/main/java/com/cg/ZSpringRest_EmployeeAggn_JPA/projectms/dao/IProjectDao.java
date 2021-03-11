package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dao;

import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;

public interface IProjectDao {

	Project add(Project project);

	Project findById(int projectId);

	Project update(Project project);

}
