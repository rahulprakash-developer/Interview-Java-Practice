package com.java.ReferencetoInstanceMethodLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethodLambda {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Rahul", 22));
		personList.add(new Person("Rohan", 23));
		personList.add(new Person("Roma", 30));

		List<String> names = ReferenceToInstanceMethodLambda.getAllName(personList, Person::getName);
		names.forEach(System.out::println);

	}

	private static List<String> getAllName(List<Person> personList, Function<Person, String> f) {
		List<String> list = new ArrayList<>();
		personList.forEach(n -> list.add(f.apply(n)));

		return list;
	}

}
