package com.objectpool.example;

import java.util.HashSet;
import java.util.Set;

public class EmployeePool {
	private static EmployeePool instance;
    private Set<Employee1> employees;
    private int poolSize;

    private EmployeePool() {
        employees = new HashSet<>();
        poolSize = 3;
    }

    public static synchronized EmployeePool getInstance() {
        if (instance == null) {
            instance = new EmployeePool();
        }
        return instance;
    }

    public synchronized Employee1 acquire() {
        if (employees.isEmpty()) {
            return new Employee1();
        }
        Employee1 e = employees.iterator().next();
        employees.remove(e);
        return e;
    }

    public synchronized void release(Employee1 e) {
        if (employees.size() < poolSize) {
            employees.add(e);
        }
    }
}
