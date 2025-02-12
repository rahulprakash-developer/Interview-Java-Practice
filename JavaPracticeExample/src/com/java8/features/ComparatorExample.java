package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparatorExample {
	public static void main(String[] args) {
		Person p1 = new Person(12, "Ram", "Patna");
		Person p2 = new Person(12, "Abc", "Pune");
		Person p3 = new Person(12, "Ram", "Purnia");
		Person p4 = new Person(12, "rammmmm", "Patna");
		Person p5 = new Person(12, "Raju", "Patna");

		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		for ( Person person : personList) {
			System.out.println("person" + person);
		}
		
		Collections.unmodifiableList(personList);
		
		personList.add(new Person(12, "hhh", "dd"));
		
		for ( Person person : personList) {
			
			System.out.println("person after" + person);
		}
		
		
		
		
		
		
		//personList.remove(p3);
		
		

		//personList.sort((Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));

		//personList.forEach((developer) -> System.out.println(developer));
		
		//Comparator<Person> comparePerson = (Person pp,Person pep)->pp.getName().compareTo(pep.getName());
		//personList.sort(comparePerson);
		//personList.forEach((developer) -> System.out.println(developer));
		

	}

}

class Person  {
	private int age;
	private String name;
	private String address;

	public Person(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)

			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}



}