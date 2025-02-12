package com.java8feature.javabrain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LembdaExampleUsingJava7 {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("rahul ", "prakash", 32),
				new Person("Pandey ", "rajesh", 12), new Person("Jaya ", "minky", 22),
				new Person("Minky", "srivastave", 23));

		

		
		
		// Before Java8 Use
		
		// Step sort list by last name

		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLname().compareTo(o2.getLname());
			}

		});

		// create a method that prints all the element in list

		printAllList(personList);
		printLastNameBegininWithR(personList);
		printConditionally(personList, new Condtion() {

			@Override
			public boolean test(Person p) {
				return p.getLname().startsWith("r");
			}
			
		});
	}

	
	
	private static void printConditionally(List<Person> personList,Condtion condition) {
		for (Person person : personList) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
		
	}
	
	// create the method that prints all people that have last name beginging with R

	private static void printLastNameBegininWithR(List<Person> personList) {
		for (Person person : personList) {
			if(person.getLname().startsWith("r")) {
				System.out.println(person);

			}
		}
		
	}

	private static void printAllList(List<Person> personList) {

		for (Person person : personList) {
			System.out.println(person);
		}
	}
	


}
