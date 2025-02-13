package com.java.coding.interview.java21;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Virtual Thread : " + Thread.currentThread().getName() + ", count : " + i);
				try {
					Thread.sleep(1000); // Simulating some work
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread: " + Thread.currentThread().getName() + ", Count: " + i);
			try {
				Thread.sleep(1000); // Simulating some work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		future.get();
		
		Runnable runnable = () -> {
			//System.out.println("Inside Runnable");
		};
		
		//Thread.startVirtualThread(runnable);
		
		//Thread virtualThread = Thread.ofVirtual().start(runnable);
		
		//System.out.println(virtualThread.currentThread().getName());
		
		
		//ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
		//executor.submit(runnable);
		//System.out.println(executor);



	}

}
