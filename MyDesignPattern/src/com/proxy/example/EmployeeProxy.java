package com.proxy.example;

public class EmployeeProxy implements Employee6 {
	private final String name;
    private RealEmployee realEmployee;

    public EmployeeProxy(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        if (realEmployee == null) {
            realEmployee = new RealEmployee(name);
        }
        realEmployee.work();
    }

}
