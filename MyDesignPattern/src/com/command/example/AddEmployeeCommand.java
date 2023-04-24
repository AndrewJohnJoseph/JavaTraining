package com.command.example;

public class AddEmployeeCommand implements Command {
	private Employee8 employee;

	 public AddEmployeeCommand(Employee8 employee) {
	     this.employee = employee;
	 }


	@Override
	public void execute() {
		System.out.println("Adding employee " + employee.getName() + " to the system...");
		
	}

}
