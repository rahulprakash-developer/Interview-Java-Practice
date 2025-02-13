package com.java.scheduledExecutorsExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsPeriodicExample {

	public static void main(String[] args) {
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);

		MyTask myTask = new MyTask();

		newScheduledThreadPool.scheduleAtFixedRate(myTask, 5, 3, TimeUnit.SECONDS);
	}

}
