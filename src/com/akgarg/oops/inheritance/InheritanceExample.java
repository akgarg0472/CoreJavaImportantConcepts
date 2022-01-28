package com.akgarg.oops.inheritance;

import java.util.Arrays;

public class InheritanceExample {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("TeacherName", 41, "Teacher", 10, new String[]{"English", "C++", "Java"});

        // inherited from person class
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getRole());
        System.out.println(teacher.getClassNumber());
        System.out.println(Arrays.toString(teacher.getSubjects()));
    }

}
