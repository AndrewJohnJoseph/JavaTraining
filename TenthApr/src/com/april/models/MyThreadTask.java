package com.april.models;

public class MyThreadTask implements Runnable {

	@Override
	public void run() {
		MyTask mt = new MyTask();
		mt.connect();
	}

}
