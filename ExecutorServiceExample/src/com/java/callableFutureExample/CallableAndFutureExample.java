package com.java.callableFutureExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureExample {

	public static void main(String[] args) {

		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "My Task is done";
			}

		};

		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<String> submit = newSingleThreadExecutor.submit(callable);
		if (submit.isDone()) {
			try {
				System.out.println(submit.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

			MyCallable task2 = new MyCallable(10);
			Future<Integer> submit2 = newSingleThreadExecutor.submit(task2);
			try {
				System.out.println(submit2.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		}

	}

}
