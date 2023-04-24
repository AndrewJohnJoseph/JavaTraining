package com.iterator.example;

import java.util.List;

public class Employee10Collection {
	private List<Employee10> employees;
	private int position;

	public Employee10Collection(List<Employee10> employees) {
		this.employees = employees;
		this.position = 0;
	}

	public boolean hasNext() {
		if (position < employees.size()) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		Employee10 employee = employees.get(position);
		position++;
		return employee;
	}
}
