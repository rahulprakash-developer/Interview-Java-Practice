package com.java.designpatter.PrototypeDesign;

import java.util.List;

public class PrototypeDesignTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		StudentDAO studDao = new StudentDAO();
		List<Student> list = studDao.getAllStudent();
		list.forEach(System.out::println);
		System.out.println("-----------------------");
		List<Student> updateList = studDao.clone();
		Student stu3 = new Student();
		stu3.setId(3);
		stu3.setName("Ram");
		updateList.add(stu3);
		updateList.forEach(System.out::println);

	}

}
