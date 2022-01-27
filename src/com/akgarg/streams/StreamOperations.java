package com.akgarg.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class StreamOperations {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Student One", 20), new Student("Student Two", 25), new Student("Student Three", 30), new Student("Student Four", 15), new Student("Student Five", 45), new Student("Student Six", 25));

        // Mapping only name of student
        Function<Student, String> nameMapFunction = Student::getName;
        var studentNameStream = students.stream().map(nameMapFunction);
        studentNameStream.forEach(System.out::println);
        System.out.println("==========================================");

        // Stream slicing operations
        // takeWhile(Predicate), dropWhile(Predicate<T>), skip(n)
        students.stream().skip(2).forEach(System.out::println); // skips first two items
        System.out.println("==========================================");
        students.stream().takeWhile(student -> student.getName().length() <= 11).forEach(System.out::println);  // only select content until this predicate is true. As soon as predicate become false, stream stops operation
        System.out.println("==========================================");
        students.stream().dropWhile(student -> student.getName().length() <= 11).forEach(System.out::println);  // only select content after this predicate becomes false. As long as predicate is true stream keeps skipping the element
        System.out.println("==========================================");

        // sorting stream data
        Comparator<Student> studentSortByNameComparator = Comparator.comparing(Student::getName);
        /*
            // Above written code is equivalent to:
            Comparator<Student> studentSortByNameComparator = (studentOne, studentTwo) -> studentOne.getName().compareTo(studentTwo.getName());
        * */
        students.stream().sorted(studentSortByNameComparator).forEach(System.out::println);
        System.out.println("==========================================");

        // getting only unique values using distinct() method
        students.stream().map(Student::getMarks).distinct().forEach(System.out::println);
        System.out.println("==========================================");

        // reducing stream
        List<Student> collect = students.stream().toList();
        System.out.println(collect);

        boolean doesAllStudentsHaveMarksGreaterThanTwenty = students.stream().allMatch(student -> student.getMarks() > 20);
        System.out.println("Does all students score more than 20: " + doesAllStudentsHaveMarksGreaterThanTwenty);

        Comparator<Student> maxMarksStudentComparator = Comparator.comparing(Student::getMarks);
        var maxMarksStudent = students.stream().max(maxMarksStudentComparator).get();
        System.out.println("Max Marks Student: " + maxMarksStudent);

        BinaryOperator<Integer> totalMarksObtainedBO = Integer::sum;
        /*
            // Above code is equivalent to following code
            BinaryOperator<Integer> totalMarksObtainedBO = (current, total) -> current + total;
        * */
        var totalMarksObtained = students.stream().map(Student::getMarks).reduce(totalMarksObtainedBO);
        System.out.println("Total marks obtained: " + totalMarksObtained.orElse(-1));
    }

}
