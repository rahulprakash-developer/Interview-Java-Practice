package com.java.defaultandstaticMethodExample;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		MyInterface myinterface = new MyClass();
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Rahul", "33"));
		studentList.add(new Student("Abhay", "12"));
		studentList.add(new Student("Roma", "22"));
		studentList.add(new Student("Balu", "66"));

		List<Student> list = myinterface.getSortStudent(studentList);
		for (Student student : list) {
			System.out.println("Student Data ::" + student.getName() + "\t" + student.getAge());
		}

		System.out.println("================================");

		// calling static method

		MyInterface.getDetails();

		System.out.println("================================");

		List<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(555);
		intList.add(797809);
		intList.add(333);
		int max = myinterface.getMaxNumber(intList);
		
		System.out.println("Max number "+ max);

	}

}
