package com.singleton.console;

import com.builder.example.MyUser;
import com.prototype.example.Employee;
import com.prototype.example.PrototypeFactory;
import com.singleton.example.MySingleton;

public class DesignPatternMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Singleton Design Pattern
		MySingleton objSingleton = MySingleton.getInstance();
		objSingleton.setMessage("Hello World!!!");
		System.out.println(objSingleton.getMessage());

		//Prototype Design Pattern
		// Create and register employee prototypes
        Employee fullTimeEmployee = new Employee(1, "Ram", "Engineering");
        PrototypeFactory.addEmployee("FullTimeEmployee", fullTimeEmployee);

        Employee partTimeEmployee = new Employee(2, "Shiva", "Marketing");
        PrototypeFactory.addEmployee("PartTimeEmployee", partTimeEmployee);

        // Clone and modify employee prototypes
        Employee clonedFullTimeEmployee = PrototypeFactory.getEmployee("FullTimeEmployee");
        clonedFullTimeEmployee.setName("Ramu");

        Employee clonedPartTimeEmployee = PrototypeFactory.getEmployee("PartTimeEmployee");
        clonedPartTimeEmployee.setDepartment("Sales");

        // Print original and cloned employees
        System.out.println(fullTimeEmployee);
        System.out.println(fullTimeEmployee.hashCode());
        System.out.println(clonedFullTimeEmployee);
        System.out.println(clonedFullTimeEmployee.hashCode());

        System.out.println(partTimeEmployee);
        System.out.println(partTimeEmployee.hashCode());
        System.out.println(clonedPartTimeEmployee);    
        System.out.println(clonedPartTimeEmployee.hashCode());
        
        //Builder Design Pattern
        
        MyUser user = new MyUser.Builder()
                .firstName("Andrew")
                .lastName("John")
                .email("andrew.sajj@gmail.com")
                .phone("9840718222")
                .build();
    	System.out.println(user);
	}

}
