package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities;

import com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Project {

	@GeneratedValue
	@Id
	private Integer projectId;
	private String projectName;

	@OneToMany(mappedBy = "project")
	private Set<Employee> employees;

	public int getProjectId() {

		return projectId;
	}

	public void setCourseId(int projectId) {

		this.projectId = projectId;
	}

	public String getProjectName() {

		return projectName;
	}

	public void setProjectName(String projectName) {

		this.projectName = projectName;
	}

	public Set<Employee> getEmployees() {

		return employees;
	}

	public void setEmployees(Set<Employee> employees) {

		this.employees = employees;
	}

	@Override
	public String toString() {

		return projectId + " " + projectName;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Project project = (Project) o;
		return projectId == project.projectId;
	}

	@Override
	public int hashCode() {

		return Objects.hash(projectId);
	}

}
