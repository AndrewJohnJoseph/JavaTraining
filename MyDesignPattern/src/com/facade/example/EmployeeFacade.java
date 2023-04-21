package com.facade.example;

public class EmployeeFacade {
	private Employee5 employee;

    public EmployeeFacade(String name, String designation, int salary) {
        employee = new Employee5(name, designation, salary);
    }

    public String getEmployeeDetails() {
        String employeeDetails = "Name: " + employee.getName() + "\nDesignation: " + employee.getDesignation() + "\nSalary: " + employee.getSalary();
        return employeeDetails;
    }

    public int getSalary() {
        return employee.getSalary();
    }

    public void increaseSalary(int amount) {
        int newSalary = employee.getSalary() + amount;
        employee = new Employee5(employee.getName(), employee.getDesignation(), newSalary);
        System.out.println("Salary increased to: " + newSalary);
    }

}
