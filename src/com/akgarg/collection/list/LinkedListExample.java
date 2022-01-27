package com.akgarg.collection.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linkedList.add(Double.valueOf(Math.random() * 100).intValue());
        }

        System.out.println("LinkedList before sorting: " + linkedList);
        Comparator<Integer> linkedListSortComparator = Integer::compareTo;
        linkedList.sort(linkedListSortComparator);
        System.out.println("LinkedList after sorting using comparator: " + linkedList);

        linkedList.removeFirst();
        System.out.println("LinkedList after removal of first element: " + linkedList);
        linkedList.addFirst(1000);
        System.out.println("LinkedList after addition of 1000 as first element: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("LinkedList after sorting using Collections utility class: " + linkedList);
    }

}
