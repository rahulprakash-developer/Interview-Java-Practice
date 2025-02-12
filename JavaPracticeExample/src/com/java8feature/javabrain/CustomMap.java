package com.java8feature.javabrain;

import java.util.HashMap;
import java.util.Map;

public class CustomMap {

	public static void main(String[] args) {
		Map<EmployeeMap, Integer> emp = new HashMap<>();

		emp.put(new EmployeeMap("hello", "23", 12), 1);
		emp.put(new EmployeeMap("hello", "24", 12), 2);
		emp.put(new EmployeeMap("Raam", "23", 19), 3);
		
		

		emp.forEach((k, v) -> {
			System.out.println("K : " + k + "V : " + v);

		});
		System.out.println(emp.size());

		/*
		 * Map m = new HashMap<>(); m.put("Abc", 1); m.put("bbc", 2); m.put("Abc", 3);
		 * 
		 * m.get("Abc");
		 * 
		 * m.forEach((k, v) -> { System.out.println("K : " + k + "V : " + v);
		 * 
		 * 
		 * });
		 */

	}

}

class EmployeeMap {

	private String name;
	private String age;
	private int id;

	public EmployeeMap(String name, String age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		EmployeeMap other = (EmployeeMap) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeMap [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
