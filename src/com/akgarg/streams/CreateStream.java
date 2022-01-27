package com.akgarg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        // using collection classes
        List<Integer> marks = List.of(10, 15, 20, 25, 30, 35, 40, 45, 50);
        var collectionStream = marks.stream();
        var marksCount = collectionStream.count();
        var evenMarksCount = marks.stream().filter(mark -> mark % 2 == 0).count();
        System.out.println("Total count of marks: " + marksCount);
        System.out.println("Total count of even marks: " + evenMarksCount);
        System.out.println("===============================================");

        // using arrays
        String[] stringArray = {"Google", "Facebook", "Flipkart", "Amazon", "Swiggy"};
        var arrayStream = Arrays.stream(stringArray);
        var stringsCountHavingLengthMoreThanSix = arrayStream.filter(string -> string.length() > 6).count();
        System.out.println("Strings count having length more than six: " + stringsCountHavingLengthMoreThanSix);
        System.out.println("===============================================");

        // infinite stream
        Supplier<Integer> numberSupplier = () -> Double.valueOf(Math.random() * 100).intValue();
        var randomIntegersStream = Stream.generate(numberSupplier).limit(5);
        randomIntegersStream.forEach(System.out::println);

        var infiniteStream = Stream.iterate(1, n -> n + 1).limit(1);
        infiniteStream.forEach(System.out::println);
    }
}
