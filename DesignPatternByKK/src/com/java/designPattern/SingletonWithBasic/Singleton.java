package com.java.designPattern.SingletonWithBasic;

public class Singleton {
	// Eager Example
	/*
	 * private static final Singleton INSTANCE = new Singleton();
	 * 
	 * private Singleton() {
	 * 
	 * }
	 * 
	 * public static Singleton getInstance() { return INSTANCE; }
	 */

	// Static Initiazation Example and here you do handle the exception as well
/*	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new Singleton();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
	*/
	
	//Lazy Iniatialization with Singleton
	
	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new Singleton();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

}
