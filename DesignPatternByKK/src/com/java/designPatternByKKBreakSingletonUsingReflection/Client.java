package com.java.designPatternByKKBreakSingletonUsingReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = null;

		Constructor<?>[] constructor = Singleton.class.getDeclaredConstructors();

		for (Constructor<?> constructor2 : constructor) {
			constructor2.setAccessible(true);// means you can access the private constructor

			Object object = constructor2.newInstance();

			singleton1 = (Singleton) object;
			
			break;

		}
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());


	}

}
