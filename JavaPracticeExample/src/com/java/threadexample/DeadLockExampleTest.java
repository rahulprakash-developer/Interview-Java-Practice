package com.java.threadexample;

public class DeadLockExampleTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread mythread = new MyThread();
		Thread th = new Thread(mythread);
		th.start();
		
		Thread.sleep(500);
		System.out.println("State in "+th.getState());
		Thread.sleep(500);
		System.out.println("State up" + th.getState());
		
	}

}

class MyThread extends Thread {

	public void run() {
		Thread th = Thread.currentThread();

		for (int i = 0; i < 10; i++) {

			System.out.println(th.getName() + "value is " + i + "state is " + th.getState());
			
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}