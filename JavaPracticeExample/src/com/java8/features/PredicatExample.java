package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class PredicatExample {

	public static void main(String[] args) {

		List<PredicateTest> predicateLits = new ArrayList<PredicateTest>();

		predicateLits.add(new PredicateTest("Rahul", 12));
		predicateLits.add(new PredicateTest("Rr", 13));

	}

}

class PredicateTest {
	private String name;
	private int age;

	public PredicateTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PredicateTest [name=" + name + ", age=" + age + "]";
	}

}
