package com.java.designpatter.PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {

	private static List<Student> studelist;

	static {
		studelist = new ArrayList<>();
		Student stu = new Student();
		stu.setId(1);
		stu.setName("Rahul");

		Student stu1 = new Student();
		stu1.setId(2);
		stu1.setName("Rohan");
		studelist.add(stu1);
		studelist.add(stu);

	}

	public List<Student> getAllStudent() {
		return studelist;
	}

	@Override
	protected List<Student> clone() throws CloneNotSupportedException {
		List<Student> newList = new ArrayList<>();
		for (Student student : studelist) {
			newList.add(student);
		}

		return newList;
	}
}
