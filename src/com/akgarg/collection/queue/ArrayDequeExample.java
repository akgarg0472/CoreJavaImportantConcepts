package com.akgarg.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("SimplifyStreamApiCallChains")
public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= 10; i++) {
            deque.offer(Double.valueOf(Math.random() * 100).intValue());
        }

        System.out.println("Deque: " + deque);
        System.out.println("Peek: " + deque.peek());
        System.out.println("Element: " + deque.element());
        System.out.println("After peek and element: " + deque);
        System.out.println("Get last: " + deque.getLast());
        System.out.println("===============================================");

        System.out.println("Poll: " + deque.poll());
        System.out.println("After Poll: " + deque);
        System.out.println("Poll last: " + deque.pollLast());
        System.out.println("After poll last: " + deque);
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("After Remove last: " + deque);
        System.out.println("Pop: " + deque.pop());
        System.out.println("After Pop: " + deque);
        System.out.println("===============================================");

        deque.offerLast(1000);
        System.out.println("After Offer last 1000: " + deque);
        System.out.println("Peek last: " + deque.peekLast());
        deque.addLast(2000);
        System.out.println("Add last 2000: " + deque);
        System.out.println("===============================================");

        System.out.println("Is deque empty: " + deque.isEmpty());
        System.out.println("Deque size: " + deque.size());
        deque.stream().forEach(System.out::println);
        deque.clear();
        System.out.println("After clear: " + deque);
        System.out.println("===============================================");
    }

}
