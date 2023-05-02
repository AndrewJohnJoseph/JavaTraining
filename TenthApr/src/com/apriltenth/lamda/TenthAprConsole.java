package com.apriltenth.lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.april.models.EmployeeDetails;
import com.april.models.MyTask;
import com.april.models.MyThreadTask;
import com.april.myinterface.MyTestInterface;

public class TenthAprConsole {

	public static void main(String[] args) {
		
		//Java 7 implementations -- Structural way
//		MyTask mt = new MyTask();
//		mt.connect();
//		
//		Runnable mtt = new MyThreadTask();
//		Thread t = new Thread(mtt);
//		t.start();
//		
//		Runnable r1 = new Runnable() {
//
//			@Override
//			public void run() {
//				MyTask mtannonymous = new MyTask();
//				mtannonymous.connect();
//			}
//		};
//		Thread t2 = new Thread(r1);
//		t2.start();
		
		
		//Java 8 implementations - functional way
		
//		Runnable lmtt = () -> {
//			MyTask lmt = new MyTask();
//			lmt.connect();
//		};
//		
//		Thread t3 = new Thread(lmtt);
//		t3.start();
//		
//		Thread t4 = new Thread(() -> {
//			MyTask mt4 = new MyTask();
//			mt4.connect();
//		});
//		t4.start();
//		
//		new Thread(() -> {
//			new MyTask().connect();
//		}).start();
//		
//		new Thread(() -> {
//			new MyTask().connect();
//		}).start();
		
//		new Thread(new MyTask()::connect).start();
		
//		new Thread(new MyTask().testconnect()).start();

		EmployeeDetails ed1 = new EmployeeDetails(1, "Andrew", "Male");
		EmployeeDetails ed2 = new EmployeeDetails(2, "Hannah", "Female");
		EmployeeDetails ed3 = new EmployeeDetails(3, "Dedalus", "Male");
		
		List<EmployeeDetails> lstEmployees = new ArrayList<EmployeeDetails>();
		lstEmployees.add(ed1);
		lstEmployees.add(ed2);
		lstEmployees.add(ed3);
		
//		System.out.println(lstEmployees);
		
//		Iterator<EmployeeDetails> i = lstEmployees.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		lstEmployees.forEach(emp -> System.out.println(emp));
		
//		lstEmployees.forEach(System.out::println);
		
//		MyTestInterface<String, String> objPredicate = (surn, foren) -> surn.equals(foren);
//		System.out.println(objPredicate.test("Andrew", "Andrew"));
//		
//		MyTestInterface<Integer, Integer> objPredicate1 = (surn, foren) -> surn > foren;
//		System.out.println(objPredicate1.accept(3, 2));
		
//		MyTestInterface<Integer, Integer> objPredicate2 = (surn, foren) -> surn > foren;
//		MyTestInterface<Integer, Integer> objPredicate3 = (surn, foren) -> surn == foren;
//		System.out.println(objPredicate2.and(objPredicate3).accept(3, 2));
		
//		Predicate<Integer> greater100 = (sal) -> sal > 100;
//		Predicate<Integer> lesser50 = (sal) -> sal < 50;
//		boolean result = greater100.and(lesser50).test(75);
//		System.out.println(result);
		
		
		
//		BiPredicate<String, String> res = (un, pw) -> un.equals(pw);
//		System.out.println(res.test("abc", "abc"));
//
//		if (res.test("Priya", "Priya")) {
//			System.out.println("Welcome ");
//		} else {
//			System.out.println("Welcome Guest");
//		}
//				
//		BiPredicate<Long, Long> p1 = (x, y) -> x >= y;
//		BiPredicate<Long, Long> p2 = (x, y) -> x == y;
//
//		System.out.println(p1.and(p2).test(101L, 101L));
//
//		Supplier<String> s = () -> {
//			return "Priya";
//		};
//		System.out.println(s.get());
//
//		Supplier<Integer> s1 = () -> {
//			return 123;
//		};
//		System.out.println(s1.get());
//		
//		Function<Integer,String> evenorodd = (num)->{
//			if(num%2 == 0) {
//			return num + " is even .";
//			}
//			else
//			{
//				return num + " is odd";
//			}
//			
//		};
//		System.out.println(evenorodd.apply(52));
		
//		try {
//			availableseats();
//		}
//		catch(Exception exp) {
//			System.out.println("Seat not available");
//		}

	}
	
//	public static void availableseats() throws Exception {
//		throw null;
//	}

}
