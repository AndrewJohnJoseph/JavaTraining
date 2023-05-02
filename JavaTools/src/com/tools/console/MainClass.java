package com.tools.console;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.tools.firstjava.Employee;

public class MainClass {
	public static void main(String[] args) {
		//System.out.println("Hi");
//		
//		Employee emp = new Employee();
//		Class c = emp.getClass();
//		System.out.println(c.getName());
//		
//		Method[] m = c.getDeclaredMethods();
//		//Method[] m = c.getMethods();
//		for(int i=0;i < m.length;i++) {
//			System.out.println(m[i]);
//		}
//		
//		System.out.println("Fields");
//		Field[] f = c.getDeclaredFields();
//		//Field[] f = c.getFields();
//		for(int i=0;i < f.length;i++) {
//			System.out.println(f[i]);
//		}
//			
//		Employee emp2 = new Employee();
//		Class c2 = emp2.getClass();
//		
//		System.out.println(c.hashCode());
//		System.out.println(c2.hashCode());
//		
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
	
		
		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
		String jvmName = runtimeBean.getName();
		
		System.out.println("JVM name = " + jvmName);
		
		long pid = Long.valueOf(jvmName.split("@")[0]);
		System.out.println("JVM PID = " + pid);
		
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		int peakThreadCount = bean.getPeakThreadCount();
		
		System.out.println("Peak Thread Count = " + peakThreadCount);
		System.out.println("Total memory = " + Runtime.getRuntime().totalMemory() + " bytes");
		System.out.println("Free memory = " + Runtime.getRuntime().freeMemory() + " bytes");		
		System.out.println("Used Memory = " + (Runtime.getRuntime().totalMemory() -Runtime.getRuntime().freeMemory()) + " bytes");
		System.out.println("Max memory = " + Runtime.getRuntime().maxMemory() + " bytes");
		
		List<Object> items = new ArrayList<>(1);
		try {
			while(true) {
				items.add(new Object());
			}
		} catch (OutOfMemoryError e) {
			
			e.printStackTrace();
		}
		//assert items.size() >0;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
