package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.util;

import org.springframework.stereotype.Component;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;
import java.util.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dto.*;

@Component
public class ProjectUtil {

	public ProjectDetails toProjectDetails(Project project) {

		ProjectDetails projectDetails = new ProjectDetails(project.getProjectId(), project.getProjectName());
		return projectDetails;
	}

	public List<ProjectDetails> toProjectDetailsList(Collection<Project> projects) {

		List<ProjectDetails> desired = new ArrayList<>();

		for (Project project : projects) {

			ProjectDetails details = toProjectDetails(project);
			desired.add(details);
		}
		return desired;
	}

}
