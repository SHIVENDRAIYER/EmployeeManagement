package com.cg.springLab1point2;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(EmployeeConfig.class);
		context.refresh();

		Employee employee = context.getBean(Employee.class);
		

		System.out.println("EmpId: " + employee.getEmployeeId() + "EmpName: " + employee.getEmployeeName()
				+ "EmpSalary: " + employee.getEmployeeSalary() + "sbuId: " + employee.getSbuDetails().getSbuId() + "sbuName: "
				+ employee.getSbuDetails().getSbuName() + "sbuHead: " + employee.getSbuDetails().getSbuHead());

		context.close();

	}

}
