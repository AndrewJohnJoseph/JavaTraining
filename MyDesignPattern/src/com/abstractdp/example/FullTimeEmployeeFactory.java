package com.abstractdp.example;

public class FullTimeEmployeeFactory implements EmployeeFactory {
	public Employee createEmployee(String name, double salary) {
		return new FullTimeEmployee(name, salary);
	}
}
