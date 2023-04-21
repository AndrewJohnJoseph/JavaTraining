package com.abstractdp.example;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, double salary) {
		super(name, salary);
	}

	public void paySalary() {
		System.out.println("Paying full-time employee " + name + " salary of " + salary);
	}

}
