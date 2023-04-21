package com.abstractdp.example;

public class PartTimeEmployee extends Employee{
	public PartTimeEmployee(String name, double salary) {
		super(name, salary);
	}

	public void paySalary() {
		System.out.println("Paying part-time employee " + name + " salary of " + salary);
	}

}
