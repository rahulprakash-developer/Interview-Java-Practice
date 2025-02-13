package com.java.executorSingleThreadExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSingleThreadExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task");
		};

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task 2");

			}
		};

		executorService.submit(r);
		executorService.submit(r);
		executorService.submit(r);
		executorService.submit(r);

		executorService.submit(runnable);
		executorService.shutdown();
		executorService.shutdown();
	}

}
