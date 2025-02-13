package com.designPatternByKKBreakSingletonUsingReflection.example;

public class Singleton {

	private static Singleton Instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (Instance == null) {
			Instance = new Singleton();
		}
		return Instance;
	}

}
