package com.adapter.example;

public class EmployeeAdapter implements Person{
	private Employee3 employee;

    public EmployeeAdapter(Employee3 employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return employee.getFirstName() + " " + employee.getLastName();
    }

    @Override
    public int getAge() {
        return employee.getAge();
    }

}
