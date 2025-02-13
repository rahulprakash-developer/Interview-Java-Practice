package com.java.ntt.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Student {
    int studentId;
    String firstName;
    String lastName;
    int marksInEnglish;
    int marksInMaths;
    int marksInScience;

    public Student(int studentId, String firstName, String lastName, int marksInEnglish, int marksInMaths,
                   int marksInScience) {
    }
}

public class StudentFilter {
    public static Collection<Student> filterStudents(Collection<Student> studentsCol, String subjectName,
                                                     int cutOffMarks, String operation) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : studentsCol) {
            int marks;
            switch (subjectName) {
                case "Maths":
                    marks = student.marksInMaths;
                    break;
                case "Science":
                    marks = student.marksInScience;
                    break;
                default:
                    marks = 0;
            }

            switch (operation) {
                case ">=":
                    if (marks >= cutOffMarks) {
                        filteredStudents.add(student);
                    }
                    break;

            }
        }
        return filteredStudents;
    }

    /*
     * public static void main(String[] args) { Collection<Student> studentsCol =
     * Arrays.asList( new Student(10, "Kishore", "Sankala", 60, 90, 59), new
     * Student(11, "Sanjay", "Ramaswamy", 78, 89, 70), new Student(12, "Rakesh",
     * "Gupta", 80, 100, 89), new Student(13, "Rinku", "Kumar", 92, 100, 98), new
     * Student(14, "Priyadharshini", "Lawrence", 90, 100, 98), new Student(15,
     * "Sujitha", "Sekar", 90, 100, 99), new Student(16, "Omprakash", "Bhawarlal",
     * 92, 100, 94), new Student(17, "Swathi", "Rajan", 80, 80, 82), new Student(18,
     * "Aruna", "K G", 98, 100, 100), new Student(19, "Bhanu", "Priya", 90, 94, 89),
     * new Student(19, "Shruti", "K", 80, 70, 69) );
     *
     * Collection<Student> filteredStudents = filterStudents(studentsCol, "Maths",
     * 90, ">=");
     *
     * // Displaying the filtered students System.out.
     * println("Students with marks in Maths greater than or equal to 90:"); for
     * (Student student : filteredStudents) { System.out.println(student.firstName +
     * " " + student.lastName); } }
     */
}
