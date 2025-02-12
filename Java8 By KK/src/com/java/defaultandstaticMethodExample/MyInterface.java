package com.java.defaultandstaticMethodExample;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

	default public List<Student> getSortStudent(List<Student> stuList) {

		Collections.sort(stuList);

		return stuList;
	}

	public static void getDetails() {
		System.out.println("Welcome Rahul");
	}

	public abstract int getMaxNumber(List<Integer> intList);

	/*
	 * default public boolean equals(Object obj) { return (this == obj);// A default
	 * method cannot override a method from java.lang.Object }
	 */

}
