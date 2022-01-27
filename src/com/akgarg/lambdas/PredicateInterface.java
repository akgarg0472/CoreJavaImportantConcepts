package com.akgarg.lambdas;

import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {
        Predicate<String> isStringNull = Objects::isNull;
        System.out.println(isStringNull.test("John Doe"));
        System.out.println(isStringNull.test(null));
        System.out.println("===================");

        IntPredicate isNumberLessThanFifty = value -> value > 50;
        for (int i = 0; i < 5; i++) {
            var number = Double.valueOf(Math.random() * 100).intValue();
            System.out.println(number + ": " + isNumberLessThanFifty.test(number));
        }
        System.out.println("===================");

        IntPredicate isNumberNegative = number -> number < 0;
        IntPredicate isNumberGreaterThanFifty = number -> number < 50;
        System.out.println(isNumberNegative.and(isNumberGreaterThanFifty).test(10));
        System.out.println(isNumberNegative.and(isNumberGreaterThanFifty).test(4));
        System.out.println(isNumberNegative.and(isNumberGreaterThanFifty).test(-2));
        System.out.println("===================");
    }

}
