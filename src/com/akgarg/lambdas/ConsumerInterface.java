package com.akgarg.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c", "d", "e");

        for (var string : strings) {
            System.out.println(string);
        }
        System.out.println("============");

        strings.forEach(System.out::println);
        System.out.println("============");

        // consumers chaining
        Consumer<String> display = System.out::println;
        Consumer<String> displayUppercase = string -> System.out.println(string.toUpperCase());
        Consumer<String> displayAscii = string -> System.out.println(Integer.valueOf(string.charAt(0)));
        strings.forEach(display.andThen(displayUppercase).andThen(displayAscii));
        System.out.println("============");
    }

}
