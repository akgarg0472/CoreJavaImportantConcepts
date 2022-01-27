package com.akgarg.collection.set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("StringOne");
        set.add("StringTwo");
        set.add("StringThree");
        set.add("StringTwo");   // duplicate, will not be added
        set.add("StringOne");   // duplicate, will not be added
        set.add("StringFour");

        System.out.println(set);
        System.out.println("Set size: " + set.size());
        System.out.println("Set contains Player: " + set.contains("Player"));
        System.out.println("Set contains StringOne: " + set.contains("StringOne"));
    }
}
