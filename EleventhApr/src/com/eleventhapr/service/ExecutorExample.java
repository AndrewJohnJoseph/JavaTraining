package com.eleventhapr.service;

import java.util.Random;
import java.util.concurrent.Callable;

public class ExecutorExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		return random.nextInt(100);
	}

}
