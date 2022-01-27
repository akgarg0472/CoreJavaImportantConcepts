package com.akgarg.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // queue interface is used only for Single ended queue (Front end)
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            queue.offer(Double.valueOf(Math.random() * 100).intValue());
        }

        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());
        System.out.println("After peek and element: " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        queue.offer(1000);
        System.out.println("After offer 1000: " + queue);
        System.out.println("===============================================");
    }

}
