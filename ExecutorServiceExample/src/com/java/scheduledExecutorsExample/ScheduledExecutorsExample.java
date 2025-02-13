package com.java.scheduledExecutorsExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {

	public static void main(String[] args) {

		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);

		MyTask myTask = new MyTask();

		newScheduledThreadPool.schedule(myTask, 5, TimeUnit.SECONDS);
		newScheduledThreadPool.shutdown();
	}

}
