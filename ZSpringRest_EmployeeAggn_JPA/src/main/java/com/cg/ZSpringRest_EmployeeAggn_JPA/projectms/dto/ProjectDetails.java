package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dto;

public class ProjectDetails {

	private int projectId;
	private String projectName;

	public ProjectDetails() {

	}

	public ProjectDetails(int projectId, String projectName) {

		this.projectId = projectId;
		this.projectName = projectName;
	}

	public int getProjectId() {

		return projectId;
	}

	public void setProjectId(int projectId) {

		this.projectId = projectId;
	}

	public String getProjectName() {

		return projectName;
	}

	public void setProjectName(String projectName) {

		this.projectName = projectName;
	}

}
