package com.java8feature.javabrain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LembdaExampleUsingJava8 {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("rahul ", "prakash", 32),
				new Person("Pandey ", "rajesh", 12), new Person("Jaya ", "minky", 22),
				new Person("Minky", "srivastave", 23));

		// Step sort list by last name

		Collections.sort(personList, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		

		

		// create a method that prints all the element in list

		printConditionally(personList, p -> true,p -> System.out.println(p));
		printConditionally(personList, p -> p.getFname().startsWith("r"),p -> System.out.println(p));
		printConditionally(personList, p -> p.getLname().startsWith("r"),p -> System.out.println(p.getLname()));
	}

	private static void printConditionally(List<Person> personList, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : personList) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}


}
