package com.java8.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IterateMapListExample {
	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<Student>();
		// stuList.add(new Student("Raa","12"));
		// stuList.add(new Student("Roo", "32"));
		// stuList.add(new Student("Rom", "33"));

		Student st = new Student("Raa", "12");
		Student st1 = new Student("Rr", "12");
		Student st2 = new Student("ras", "12");
		Student st3 = new Student("dd", "12");


		Map<Student, String> map = new HashMap<Student, String>();
		map.put(st, "rr");
		map.put(st1, "yy");
		map.put(st2, "xx");

		// using iterators
		Iterator<Map.Entry<Student, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Student, String> entry = itr.next();
			if(entry.getKey().equals(st1)) {
				map.remove(st2, "xx");
				//map.remove(st1);
			}
			
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		Iterator<Student> it = stuList.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println("Value " + student);

		}

	}

}

class Student {
	String name;
	String age;

	Student(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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

}