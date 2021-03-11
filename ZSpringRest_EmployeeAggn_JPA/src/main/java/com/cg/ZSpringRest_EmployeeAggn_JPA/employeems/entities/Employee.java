package com.cg.ZSpringRest_EmployeeAggn_JPA.employeems.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String department;

	@ManyToOne
	private Project project;

	public Employee() {

		this("not initialized", "not initialized");
	}

	public Employee(String name, String department) {

		this.setName(name);
		this.setDepartment(department);
	}

	public Integer getId() {

		return id;

	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDepartment() {

		return department;
	}

	public void setDepartment(String department) {

		this.department = department;
	}

	public Project getProject() {

		return project;
	}

	public void setProject(Project project) {

		this.project = project;
	}

	@Override
	public String toString() {

		String text = "id:" + id + " name-" + name + "-" + department;
		return text;
	}

	@Override
	public int hashCode() {

		return id;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || !(obj instanceof Employee)) {
			return false;
		}

		Employee that = (Employee) obj;
		return this.id == that.id;
	}

}
