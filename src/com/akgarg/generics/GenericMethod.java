package com.akgarg.generics;

public class GenericMethod {

    public static void main(String[] args) {
        var additionResult = genericMethod(10, 10.5);
        System.out.println(additionResult);
    }

    public static <T extends Number> T genericMethod(T paramOne, T paramTwo) {
        return paramOne;
    }

}
