package com.akgarg.comparatorVsComparable;

import java.util.Comparator;

public class ComparatorImpl {

    public static void main(String[] args) {
        Student studentOne = new Student("Student One", 21, 2);
        Student studentTwo = new Student("Student Two", 25, 8);

        Comparator<Student> studentComparator = (s1, s2) -> {
            if (s1.getRollNumber() < s2.getRollNumber()) {
                return -1;
            } else if (s1.getRollNumber() > s2.getRollNumber()) {
                return 1;
            }
            return 0;
        };

        String studentsCompareResult = compareStudents(studentOne, studentTwo, studentComparator);
        System.out.println(studentsCompareResult);
    }

    private static String compareStudents(Student studentOne, Student studentTwo, Comparator<Student> studentComparator) {
        int comparatorResult = studentComparator.compare(studentOne, studentTwo);
        String result;

        if (comparatorResult < 0) {
            result = "Student One comes before student two";
        } else if (comparatorResult > 0) {
            result = "Student one comes after student one";
        } else {
            result = "Both students are equal";
        }

        return result;
    }

}
