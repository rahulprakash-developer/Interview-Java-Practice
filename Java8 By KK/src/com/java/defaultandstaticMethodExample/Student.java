package com.java.defaultandstaticMethodExample;

public class Student implements Comparable<Student> {
	private String name;
	private String age;

	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}

}
