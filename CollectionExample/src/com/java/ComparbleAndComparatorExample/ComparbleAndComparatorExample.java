package com.java.ComparbleAndComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparbleAndComparatorExample {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();
		Person person = new Person(12, "Rahul", "Bangalore");
		Person person1 = new Person(10, "Jaya", "Patna");
		Person person2 = new Person(15, "Tash", "Motihari");
		personList.add(person);
		personList.add(person1);
		personList.add(person2);
		Collections.reverse(personList);
		//Collections.sort(personList, new NameComparator());
		//Collections.sort(personList, new AddressComparator());
		personList.forEach(pers -> System.out.println(pers));
		
		Person latest = Collections.max(personList,
                Comparator.comparing(s -> s.persoon_id));
		System.out.println("Latest " + latest);

	}

}

class Person implements Comparable<Person> {

	int persoon_id;
	String name;
	String address;

	public Person(int persoon_id, String name, String address) {
		super();
		this.persoon_id = persoon_id;
		this.name = name;
		this.address = address;
	}

	@Override
	public int compareTo(Person o) {
		return this.persoon_id - o.persoon_id;
	}

	@Override
	public String toString() {
		return "Person [persoon_id=" + persoon_id + ", name=" + name + ", address=" + address + "]";
	}

}

class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}

}

class AddressComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.address.compareTo(o2.address);
	}

}
