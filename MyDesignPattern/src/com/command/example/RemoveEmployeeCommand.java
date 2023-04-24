package com.command.example;

public class RemoveEmployeeCommand implements Command {
	
	private Employee8 employee;

    public RemoveEmployeeCommand(Employee8 employee) {
        this.employee = employee;
    }


	@Override
	public void execute() {
		System.out.println("Removing employee " + employee.getName() + " from the system...");
	}

}
