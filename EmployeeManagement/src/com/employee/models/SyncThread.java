package com.employee.models;

public class SyncThread extends Thread {
	TestThread t1 = new TestThread();
	
	public SyncThread(TestThread t1) {
		this.t1 = t1;
	}
	
	public void run() {
		t1.printnumbers();
	}
}


