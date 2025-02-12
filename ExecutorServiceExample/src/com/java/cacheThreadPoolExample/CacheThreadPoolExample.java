package com.java.cacheThreadPoolExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();

		for (int i = 0; i <= 100; i++) {
			executorService.submit(new MyTask());
		}
		executorService.shutdown();
	}

}

class MyTask implements Callable<Integer> {

	private Integer number = 10;

	@Override
	public Integer call() throws Exception {
		System.out.println(number);
		return number;
	}

}
