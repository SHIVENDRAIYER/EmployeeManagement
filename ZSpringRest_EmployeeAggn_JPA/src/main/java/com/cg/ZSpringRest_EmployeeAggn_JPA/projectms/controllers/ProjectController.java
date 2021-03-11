package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dto.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.serivce.*;

@RequestMapping("/projects")
@RestController
public class ProjectController {

	@Autowired
	private IProjectService projectService;

	@Autowired
	private ProjectUtil projectUtil;

	@PostMapping("/add")
	public ProjectDetails addProject(@RequestBody AddProjectRequest requestData) {

		Project project = projectService.addProject(requestData.getProjectName());
		ProjectDetails details = projectUtil.toProjectDetails(project);
		return details;
	}

	@GetMapping("/byid/{id}")
	public ProjectDetails fetchProject(@PathVariable("id") int id) {

		Project project = projectService.findById(id);
		ProjectDetails details = projectUtil.toProjectDetails(project);
		return details;
	}

	@PutMapping("/students/add")
	public ProjectDetails addEmployeeToProject(@RequestBody AddEmployeeToProjectRequest requestData) {

		Project project = projectService.addEmployeeInProject(requestData.getProjectId(), requestData.getEmployeeId());
		ProjectDetails details = projectUtil.toProjectDetails(project);
		return details;
	}

}
