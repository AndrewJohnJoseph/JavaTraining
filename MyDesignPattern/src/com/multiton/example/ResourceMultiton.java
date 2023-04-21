package com.multiton.example;

import java.util.HashMap;
import java.util.Map;

public class ResourceMultiton {
	private static Map<String, Resource> instances = new HashMap<>();

	private ResourceMultiton() {
	}

	public static synchronized Resource getInstance(String key) {
		if (!instances.containsKey(key)) {
			instances.put(key, new Resource());
		}
		return instances.get(key);
	}
}
