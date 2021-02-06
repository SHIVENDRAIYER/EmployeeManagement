package com.empmgt.entities;

public class Tester extends Employee {

	private String tools;

	public Tester() {
		tools = null;
	}

	public Tester(int id, String name, Department department, String tools) {
		super(id, name, department);
		this.setTools(tools);
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

}
