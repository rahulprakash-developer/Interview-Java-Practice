package com.java.scheduledExecutorsExample;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("My Task is Started");
		System.out.println("My Task ends");

	}

}
