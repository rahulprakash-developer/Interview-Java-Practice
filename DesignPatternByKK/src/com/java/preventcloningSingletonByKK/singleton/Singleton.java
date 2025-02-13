package com.java.preventcloningSingletonByKK.singleton;

public class Singleton implements Cloneable {

	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		throw new CloneNotSupportedException("You can not clone the singleton object");
		/*
		 * In this case you will get differen hashcode value as we are able to clone so
		 * to prevent this cloning with singleton you have to modify the clone method
		 * with remove the return statement and throw the exception
		 */
	}

}
