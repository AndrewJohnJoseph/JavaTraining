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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.abstractdp.activity.PepperoniPizzaFactory2;
import com.abstractdp.activity.PizzaFactory2;
import com.abstractdp.activity.PizzaPreparation;
import com.abstractdp.activity.VeggiePizzaFactory2;
import com.abstractdp.example.*;
import com.builder.example.MyUser;
import com.chainofresp.example.Director;
import com.chainofresp.example.Employee7;
import com.chainofresp.example.Manager;
import com.chainofresp.example.Request;
import com.chainofresp.example.RequestType;
import com.chainofresp.example.Supervisor;
import com.command.example.AddEmployeeCommand;
import com.command.example.Employee8;
import com.command.example.EmployeeManagement;
import com.command.example.RemoveEmployeeCommand;
import com.composite.example.Employee4;
import com.composite.example.Manager4;
import com.composite.example.RegularEmployee;
import com.facade.example.EmployeeFacade;
import com.factory.example.Pizza;
import com.factory.example.PizzaFactory;
import com.flyweight.example.Circle;
import com.flyweight.example.ShapeFactory;
import com.intepret.example.AndExpression;
import com.intepret.example.Employee9;
import com.intepret.example.Expression;
import com.intepret.example.IdExpression;
import com.intepret.example.NameExpression;
import com.intepret.example.OrExpression;
import com.iterator.example.Employee10;
import com.iterator.example.Employee10Collection;
import com.mediator.example.Customer;
import com.momento.example.Employee11;
import com.multiton.example.Resource;
import com.multiton.example.ResourceMultiton;
import com.multiton.example.ResourceMultitonn;
import com.multiton.example.ResourceSingleton;
import com.nullobject.example.ConsolePrinter;
import com.nullobject.example.NullPrinter;
import com.nullobject.example.Printer;
import com.objectpool.example.Employee1;
import com.objectpool.example.EmployeePool;
import com.observer.example.NewsAgency;
import com.observer.example.NewsChannel;
import com.prototype.example.Employee;
import com.prototype.example.PrototypeFactory;
import com.proxy.example.Employee6;
import com.proxy.example.EmployeeProxy;
import com.singleton.example.MySingleton;
import com.state.activity.LightSwitch1;
import com.state.example.LightSwitch;
import com.stratergy.example.BubbleSortStrategy;
import com.stratergy.example.SelectionSortStrategy;
import com.stratergy.example.Sorter;
import com.stratergy.example.SortingStratergy;
import com.template.example.Coffee;
import com.template.example.Tea;
import com.visitor.example.BonusVisitor;
import com.visitor.example.Clerk12;
import com.visitor.example.Director12;
import com.visitor.example.Employee12;
import com.visitor.example.Manager12;

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

		System.out.println("*********************************************************************************************************");
		
		//Proxy Design Pattern
 		System.out.println("");
 		System.out.println("Proxy Design Pattern");
 		System.out.println("");	
		
		Employee6 employee6 = new EmployeeProxy("Andrew");
		employee6.work();
		employee6.work();
		
		System.out.println("*********************************************************************************************************");
		//Chain of Responsibilities Design Pattern
 		System.out.println("");
 		System.out.println("Chain of Responsibilities Design Pattern");
 		System.out.println("");	
		
