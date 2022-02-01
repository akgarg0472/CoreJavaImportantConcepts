package com.akgarg.oops.inheritance;

import java.util.Arrays;

public class Teacher extends Person {

    private String role;
    private int classNumber;
    private String[] subjects;

    public Teacher() {
    }

    public Teacher(String name, int age, String role, int classNumber, String[] subjects) {
        super(name, age);
        this.role = role;
        this.classNumber = classNumber;
        this.subjects = subjects;
    }

    public String getRole() {
        return role;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String[] getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role='" + role + '\'' +
                ", classNumber=" + classNumber +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
