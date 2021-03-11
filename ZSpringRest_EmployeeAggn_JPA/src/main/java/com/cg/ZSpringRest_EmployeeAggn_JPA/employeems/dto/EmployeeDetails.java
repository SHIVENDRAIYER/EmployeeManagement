package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.dto;

public class EmployeeDetails {

	private int id;
	private String name;
	private String department;
	private int projectId;
	private String projectName;

	public EmployeeDetails() {

	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String projectName) {

		this.projectName = projectName;
	}

	public String getDepartment() {

		return department;
	}

	public void setDepartment(String department) {

		this.department = department;
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
