package com.java8feature.javabrain;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread th = new Thread(()-> printMessage());
		Thread th1 = new Thread(MethodReferenceExample::printMessage);//Method Reference
		th1.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
