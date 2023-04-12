package com.customer.manage;

import java.util.*;

import com.customer.controller.CustomerController;
import com.customer.model.Customer;
import com.customer.model.CustomerDetails;
import com.customer.model.MyStaticClass;
import com.customer.model.MyBaseClass;
import com.customer.model.*;

public class AddCustomer {

	public static void main(String[] args) {
		//int age = 10;
		//String name = "Andrew";
		//System.out.println("Hi " + name);
		//System.out.println("Age is " + age);
		
		
		//String choice;
		//CustomerController customerController = new CustomerController();
		//Scanner s = new Scanner(System.in);
		//do {
		//	System.out.println("Enter your Choice : ");
		//	System.out.println("1. Enter Values");
		//	System.out.println("2. Print Values");
		//	int key = s.nextInt();
			//switch(key) {
				//case 1: {
					//customerController.addCustomer();
					//break;
				//}
				//case 2: {
					//customerController.viewCustomer();
					//break;
				//}
				//default: {
					//System.out.println("Please enter the right choice.");
				//}
			//}
			//System.out.println("Do you want to continue Y/y or N/n?");
			//choice = s.next();
		//}while(choice.toLowerCase().equals("y"));
		//System.out.println("Exited.");
		//System.exit(0);
	
		//Customer cus = new Customer();
		//System.out.println(cus.getDetails());
		//CustomerDetails cus = new Customer();
		//cus.assignAddress();
		//System.out.println(cus.getDetails());
		//System.out.println(cus.getAge());
		
		//if(cus instanceof CustomerDetails) {
			//System.out.println("Instance of CustomerDetails");
		//}
		//else {
			//System.out.println("Instance of Customer");
		//}
		//System.out.println( MyStaticClass.getSalary());
		//System.out.println( MyStaticClass.salary);
		
//		MyBaseClass mbc = new CustomerDetails();
//		System.out.println(mbc.getDefaultGender());
//		System.out.println(mbc.getGender());
//		System.out.println(mbc.getVehicleNo());
		
//		IVehicle veh = new CustomerDetails();
//		System.out.println(veh.getVehicleNo());
		
		List lst = new ArrayList();
		lst.add("Andrew");
		lst.add(40);
		lst.add("male");
		lst.add("Andrew");
		System.out.println(lst);
		
		Set st = new HashSet();
		st.add("Andrew");
		st.add(40);
		st.add("male");
		st.add("Andrew");
		System.out.println(st);
		
		Map mp = new HashMap();
		mp.put(1, "Andrew");
		mp.put(2, "John");
		mp.put(4, "Joseph");
		mp.put(3, 40);
		System.out.println(mp);
		
//		Iterator i = lst.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		lst.forEach(cus -> System.out.println(cus));
	}

}
