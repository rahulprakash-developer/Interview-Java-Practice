package com.java.defaultandstaticMethodExample;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface {

	@Override
	public int getMaxNumber(List<Integer> intList) {

		return Collections.max(intList);
	}
	
	
	/*
	 * @Override public static void getDetails() {
	 * System.out.println("Welcome Rahul"); } The method getDetails() of type
	 * MyClass must override or implement a supertype method
	 */

}
