package com.java8feature.javabrain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionIteratorExample {

	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(new Person("rahul ", "prakash", 32),
				new Person("Pandey ", "rajesh", 12), new Person("Jaya ", "minky", 22),
				new Person("Minky", "srivastave", 23));
		
		
		System.out.println("Using for Loop ");
		
		for(int i=0; i<personList.size();i++) {
			System.out.println(personList.get(i));
			
		}//external loop 
		
		System.out.println("Using Enhanced for  Loop ");
		
		for(Person p : personList) {
			System.out.println(p);
		}//external loop
		
		System.out.println("Using Lambda foreach method Loop ");
		
		personList.forEach((p) ->System.out.println(p));//lembda expression
		
		
		System.out.println("Using Method reference");
		personList.forEach(System.out::println);

	}

}

