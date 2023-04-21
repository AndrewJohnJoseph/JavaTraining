package com.abstractdp.example;

public class PartTimeEmployeeFactory implements EmployeeFactory{
	public Employee createEmployee(String name, double salary) {
		return new PartTimeEmployee(name, salary);
	}
}
