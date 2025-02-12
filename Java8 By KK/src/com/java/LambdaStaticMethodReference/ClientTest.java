package com.java.LambdaStaticMethodReference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
	public static void main(String[] args) {
		
		ExecutorService executer = Executors.newSingleThreadExecutor();
		
		Runnable command = ClientTest::myRun;
		
		/*Here we are using method reference for Static method as you can 
		 * see the above code.
		 * * */
		
		executer.execute(command);
		
	}
	
	public static void myRun() {
		System.out.println("My task is running");
	}

}
