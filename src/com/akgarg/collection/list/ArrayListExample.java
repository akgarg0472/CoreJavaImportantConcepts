package com.akgarg.collection.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // creating arraylist to hold any type of value (not recommended)
        ArrayList listOne = new ArrayList();
        listOne.add(10);
        listOne.add("Ten");
        listOne.add(23.18d);
        System.out.println(listOne);

        System.out.println("==============");

        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(10);
        listTwo.add(20);
        listTwo.add(30);
        listTwo.add(40);
        // listTwo.add("StringOne"); // this is error
        // listTwo.add(23.18); // this is also error
        System.out.println(listTwo);

        var listThree = new ArrayList<Integer>();
        listThree.add(100);
        listThree.add(200);
        listThree.add(300);

        listTwo.addAll(listThree);
        System.out.println("listTwo after addition of listThree: " + listTwo);
        System.out.println("Contains all: " + listTwo.containsAll(listThree));
        listTwo.removeAll(listThree);
        System.out.println("listTwo after removal of listThree: " + listTwo);

        listTwo.stream().forEach(System.out::println);
        listThree.forEach(System.out::println);

        System.out.println("==============");

        ArrayList<String> listFour = new ArrayList<>();
        listFour.add("a");
        listFour.add("b");
        listFour.add("c");
        listFour.add("d");
        System.out.println(listFour.get(3));
        // System.out.println(listFour.get(23));   // exception since 23 is out of array index bounds
        System.out.println("listFour before removal of element at index 1: " + listFour);
        listFour.remove(1);
        System.out.println("listFour after removal of element at index 1: " + listFour);

        System.out.println("==============");
    }
}
