package com.singleton.console;

import com.abstractdp.example.EmployeeFactory;
import com.adapter.example.Employee3;
import com.adapter.example.EmployeeAdapter;
import com.adapter.example.Person;
import com.bridge.example.Abstraction;
import com.bridge.example.Implementor;
import com.bridge.example.Radio;
import com.bridge.example.RemoteControl;
import com.bridge.example.TV;
import com.bridge.example.VoiceController;

import java.util.List;

import com.abstractdp.activity.PepperoniPizzaFactory2;
import com.abstractdp.activity.PizzaFactory2;
import com.abstractdp.activity.PizzaPreparation;
import com.abstractdp.activity.VeggiePizzaFactory2;
import com.abstractdp.example.*;
import com.builder.example.MyUser;
import com.composite.example.Employee4;
import com.composite.example.Manager4;
import com.composite.example.RegularEmployee;
import com.facade.example.EmployeeFacade;
import com.factory.example.Pizza;
import com.factory.example.PizzaFactory;
import com.flyweight.example.Circle;
import com.flyweight.example.ShapeFactory;
import com.multiton.example.Resource;
import com.multiton.example.ResourceMultiton;
import com.multiton.example.ResourceMultitonn;
import com.multiton.example.ResourceSingleton;
import com.objectpool.example.Employee1;
import com.objectpool.example.EmployeePool;
import com.prototype.example.Employee;
import com.prototype.example.PrototypeFactory;
import com.singleton.example.MySingleton;

public class DesignPatternMain {

	private static final String colors[] = { "Red", "Green", "Blue", "Orange", "Black" };

