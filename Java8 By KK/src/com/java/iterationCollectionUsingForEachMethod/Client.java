package com.java.iterationCollectionUsingForEachMethod;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("Rahul", 30));
		stuList.add(new Student("Roma", 29));
		stuList.add(new Student("Rohan", 27));

		// ForEach Method Using

		stuList.forEach((s) -> System.out.println(s)); // Lambda Expression

		
		
		// Using Method Reference

		stuList.forEach(System.out::println);//Method Reference

	}

}
