package com.java.coding.interview;

import java.util.HashMap;
import java.util.Objects;

public class HashMapInterviewQuestionExample {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp.setName("Rahul");
		emp1.setName("Rahul");

		HashMap<Employee, String> hashMap = new HashMap<Employee, String>();
		hashMap.put(emp, "Java");
		hashMap.put(emp1, "Java");
		// hashMap.put(emp2, "Java");
		emp2.setName("Rahul Prakash");

		System.out.println(hashMap.get(emp2));

	}

}

class Employee {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
