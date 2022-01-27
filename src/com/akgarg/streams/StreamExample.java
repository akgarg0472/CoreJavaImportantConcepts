package com.akgarg.streams;

import java.util.List;
import java.util.function.Predicate;

public class StreamExample {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Student One", 20), new Student("Student Two", 25), new Student("Student Three", 30), new Student("Student Four", 15), new Student("Student Five", 45));

        // Imperative Programming
        var passedStudentsCount = 0;
        for (var student : students) {
            passedStudentsCount = student.getMarks() > 20 ? passedStudentsCount + 1 : passedStudentsCount;
        }
        System.out.println("Number of students passed in exam: " + passedStudentsCount);
        System.out.println("==========================================");

        // Declarative Programming
        Predicate<Student> passedStudentPredicate = student -> student.getMarks() > 20;
        var passedStudentsCountDeclarative = students.stream().filter(passedStudentPredicate).count();
        System.out.println("Number of students passed in exam: " + passedStudentsCountDeclarative);
        var passedStudents = students.stream().filter(passedStudentPredicate).toList();
        passedStudents.forEach(System.out::println);
        System.out.println("==========================================");

    }

}
