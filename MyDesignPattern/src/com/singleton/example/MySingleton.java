package com.singleton.example;

public class MySingleton {
	private static MySingleton mySingleton = null;
	
	private String message = "";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if(mySingleton == null) {
			mySingleton = new MySingleton();
		}
		return mySingleton;
	}
	
	
}
