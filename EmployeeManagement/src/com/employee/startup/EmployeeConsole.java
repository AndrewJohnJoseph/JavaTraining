package com.employee.startup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.employee.models.Employee;
import com.employee.models.LoginDetails;
import com.employee.models.MyOuterClass;
import com.employee.models.MyOuterClass.MyInnerClass;
import com.employee.models.MyRunnable;
import com.employee.models.MyThread;
import com.employee.models.SyncThread;
import com.employee.models.TestThread;
import com.employee.models.UserNotFoundException;

import java.io.*;

public class EmployeeConsole {
//	static int statInt = 1;
//	int nonstatInt = 10;
//	
//	static {
//		System.out.println("STatic block");
//		statInt = 2;
//	}
//	
//	{
//		System.out.println("Non-static Block");
//		nonstatInt = 12;
//	}
	
	public static void main(String[] args) throws IOException {
//		List<Object> l1 = new ArrayList<Object>();
//		for(int i=0;i<10;i++) {
//			l1.add(i);
//		}
//		addIDs(l1);
//		
//		List<Number> l2 = new ArrayList<Number>();
//		for(int i=0;i<10;i++) {
//			l2.add(i);
//		}
//		addIDs(l2);
//
//
//		List<Integer> a = Arrays.asList(1,2,3);
//		sumIDs(a);
//		
//		List<Double> b = Arrays.asList(1.1,2.1,3.1);
//		sumIDs(b);
//
//		List<Double> l3 = new ArrayList<Double>();
//		for(int i=0;i<10;i++) {
//			l3.add(i + 0.01);
//		}
//		addGenericIDs(l3);
//		
//		List<String> l4 = new ArrayList<String>();
//		for(int i=0;i<10;i++) {
//			l4.add("Andrew-" + i);
//		}
//		addGenericIDs(l4);

//		int a = 0,b = 0, c = 0;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("Enter Values : ");
//		try {
//			a = Integer.parseInt(br.readLine());
//		}
//		catch(NumberFormatException exp) {
//			System.out.println("Input type is not string");
//		}
//		catch(Exception exp) {
//			System.out.println("General Exception");
//		}
//		finally {
//			System.out.println("finally");
//		}
//		
//		System.out.println(a);
		
//		LoginDetails ld = new LoginDetails();
//		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		
//		String un = "";
//		
//		String pwd = "";
//		
//		try {
//			System.out.println("Enter UserName : ");
//			un = br.readLine();
//			System.out.println("Enter Password : ");
//			pwd = br.readLine();
//			
//			if(un.equals(ld.username) && pwd.equals(ld.password)) {
//				System.out.println("Login Successful");
//			}
//			else {
//				throw new UserNotFoundException();
//			}
//		}
//		catch(IOException ioexp) {
//			
//		}
//		catch(Exception exp) {
//			
//		}
		
		
		
//		int choice = 0;
//		List lst = new ArrayList<Employee>();
//		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		do {
//			
//			System.out.println("1. Add Employee");
//			System.out.println("2. View Employees");
//			System.out.println("3. Write to File");
//			System.out.println("4. Read from File");
//			System.out.println("5. Sort Using Comparable");
//			System.out.println("6. Sort Using Comparator");
//			System.out.println("7. Exit");
//			System.out.print("Enter Your Choice : ");
//			try {
//				choice = Integer.parseInt(br.readLine());
//				switch(choice) {
//					case 1:
//						System.out.print("Enter Employee ID : ");
//						int _id = Integer.parseInt(br.readLine());
//						System.out.print("Enter Employee Name : ");
//						String _name = br.readLine();
//						Employee emp = new Employee(_id, _name);
//						lst.add(emp);
//						break;
//					case 2:
//						System.out.println("Employee Details :");
//						System.out.println(lst);
//						break;
//					case 3:
//						FileOutputStream fs = new FileOutputStream("test.txt");
//						ObjectOutputStream os = new ObjectOutputStream(fs);
//						
//						os.writeObject(lst);
//						System.out.println("Employee Details have been written in the file C:\test.txt successfully");
//						break;
//					case 4:
//						FileInputStream fi = new FileInputStream("test.txt");
//						ObjectInputStream oi = new ObjectInputStream(fi);
//						List newlst = (ArrayList<Employee>)oi.readObject();
//						System.out.println(newlst);
//						break;
//					case 5:
//						Collections.sort(lst);
//						break;
//					case 6:
//						Collections.sort(lst, Employee.NameComparator);
//						break;
//					case 7: 
//						System.exit(0);
//						break;
//					default:
//						System.out.println("Employee Details :");
//						System.out.println(lst);
//						break;
//				}
//			}
//			catch(Exception exp) {
//				
//			}
//			System.out.println(choice);
//		}while(choice < 7);
		
		//Day 4
//		System.out.println(statInt);
//		EmployeeConsole ec = new EmployeeConsole();
//		System.out.println(statInt);
//		System.out.println(ec.nonstatInt);
		
		//String operations
//		String str1 = "I like Java";
//		System.out.println("str 1 " + str1);
//		System.out.println(" Is Empty ?" +str1.isEmpty());
//		System.out.println(" Length of str1: " + str1.length());
//		System.out.println(" charAt " +str1.charAt(4));
//		System.out.println(" concat " + str1.concat(" Programming"));
//		System.out.println(" equals : " +str1.equals("I like C") );
//		System.out.println(" lowercase : " +str1.toLowerCase());
//		System.out.println(" substring(2) " + str1.substring(2));
//		System.out.println(" substring(2,5) " + str1.substring(2,5));	
//		System.out.println("compare " + str1.compareTo("I like java"));
//		System.out.println(" contains :" + str1.contains("Java"));
//		System.out.println((" trim " + "    ABC    ").trim());
//		//System.out.println(" " + );
//
//
//		String s1="Java";
//		String s2="Java";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		s1="java";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//
//		StringBuffer demo1 = new StringBuffer("Good");
//		System.out.println(demo1.hashCode());
//		System.out.println(demo1);
//		demo1.append(" Afternoon");
//		System.out.println(demo1);
//		System.out.println(demo1.hashCode());
//		
//		StringBuilder demo2 = new StringBuilder("Good");
//		System.out.println(demo2.hashCode());
//		System.out.println(demo2);
//		demo2.append(" Evening");
//		System.out.println(demo2);
//		System.out.println(demo2.hashCode());
		
		
		//Subclasses 
//		MyOuterClass moc = new MyOuterClass();
//		moc.OuterMethod();
//		moc.InnerMethod(); //Not possible
		
//		MyInnerClass mic = new MyInnerClass() //Not Possible
//		MyOuterClass.MyInnerClass mic = new MyOuterClass.MyInnerClass();
//		MyOuterClass.MyInnerClass mic = moc.new MyInnerClass();
//		mic.InnerMethod();
//		moc.mic.InnerMethod();	
//		moc.mdc.MyAbstractMethod();
		
//		moc.InnerMethod(); //Not possible
//		mic.OuterMethod(); //Not possible
		
		
		//Threading
		
//		System.out.println("Regular Main Started");
//		MyThread myt = new MyThread();
//		myt.run();
//		System.out.println("Regular Main Ended");
		
//		System.out.println("Thread Main Started");
//		MyThread myt1 = new MyThread();
//		myt1.start();
//		System.out.println("Thread Main Ended");
		
//		System.out.println("Regular Main Started");
//		MyRunnable myrun = new MyRunnable();
//		Thread t = new Thread(myrun);
//		t.start();
//		System.out.println("Regular Main Ended");
		
		System.out.println("Regular Main Started");
		TestThread t1 = new TestThread();
		SyncThread A = new SyncThread(t1);
		SyncThread B = new SyncThread(t1);
		A.start();
		B.start();
		System.out.println("Regular Main Ended");
		
	}
	
	public static void addIDs(List<? super Integer> lst) {
		
		System.out.println(lst);
	}
	
	public static void sumIDs(List <? extends Number> lst) {
		double d =0;
		for(Number n :lst)
		{
			d=d+n.doubleValue();
		}
		System.out.println(d);
	}

	public static void addGenericIDs(List<? extends Object> lst) {
		
		System.out.println(lst);
	}
}
