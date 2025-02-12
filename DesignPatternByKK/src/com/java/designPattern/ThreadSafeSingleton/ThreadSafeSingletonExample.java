package com.java.designPattern.ThreadSafeSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeSingletonExample {
	
	public static void main(String[] args) {
		ExecutorService executors = null;
		MyThread mythread = new MyThread();
		try {
			executors = Executors.newFixedThreadPool(5);
			executors.execute(mythread);
			executors.execute(mythread);
			executors.execute(mythread);
			executors.execute(mythread); 	
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(executors!=null) {
				executors.shutdown();
			}
		}
	}
	
	

}

/*If you define the thread pool size as 1 then it will give u same hashcode 
 * and it wont break the singleton rule, for breaking the rule of singleton you can
 * increase the thread pool then it will break the singleton rule with threa
 * */

