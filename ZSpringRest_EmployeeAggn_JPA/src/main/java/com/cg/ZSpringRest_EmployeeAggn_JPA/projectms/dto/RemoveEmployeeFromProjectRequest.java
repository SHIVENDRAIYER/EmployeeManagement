package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dto;

public class RemoveEmployeeFromProjectRequest {

	private int employeeId;
	private int projectId;

	public int getEmployeeId() {

		return employeeId;
	}

	public void setEmployeeId(int employeeId) {

		this.employeeId = employeeId;
	}

	public int getProjectId() {

		return projectId;
	}

	public void setProjectId(int projectId) {

		this.projectId = projectId;
	}

}
