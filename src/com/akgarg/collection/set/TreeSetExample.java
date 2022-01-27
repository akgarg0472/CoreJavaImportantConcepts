package com.akgarg.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("DuplicatedCode")
public class TreeSetExample {

    public static void main(String[] args) {
        // TreeSet always store data in sorted manner
        TreeSet<String> set = new TreeSet<>();
        set.add("StringOne");
        set.add("StringTwo");
        set.add("StringThree");
        set.add("StringTwo");   // duplicate, will not be added
        set.add("StringOne");   // duplicate, will not be added
        set.add("StringFour");
        System.out.println(set);

        Comparator<String> setComparator = Comparator.reverseOrder();
        TreeSet<String> setTwo = new TreeSet<>(setComparator);
        setTwo.add("String1");
        setTwo.add("String22");   // duplicate, will not be added
        setTwo.add("String1");   // duplicate, will not be added
        setTwo.add("String4444");
        setTwo.add("String22");
        setTwo.add("String333");

        System.out.println(setTwo);
    }

}
