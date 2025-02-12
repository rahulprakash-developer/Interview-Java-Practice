package com.java.SetExample;

import java.util.HashSet;
import java.util.Set;

public class SortedSetExample {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();
		set.add(new Student("Rahul", 23));
		set.add(new Student("Rahul", 22));
		set.add(new Student("Cdb", 33));
		set.add(new Student("Mayank", 32));
		set.add(new Student("Chinki", 11));
		
		
		Student student1 = new Student("Rahul", 23);
		Student student2 = new Student("Rahul", 22);
		Student student3 = new Student("Cdb", 33);
		Student student4 = new Student("Mayank", 32);
		Student student5 = new Student("Chinki", 11);
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
		System.out.println(student5.hashCode());
		
		
		Set<String> set1 = new HashSet<String>();
		set1.add(null);
		set1.add(null);
		set1.add("Rahul");
		set1.add("Raam");
		set1.add("Roma");
		
		System.out.println(set.size());

		System.out.println("------------------------------");

		set.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		System.out.println(set1.size());
		
		set1.forEach(s->System.out.println(s));

	}

}
