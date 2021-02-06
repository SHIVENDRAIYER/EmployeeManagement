package com.empmgt.entities;

public class Department {

	private String deptId;
	private String deptName;

	public Department() {
		deptId = null;
		deptName = null;
	}

	public Department(String deptId, String deptName)

	{
		this.setDeptId(deptId);
		this.setDeptName(deptName);
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
