package com.akgarg.oops.polymorphism;

@SuppressWarnings("SameParameterValue")
public class PolymorphismOverloadingExample {

    public static void main(String[] args) {
        var sumOne = sum(10, 20);
        var sumTwo = sum(10, 20, 30);

        System.out.println(sumOne);
        System.out.println(sumTwo);
    }

    private static int sum(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }

    private static int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
