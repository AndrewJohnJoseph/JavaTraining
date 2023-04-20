package com.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	private static Map<String, Employee> employeeRegistry = new HashMap<>();

    public static void addEmployee(String key, Employee employee) {
        employeeRegistry.put(key, employee);
    }

    public static Employee getEmployee(String key) throws CloneNotSupportedException {
        return employeeRegistry.get(key).clone();
    }
}
