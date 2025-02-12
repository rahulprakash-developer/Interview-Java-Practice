package com.java.comparatorUsingLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Rahul", "rahu@g", 1000.0d));
		empList.add(new Employee("Abc", "roma@g", 9000.0d));
		empList.add(new Employee("Mohan", "rohan@g", 111000.0d));

	/*	System.out.println("Before Sorting-------------");

		empList.forEach(System.out::println);

		Collections.sort(empList, new EmployeeNameSorter());

		System.out.println("After Sorting-------------");*/

		

		// Using Annonymous Comparator
/*
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});*/
		
		
		
		//Using Java 8 Lambda Expression with Comparator
		
		Collections.sort(empList,(e1,e2)-> e1.getName().compareTo(e2.getName()));
		empList.forEach(System.out::println);
		
	}

}
