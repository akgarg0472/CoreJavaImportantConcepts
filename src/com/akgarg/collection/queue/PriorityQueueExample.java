package com.akgarg.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("DuplicatedCode")
public class PriorityQueueExample {

    public static void main(String[] args) {
        // queue interface is used only for Single ended queue (Front end)
        Comparator<Integer> integerComparator = (i1, i2) -> Integer.compare(i2, i1);
        PriorityQueue<Integer> queue = new PriorityQueue<>(integerComparator);

        for (int i = 1; i <= 10; i++) {
            queue.offer(Double.valueOf(Math.random() * 100).intValue());
        }

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}
