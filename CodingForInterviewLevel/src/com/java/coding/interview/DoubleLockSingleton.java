package com.java.coding.interview;

public class DoubleLockSingleton {

	public static void main(String[] args) {
		DoubleLockSingleton dd = DoubleLockSingleton.getInstance();
		dd.doSomething();

	}

	// Private constructor to prevent instantiation from outside the class
	// Volatile variable to hold the single instance of the class
	private static volatile DoubleLockSingleton instance;

	// Private constructor to prevent instantiation from outside the class
	private DoubleLockSingleton() {
	}

	// Static method to get the single instance of the class
	public static DoubleLockSingleton getInstance() {
		// Double-checked locking
		if (instance == null) {
			synchronized (DoubleLockSingleton.class) {
				if (instance == null) {
					instance = new DoubleLockSingleton();
				}
			}
		}
		return instance;
		
	}

	// Example method of the singleton class
	public void doSomething() {
		System.out.println("Singleton method called");
	}
}
