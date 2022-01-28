package com.akgarg.oops.classAndObject;

public class ClassExample {

    public static void main(String[] args) {
        // Reference to hold the object     // actual object
        UserClass userClassReference = new UserClass();
        userClassReference.setName("username");
        userClassReference.setAge(21);
        System.out.println(userClassReference.getName());
        System.out.println(userClassReference.getAge());
    }

}
