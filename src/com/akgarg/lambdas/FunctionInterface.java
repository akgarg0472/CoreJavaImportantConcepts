package com.akgarg.lambdas;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        // takes value of string type(T) and returns an integer (R) according to the input
        Function<String, Integer> stringToIntegerMapping = String::length;
        System.out.println(stringToIntegerMapping.apply("Java"));
        System.out.println(stringToIntegerMapping.apply("Oracle"));
        System.out.println(stringToIntegerMapping.apply("Amazon"));
        System.out.println("===================");

        // composing function: it is method to combine multiple functions to produce one output
        // assume, we are given with something like key:value, and we want to convert it into {key:value} format. Here we can use function composition to achieve the same.
        // in first phase, we will replace ':' with '=' and in second phase, we will add '{' and '}'.
        Function<String, String> replaceColonWithEqual = str -> str.replace(":", "=");
        Function<String, String> addCurlyBraces = str -> "{" + str + "}";
        Function<String, String> convertToUpperCase = String::toUpperCase;

        var nameFunction = replaceColonWithEqual.andThen(addCurlyBraces);
        var nameJohnDoe = nameFunction.apply("name : John Doe");
        System.out.println(nameJohnDoe);

        var cityFunction = replaceColonWithEqual.andThen(addCurlyBraces);
        var cityNewYork = cityFunction.apply("city : New York");
        var upperCaseCity = convertToUpperCase.apply(cityNewYork);
        System.out.println(cityNewYork);
        System.out.println(upperCaseCity);
        System.out.println("===================");
    }

}
