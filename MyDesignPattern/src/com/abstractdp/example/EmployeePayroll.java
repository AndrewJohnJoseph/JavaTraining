package com.abstractdp.example;

public class EmployeePayroll {
	private EmployeeFactory factory;

	public EmployeePayroll(EmployeeFactory factory) {
		this.factory = factory;
	}

	public void paySalary(String name, double salary) {
		Employee employee = factory.createEmployee(name, salary);
		employee.paySalary();
	}
}
