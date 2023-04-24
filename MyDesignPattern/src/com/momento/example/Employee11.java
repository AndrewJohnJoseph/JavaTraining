package com.momento.example;

public class Employee11 {
	private String name;
    private String designation;
    private double salary;
    
    public Employee11(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public Memento save() {
        return new Memento(name, designation, salary);
    }
    
    public void restore(Memento memento) {
        this.name = memento.getName();
        this.designation = memento.getDesignation();
        this.salary = memento.getSalary();
    }
    
    public static class Memento {
        private String name;
        private String designation;
        private double salary;
        
        public Memento(String name, String designation, double salary) {
            this.name = name;
            this.designation = designation;
            this.salary = salary;
        }
        
        public String getName() {
            return name;
        }
        
        public String getDesignation() {
            return designation;
        }
        
        public double getSalary() {
            return salary;
        }
    }

}
