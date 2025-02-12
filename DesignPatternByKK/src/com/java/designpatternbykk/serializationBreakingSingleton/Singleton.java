package com.java.designpatternbykk.serializationBreakingSingleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = -578576146652406652L;
	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}

	private Object readResolve() {
		return getInstance();// if you override this method it will not break the Singleton Rule

	}
}
