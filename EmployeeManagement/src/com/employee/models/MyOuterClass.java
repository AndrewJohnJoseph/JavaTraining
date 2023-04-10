package com.employee.models;

public class MyOuterClass {
	int idx = 0;
	
	
	public class MyInnerClass {
		String inner = "Inner";
		
		public void InnerMethod() {
			idx  = 1;
			System.out.println("Inner Method : " + idx + " - " + inner);
		}
	}
	
	public void OuterMethod() {
		System.out.println("Outer Method : " + idx + " - " + mic.inner);
	}
	
	public MyInnerClass mic = new MyInnerClass();
	
	abstract class MyAbstractClass {
		abstract void MyAbstractMethod();
	}
	
	public class MyDeriveredClass extends MyAbstractClass {
		public void MyAbstractMethod() {
			System.out.println("My Abstract method");
		}
	}
	
	public MyDeriveredClass mdc = new MyDeriveredClass();

}
