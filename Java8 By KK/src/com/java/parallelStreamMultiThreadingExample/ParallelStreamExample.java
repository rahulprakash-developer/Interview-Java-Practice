package com.java.parallelStreamMultiThreadingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("RR", 22));
		stuList.add(new Student("KR", 23));
		stuList.add(new Student("TR", 24));
		stuList.add(new Student("BR", 25));
		stuList.add(new Student("CR", 30));
		stuList.add(new Student("SR", 33));
		stuList.add(new Student("UR", 34));

		Stream<Student> parallelStream = stuList.parallelStream();
		parallelStream.forEach(s -> doWorkProcess(s));

	}

	private static void doWorkProcess(Student s) {
		System.out.println(s);

	}
}
