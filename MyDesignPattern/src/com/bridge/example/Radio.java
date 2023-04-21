package com.bridge.example;

public class Radio implements Implementor {
	@Override
	public void on() {
		System.out.println("Radio is ON");
	}

	@Override
	public void off() {
		System.out.println("Radio is OFF");
	}
}
