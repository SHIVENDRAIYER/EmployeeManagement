package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeMain admin = new EmployeeMain();
		admin.job();
	}

	public void job() {
		Employee stores[] = new Employee[4];

		Department department1 = new Department("1", "Product");
		Department department2 = new Department("2", "HR");
		Department department3 = new Department("3", "Engineer");
		Department department4 = new Department("4", "Analytical");

		Developer developer1 = new Developer(13, "Shivendra", department1, "Java");
		Developer developer2 = new Developer(05, "Vishwanathan", department2, "Python");

		Tester tester1 = new Tester(27, "Iyer", department3, "Selenium");
		Tester tester2 = new Tester(47, "Ashish", department4, "Ranorex");

		stores[0] = developer1;
		stores[1] = developer2;
		stores[2] = tester1;
		stores[3] = tester2;

		for (int i = 0; i < stores.length; i++) {
			Employee detail = stores[i];

			if (detail instanceof Developer) {
				Developer developer = (Developer) detail;
				record(developer);

			}

			if (detail instanceof Tester) {
				Tester tester = (Tester) detail;
				record(tester);
			}
		}

	}

	void baseRecord(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department = employee.getDepartment();
		String deptId = department.getDeptId();
		String deptName = department.getDeptName();

		System.out.println("Employee: " + id + " " + name + " " + department);
		System.out.println("Department: " + deptId + " " + deptName);

	}

	void record(Developer employee) {
		baseRecord(employee);

		String language = employee.getLanguage();

		System.out.println("Language: " + language);

	}

	void record(Tester employee) {
		baseRecord(employee);

		String tools = employee.getTools();

		System.out.println("Tools: " + tools);
	}

}
