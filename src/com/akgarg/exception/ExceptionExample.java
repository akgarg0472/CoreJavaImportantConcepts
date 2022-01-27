package com.akgarg.exception;

import java.util.Random;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int random = new Random().nextInt(100);
            if (random % 2 == 0) {
                throw new Exception("This is custom exception");
            }

            User user = new User();
            user.setName("Username");
            user.setAge(-1);
            System.out.println(user);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executing");
        }

    }

}
