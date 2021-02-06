package com.empmgt.entities;

public class Developer extends Employee {

	private String language;

	public Developer() {
		language = null;
	}

	public Developer(int id, String name, Department department, String language) {

		super(id, name, department);
		this.setLanguage(language);
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}