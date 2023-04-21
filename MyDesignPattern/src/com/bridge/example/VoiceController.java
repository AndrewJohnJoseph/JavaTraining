package com.bridge.example;

public class VoiceController extends Abstraction {
	public VoiceController(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void turnOn() {
		System.out.print("Using Voice Controller : ");
		implementor.on();
	}

	@Override
	public void turnOff() {
		System.out.print("Using Voice Controller : ");
		implementor.off();
	}
}
