package com.java.multipleWorkerThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleWorkerThreadExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task1 Started");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("My Task1 Ends");
		};

		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task2 Started");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("My Task2 Ends");
		};

		Runnable task3 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task3 Started");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("My Task3 Ends");
		};

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown();
	}

}
