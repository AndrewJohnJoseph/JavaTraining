package com.objectpool.example;

public class Employee1 {
	private int id;
    private String name;
    private String email;

    public Employee1() {
        // default constructor
    }

    public Employee1(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
