package com.java.ntt.interview;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class StudentFilterTest {


	@Test
    public void testFilterStudentsMaths() {
		Collection<Student> studentsCol = Arrays.asList(new Student(10, "Kishore", "Sankala", 60, 90, 59),
				new Student(11, "Sanjay", "Ramaswamy", 78, 89, 70), new Student(12, "Rakesh", "Gupta", 80, 100, 89),
				new Student(13, "Rinku", "Kumar", 92, 100, 98),
				new Student(14, "Priyadharshini", "Lawrence", 90, 100, 98),
				new Student(15, "Sujitha", "Sekar", 90, 100, 99),
				new Student(16, "Omprakash", "Bhawarlal", 92, 100, 94), new Student(17, "Swathi", "Rajan", 80, 80, 82),
				new Student(18, "Aruna", "K G", 98, 100, 100), new Student(19, "Bhanu", "Priya", 90, 94, 89),
				new Student(19, "Shruti", "K", 80, 70, 69));

		Collection<Student> result = StudentFilter.filterStudents(studentsCol, "Maths", 90, ">=");
		assertEquals(8, result.size());
	}

	@Test
    public void testFilterStudentsScience() {
		Collection<Student> studentsCol = Arrays.asList(new Student(10, "Kishore", "Sankala", 60, 90, 59),
				new Student(11, "Sanjay", "Ramaswamy", 78, 89, 70), new Student(12, "Rakesh", "Gupta", 80, 100, 89),
				new Student(13, "Rinku", "Kumar", 92, 100, 98),
				new Student(14, "Priyadharshini", "Lawrence", 90, 100, 98),
				new Student(15, "Sujitha", "Sekar", 90, 100, 99),
				new Student(16, "Omprakash", "Bhawarlal", 92, 100, 94), new Student(17, "Swathi", "Rajan", 80, 80, 82),
				new Student(18, "Aruna", "K G", 98, 100, 100), new Student(19, "Bhanu", "Priya", 90, 94, 89),
				new Student(19, "Shruti", "K", 80, 70, 69));

		Collection<Student> result = StudentFilter.filterStudents(studentsCol, "Science", 94, ">=");
		assertEquals(5, result.size());
	}
}