	public static void main(String[] args) throws CloneNotSupportedException {
		
 		//Singleton Design Pattern
 		System.out.println("");
 		System.out.println("Singleton Design Pattern");
 		System.out.println("");
		MySingleton objSingleton = MySingleton.getInstance();
		objSingleton.setMessage("Hello World!!!");
		System.out.println(objSingleton.getMessage());
		
		System.out.println("*********************************************************************************************************");
 		
 		//Prototype Design Pattern
 		System.out.println("");
 		System.out.println("Prototype Design Pattern");
 		System.out.println("");
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
        
        System.out.println("*********************************************************************************************************");
 		
 		//Builder Design Pattern
 		System.out.println("");
 		System.out.println("Builder Design Pattern");
 		System.out.println("");
        
        MyUser user = new MyUser.Builder()
                .firstName("Andrew")
                .lastName("John")
                .email("andrew.sajj@gmail.com")
                .phone("9840718222")
                .build();
    	System.out.println(user);
    	
    	System.out.println("*********************************************************************************************************");
 		
 		//Factory Design Pattern
 		System.out.println("");
 		System.out.println("Factory Design Pattern");
 		System.out.println("");
    	
    	PizzaFactory pizzaFactory = new PizzaFactory();

		Pizza pizza1 = pizzaFactory.getPizza("PepperoniPizza");
		pizza1.prepare();
		pizza1.bake();
		pizza1.cut();
		pizza1.box();

		Pizza pizza2 = pizzaFactory.getPizza("VeggiePizza");
		pizza2.prepare();
		pizza2.bake();
		pizza2.cut();
		pizza2.box();

		Pizza pizza3 = pizzaFactory.getPizza("CheesePizza");
		pizza3.prepare();
		pizza3.bake();
		pizza3.cut();
		pizza3.box();

		System.out.println("*********************************************************************************************************");
 		
 		//Abstract Design Pattern
 		System.out.println("");
 		System.out.println("Abstract Design Pattern");
 		System.out.println("");
		EmployeeFactory fullTimeFactory = new FullTimeEmployeeFactory();
		EmployeeFactory partTimeFactory = new PartTimeEmployeeFactory();

		EmployeePayroll fullTimePayroll = new EmployeePayroll(fullTimeFactory);
		fullTimePayroll.paySalary("Ram", 15000.0);

		EmployeePayroll partTimePayroll = new EmployeePayroll(partTimeFactory);
		partTimePayroll.paySalary("Shiva", 20500.0);
		
		System.out.println("*********************************************************************************************************");
 		
 		//Abstract Design Pattern -- Activity -- 21Apr2023
 		System.out.println("");
 		System.out.println("Abstract Design Pattern -- Activity - 21-Apr-2023");
 		System.out.println("");
		PizzaFactory2 pepperoniPizzaFactory = new PepperoniPizzaFactory2();
		PizzaFactory2 veggiePizzaFactory = new VeggiePizzaFactory2();
		
		PizzaPreparation prepare = new PizzaPreparation(pepperoniPizzaFactory);
		prepare.preparePizza("Pepperoni", 1);
		PizzaPreparation prepare2 = new PizzaPreparation(veggiePizzaFactory);
		prepare2.preparePizza("Veggie", 2);
		 
		//ObjectPool Design Pattern
		EmployeePool pool = EmployeePool.getInstance();

	    // Acquire three employees from the pool
	    Employee1 e1 = pool.acquire();
	    Employee1 e2 = pool.acquire();
	    Employee1 e3 = pool.acquire();

	    // Release two employees back into the pool
	    pool.release(e1);
	    pool.release(e2);

	    // Acquire two more employees from the pool
	    Employee1 e4 = pool.acquire();
	    Employee1 e5 = pool.acquire();
	    Employee1 e6 = pool.acquire();
	    Employee1 e7 = pool.acquire();

	    // e1 and e2 should be the same object as before
	    System.out.println(e1 == e4); // true
	    System.out.println(e2 == e5); // true
	    
	    System.out.println(e1);
	    System.out.println(e2);
	    System.out.println(e3);
	    System.out.println(e4);
	    System.out.println(e5);
	    System.out.println(e6);
	    System.out.println(e7);

	    System.out.println("*********************************************************************************************************");
 		
 		//Multiton Design Pattern
 		System.out.println("");
 		System.out.println("Multiton Design Pattern");
 		System.out.println("");
	    
	 // Singleton
 		Resource r1 = ResourceSingleton.getInstance();
 		Resource r2 = ResourceSingleton.getInstance();
 		System.out.println(r1 == r2); // true

 		System.out.println("-------------");
 		// Multiton
 		Resource r3 = ResourceMultiton.getInstance("key1");
 		Resource r4 = ResourceMultiton.getInstance("key1");
 		Resource r5 = ResourceMultiton.getInstance("key2");
 		System.out.println(r3 == r4); // true
 		System.out.println(r4 == r5); // false
 		
 		System.out.println("-------------");
 		//ResourceMultitonn with fixed no of keys
 		Resource res1 = ResourceMultitonn.getInstance("key1");
 		Resource res2 = ResourceMultitonn.getInstance("key1");
 		Resource res3 = ResourceMultitonn.getInstance("key3");
 		Resource res4 = ResourceMultitonn.getInstance("key4");

 		System.out.println(res1 == res2); // true
 		System.out.println(res2 == res3); // false
 		System.out.println(res3 == res4); // false
 		
 		System.out.println("*********************************************************************************************************");
 		
 		//Adapter Design Pattern
 		System.out.println("");
 		System.out.println("Adapter Design Pattern");
 		System.out.println("");
 		Employee3 employee = new Employee3("Shiva", "Priya", 30);
        Person person = new EmployeeAdapter(employee);

        System.out.println("Person full name: " + person.getFullName());
        System.out.println("Person age: " + person.getAge());

        System.out.println("*********************************************************************************************************");
        
        //Bridge Design Pattern
 		System.out.println("");
 		System.out.println("Bridge Design Pattern");
 		System.out.println("");	
 		
 		Implementor tv = new TV();
		Implementor radio = new Radio();

		Abstraction remoteControl = new RemoteControl(tv);
		Abstraction voiceAssistant = new VoiceController(radio);

		remoteControl.turnOn();
		remoteControl.turnOff();

		voiceAssistant.turnOn();
		voiceAssistant.turnOff();
		
		System.out.println("*********************************************************************************************************");
		
		//Composite Design Pattern
 		System.out.println("");
 		System.out.println("Composite Design Pattern");
 		System.out.println("");	
 		
 		Employee4 john = new RegularEmployee("John", "Sales", 5000);
		Employee4 jane = new RegularEmployee("Jane", "Marketing", 6000);

		Employee4 bob = new Manager4("Bob", "Sales", 10000);
		bob.add(john);

		Employee4 sarah = new Manager4("Sarah", "Marketing", 12000);
		sarah.add(jane);

		Employee4 alice = new Manager4("Alice", "CEO", 20000);
		alice.add(bob);
		alice.add(sarah);

		System.out.println("Employee details:");
		System.out.println(alice.getName() + ", " + alice.getDepartment() + ", " + alice.getSalary());

		List<Employee4> subordinates = alice.getSubordinates();
		for (Employee4 subordinate : subordinates) {
			System.out.println(
					"\t" + subordinate.getName() + ", " + subordinate.getDepartment() + ", " + subordinate.getSalary());
			List<Employee4> subSubordinates = subordinate.getSubordinates();
			if (subSubordinates != null) {
				for (Employee4 subSubordinate : subSubordinates) {
					System.out.println("\t\t" + subSubordinate.getName() + ", " + subSubordinate.getDepartment() + ", "
							+ subSubordinate.getSalary());
				}
			}
		}
		
		System.out.println("*********************************************************************************************************");
		
		//Facade Design Pattern
 		System.out.println("");
 		System.out.println("Facade Design Pattern");
 		System.out.println("");	
 		
 		EmployeeFacade employeeFacade = new EmployeeFacade("John", "Manager", 50000);

        System.out.println("Employee Details:\n" + employeeFacade.getEmployeeDetails());
        System.out.println("Salary: " + employeeFacade.getSalary());

        employeeFacade.increaseSalary(10000);

        System.out.println("Employee Details:\n" + employeeFacade.getEmployeeDetails());
        System.out.println("Salary: " + employeeFacade.getSalary());

        System.out.println("*********************************************************************************************************");
		
		//Flyweight Design Pattern
 		System.out.println("");
 		System.out.println("Flyweight Design Pattern");
 		System.out.println("");	
 		System.out.println("\n################ Red color Circles ####################");
		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[0]);
			circle.draw();
		}
		System.out.println("\n############### Green color Circles ####################");
		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[1]);
			circle.draw();
		}
		System.out.println("\n################ Blue color Circles ####################");

		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[2]);
			circle.draw();
		}
		System.out.println("\n################ Orange color Circles ####################");
		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[3]);
			circle.draw();
		}
		System.out.println("\n################ Black color Circles ####################");
		for (int i = 0; i < 5; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[4]);
			circle.draw();
		}

	}

}
