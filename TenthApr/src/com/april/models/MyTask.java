package com.april.models;

public class MyTask {
	public void connect() {
		System.out.println("Connected....");
	}
	
	public Runnable testconnect() {
		Runnable lmtt = () -> {
			MyTask lmt = new MyTask();
			lmt.connect();
		};
		return lmtt;
	}
}
