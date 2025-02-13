package com.java.designPattern.ThreadSafeSingleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = -578576146652406652L;
	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new Singleton();

				}
			}
			

		}
		return instance;
	}

}