// 		Employee7 supervisor = new Supervisor();
// 	     Employee7 manager = new Manager();
// 	     Employee7 director = new Director();
//
// 	     supervisor.setNextEmployee(manager);
// 	     manager.setNextEmployee(director);
//
// 	     // Process requests
// 	     supervisor.processRequest(new Request(RequestType.LEAVE, 2));
// 	     supervisor.processRequest(new Request(RequestType.LEAVE, 7));
// 	     supervisor.processRequest(new Request(RequestType.LEAVE, 14));
// 	     supervisor.processRequest(new Request(RequestType.TRAVEL, 5));
 	     
 	    System.out.println("*********************************************************************************************************");
		//Command Design Pattern
 		System.out.println("");
 		System.out.println("Command Design Pattern");
 		System.out.println("");	
 		
 	// Create the Receiver object
 			Employee8 employee8 = new Employee8("Andrew John", 123);

 			// Create the Command objects
 			AddEmployeeCommand addCommand = new AddEmployeeCommand(employee8);
 			RemoveEmployeeCommand removeCommand = new RemoveEmployeeCommand(employee8);

 			// Create the Invoker object
 			EmployeeManagement management = new EmployeeManagement();

 			// Set and execute the AddEmployeeCommand
 			management.setCommand(addCommand);
 			management.executeCommand();

 			// Set and execute the RemoveEmployeeCommand
 			management.setCommand(removeCommand);
 			management.executeCommand();

 			System.out.println("*********************************************************************************************************");
 			//Interpretor Design Pattern
 	 		System.out.println("");
 	 		System.out.println("Interpretor Design Pattern");
 	 		System.out.println("");	
 	 		
 	 		List<Employee9> employees = new ArrayList<Employee9>();
 	 	     employees.add(new Employee9("John", 1));
 	 	     employees.add(new Employee9("Jane", 2));
 	 	     employees.add(new Employee9("Bob", 3));
 	 	     
 	 	     Expression expression1 = new NameExpression("John");
 	 	     Expression expression2 = new IdExpression(2);
 	 	     Expression orExpression = new OrExpression(expression1, expression2);
 	 	     
 	 	     System.out.println("Employees who match the expression: " + orExpression.interpret(employees.get(0)) + ", " + orExpression.interpret(employees.get(1)) + ", " + orExpression.interpret(employees.get(2)));
 	 	     
 	 	     Expression expression3 = new NameExpression("Bob");
 	 	     Expression expression4 = new IdExpression(3);
 	 	     Expression andExpression = new AndExpression(expression3, expression4);
 	 	     
 	 	     System.out.println("Employee who matches the expression: " + andExpression.interpret(employees.get(0)) + ", " + andExpression.interpret(employees.get(1)) + ", " + andExpression.interpret(employees.get(2)));

 	 	     System.out.println("*********************************************************************************************************");
			//Iterator Design Pattern
	 		System.out.println("");
	 		System.out.println("Iterator Design Pattern");
	 		System.out.println("");	
	 		
	 		List<Employee10> employees10 = new ArrayList<Employee10>();
			employees10.add(new Employee10("Jeeva", 1));
			employees10.add(new Employee10("Jack", 2));
			employees10.add(new Employee10("Barbie", 3));

			Employee10Collection employee10Collection = new Employee10Collection(employees10);
			while (employee10Collection.hasNext()) {
				Employee10 employee10 = (Employee10) employee10Collection.next();
				System.out.println("Employee Name: " + employee10.getName() + ", Employee ID: " + employee10.getId());
			}
			
			System.out.println("*********************************************************************************************************");
			//Mediator Design Pattern
	 		System.out.println("");
	 		System.out.println("Mediator Design Pattern");
	 		System.out.println("");	
	 		
	 		Customer andrew = new Customer("Andrew");
			Customer john1 = new Customer("John");

			andrew.sendMessage("Laptop is generating more heat");
			john1.sendMessage("Please check the battery");

			System.out.println("*********************************************************************************************************");
			//Momento Design Pattern
	 		System.out.println("");
	 		System.out.println("Momento Design Pattern");
	 		System.out.println("");	
	 		
	 		Employee11 employee11 = new Employee11("Selva", "Manager", 50000);
	        System.out.println("Employee before change: " + employee11.getName() + ", " + employee11.getDesignation() + ", " + employee11.getSalary());
	        
	        Employee11.Memento memento = employee11.save();
	        employee11.setName("Rahul");
	        employee11.setDesignation("Developer");
	        employee11.setSalary(40000);
	        System.out.println("Employee after change: " + employee11.getName() + ", " + employee11.getDesignation() + ", " + employee11.getSalary());
	        
	        employee11.restore(memento);
	        System.out.println("Employee after restore: " + employee11.getName() + ", " + employee11.getDesignation() + ", " + employee11.getSalary());

	        System.out.println("*********************************************************************************************************");
			//NullObject Design Pattern
	 		System.out.println("");
	 		System.out.println("NullObject Design Pattern");
	 		System.out.println("");	
	 		
	        Printer printer = getPrinter();
	        printer.print("Hello, world!");
	        
	        System.out.println("*********************************************************************************************************");
			//Observer Design Pattern
	 		System.out.println("");
	 		System.out.println("Observer Design Pattern");
	 		System.out.println("");	
	        
	        NewsAgency newsAgency = new NewsAgency();
	        NewsChannel newsChannel1 = new NewsChannel();
	        NewsChannel newsChannel2 = new NewsChannel();

	        newsAgency.attach(newsChannel1);
	        newsAgency.attach(newsChannel2);

	        newsAgency.notifyObservers("COVID-19 vaccine approved by FDA");

	        newsAgency.detach(newsChannel2);

	        newsAgency.notifyObservers("Bitcoin hits all-time high");

	        System.out.println("*********************************************************************************************************");
			//Stage Design Pattern
	 		System.out.println("");
	 		System.out.println("State Design Pattern");
	 		System.out.println("");	
	 		
	 		LightSwitch lightSwitch = new LightSwitch();
	        lightSwitch.switchOn();
	        lightSwitch.switchOff();
	        lightSwitch.switchOff();
	        lightSwitch.switchOn();
	        lightSwitch.switchOn();
	        
	        System.out.println("*********************************************************************************************************");
			//Stage Design Pattern -- Activity 24-Apr-2023
	 		System.out.println("");
	 		System.out.println("State Design Pattern -- Activity 24-Apr-2023");
	 		System.out.println("");	
	 		
	 		LightSwitch1 lightSwitch1 = new LightSwitch1();
	        lightSwitch1.greenSwitch();
	        lightSwitch1.redSwitch();
	        lightSwitch1.redSwitch();
	        lightSwitch1.yellowSwitch();

	        System.out.println("*********************************************************************************************************");
			//Stratergy Design Pattern
	 		System.out.println("");
	 		System.out.println("Stratergy Design Pattern");
	 		System.out.println("");	
	 		
	 		int[] array = {5, 3, 8, 4, 2};
	 	     
	 	     SortingStratergy strategy1 = new BubbleSortStrategy();
	 	     SortingStratergy strategy2 = new SelectionSortStrategy();
	 	     
	 	     Sorter sorter = new Sorter(strategy1);
	 	     sorter.sort(array);
	 	     System.out.println(Arrays.toString(array));
	 	     
	 	     sorter.setStrategy(strategy2);
	 	     sorter.sort(array);
	 	     System.out.println(Arrays.toString(array));
	 	     
	 	    System.out.println("*********************************************************************************************************");
			//Teamplate Design Pattern
	 		System.out.println("");
	 		System.out.println("Teamplate Design Pattern");
	 		System.out.println("");	
	 	     
	 	    Coffee coffee = new Coffee();
			coffee.prepareBeverage();

			System.out.println();

			Tea tea = new Tea();
			tea.prepareBeverage();

			System.out.println("*********************************************************************************************************");
			//Visitor Design Pattern
	 		System.out.println("");
	 		System.out.println("Visitor Design Pattern");
	 		System.out.println("");	
			
			Employee12[] employees12 = { new Clerk12(), new Manager12(), new Director12() };
	        BonusVisitor visitor = new BonusVisitor();
	        
	        for (Employee12 employee12 : employees12) {
	            employee12.accept(visitor);
	        }


	}
	
	public static Printer getPrinter() {
	     // return null to use the ConsolePrinter, or return new NullPrinter() to use 
		 //the Null Object
	     //return new NullPrinter();
		return new ConsolePrinter();
	 }


}
