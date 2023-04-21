package com.bridge.example;

public class TV implements Implementor {

	@Override
	public void on() {
		System.out.println("TV is ON");
	}

	@Override
	public void off() {
		System.out.println("TV is OFF");
	}

}
