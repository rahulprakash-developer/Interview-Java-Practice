package com.java.filterAndMatchExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.java.parallelStreamMultiThreadingExample.Student;

public class FilterAnMatchApiExample {
	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("RR", 22));
		stuList.add(new Student("KR", 23));
		stuList.add(new Student("TR", 24));
		stuList.add(new Student("BR", 25));
		stuList.add(new Student("CR", 30));
		stuList.add(new Student("SR", 33));
		stuList.add(new Student("UR", 34));
		
		//Using filter example
		Stream<Student> stream = stuList.stream().filter(s -> s.getAge() > 25);
		stream.forEach(System.out::println);

		System.out.println("------------------------");

		// Using allMatch Method with stream

		boolean allMatch = stuList.stream().allMatch(s -> s.getName().contains("R"));
		System.out.println(allMatch);

		System.out.println("----------------------------");
		// Using anyMatch Method with stream
		boolean anyMatch = stuList.stream().anyMatch(s -> s.getAge() > 35);
		System.out.println(anyMatch);

		System.out.println("----------------------------");

		// Using noneMatch Method with stream
		boolean noneMatch = stuList.stream().noneMatch(s -> s.getAge() > 34);
		System.out.println(noneMatch);

	}

}
