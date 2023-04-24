package com.nullobject.example;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String document) {
		System.out.println(document);
	}

}
