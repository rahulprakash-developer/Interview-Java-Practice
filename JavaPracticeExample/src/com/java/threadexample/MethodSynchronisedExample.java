package com.java.threadexample;

public class MethodSynchronisedExample {
	public static void main(String[] args) {

		Hello h = new Hello();
		Hello h1 = new Hello();
		MyThread1 th = new MyThread1(h);
		MyThread1 th1 = new MyThread1(h1);

		th.start();
		th1.start();

	}

}

class MyThread1 extends Thread {

	Hello h = null;

	public MyThread1(Hello h) {
		this.h = h;
	}

	public void run() {
		h.show();

	}

	@Override
	public String toString() {
		return "MyThread1 [h=" + h + "]";
	}

}

class Hello {

	synchronized void show() {
		Thread th = Thread.currentThread();

		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + "-SHOW :" + i + "\t" + this);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}