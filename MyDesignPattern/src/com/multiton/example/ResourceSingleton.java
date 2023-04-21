package com.multiton.example;

public class ResourceSingleton {
	private static Resource instance = new Resource();

	private ResourceSingleton() {
	}

	public static Resource getInstance() {
		return instance;
	}
}
