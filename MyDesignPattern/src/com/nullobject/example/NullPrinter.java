package com.nullobject.example;

public class NullPrinter implements Printer {

	@Override
	public void print(String document) {
		System.out.println("Printer not available!!!");
	}
	
}
