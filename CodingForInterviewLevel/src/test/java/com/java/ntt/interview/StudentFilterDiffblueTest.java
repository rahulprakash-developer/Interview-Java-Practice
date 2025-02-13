package com.java.ntt.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class StudentFilterDiffblueTest {
    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents() {
        // Arrange and Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(new ArrayList<>(),
                "Hello from the Dreaming Spires", 1, "Operation");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertTrue(actualFilterStudentsResult.isEmpty());

    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents2() {
        // Arrange
        LinkedHashSet<Student> studentsCol = new LinkedHashSet<>();
        Student student = new Student(1, "Jane", "Doe", 1, 1, 1);

        studentsCol.add(student);

        // Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(studentsCol, "Maths", 0, ">=");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertEquals(1, actualFilterStudentsResult.size());
        assertSame(student, ((List<Student>) actualFilterStudentsResult).get(0));
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents3() {
        // Arrange
        LinkedHashSet<Student> studentsCol = new LinkedHashSet<>();
        studentsCol.add(new Student(1, "Jane", "Doe", 1, 1, 1));

        // Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(studentsCol, "Maths", 1, ">=");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertTrue(actualFilterStudentsResult.isEmpty());
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents4() {
        // Arrange
        LinkedHashSet<Student> studentsCol = new LinkedHashSet<>();
        Student student = new Student(1, "Jane", "Doe", 1, 1, 1);

        studentsCol.add(student);

        // Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(studentsCol, "Science", 0, ">=");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertEquals(1, actualFilterStudentsResult.size());
        assertSame(student, ((List<Student>) actualFilterStudentsResult).get(0));
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents5() {
        // Arrange
        ArrayList<Student> studentsCol = new ArrayList<>();
        studentsCol.add(new Student(1, "Jane", "Doe", 1, 1, 1));

        // Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(studentsCol,
                "Hello from the Dreaming Spires", 1, "Operation");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertTrue(actualFilterStudentsResult.isEmpty());
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    void testFilterStudents6() {
        // Arrange
        ArrayList<Student> studentsCol = new ArrayList<>();
        studentsCol.add(new Student(1, "Jane", "Doe", 1, 1, 1));
        studentsCol.add(new Student(1, "Jane", "Doe", 1, 1, 1));

        // Act
        Collection<Student> actualFilterStudentsResult = StudentFilter.filterStudents(studentsCol,
                "Hello from the Dreaming Spires", 1, "Operation");

        // Assert
        assertTrue(actualFilterStudentsResult instanceof List);
        assertTrue(actualFilterStudentsResult.isEmpty());
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFilterStudents7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "marksInMaths" because "student" is null
        //       at com.java.ntt.interview.StudentFilter.filterStudents(StudentFilter.java:28)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        LinkedHashSet<Student> studentsCol = new LinkedHashSet<>();
        studentsCol.add(null);

        // Act
        StudentFilter.filterStudents(studentsCol, "Maths", 0, ">=");
    }

    /**
     * Method under test:
     * {@link StudentFilter#filterStudents(Collection, String, int, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFilterStudents8() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "marksInScience" because "student" is null
        //       at com.java.ntt.interview.StudentFilter.filterStudents(StudentFilter.java:31)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        LinkedHashSet<Student> studentsCol = new LinkedHashSet<>();
        studentsCol.add(null);

        // Act
        StudentFilter.filterStudents(studentsCol, "Science", 0, ">=");
    }
}
