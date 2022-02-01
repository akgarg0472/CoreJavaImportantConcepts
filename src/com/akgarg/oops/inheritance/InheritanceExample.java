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

        // Downcasting and Upcasting example
        Teacher teacher1 = new Teacher();
        teacher1.setName("I'm a Teacher");
        print(teacher1);

        Person person = new Person();
        person.setName("I'm a Person");
        print(person);
    }

    
    private static void print(Person person) {
        // can cause ClassCastException if supplied person is not an instance of Teacher class
        // Error Prone code
        // Teacher teacher = (Teacher) person;
        // System.out.println(teacher.getName());

        // correct way to handle this situation
        if (person instanceof Teacher teacher) {
            System.out.println(teacher.getName());
        } else {
            System.out.println(person.getName());
        }
    }

}
