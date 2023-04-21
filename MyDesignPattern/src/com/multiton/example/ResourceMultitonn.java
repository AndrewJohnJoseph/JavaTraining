package com.multiton.example;

import java.util.*;

public class ResourceMultitonn {
	private static Map<String, Resource> minstances = new HashMap<>();
	private static final int MAX_INSTANCES = 3;

	private ResourceMultitonn() {
	}

	public static Resource getInstance(String key) {
		if (!minstances.containsKey(key) && minstances.size() < MAX_INSTANCES) {
			minstances.put(key, new Resource());
		}
		return minstances.get(key);
	}
}
