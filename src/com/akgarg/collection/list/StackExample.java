package com.akgarg.collection.list;

import java.util.Collections;
import java.util.Stack;

@SuppressWarnings("ConstantConditions")
public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < 10; i++) {
            stack.add(Double.valueOf(Math.random() * 100).intValue());
        }

        System.out.println("Before sorting: " + stack);
        Collections.sort(stack);
        System.out.println("After sorting: " + stack);

        System.out.println("Stack peek: " + stack.peek());  // peek returns the top element without removing it
        System.out.println("Stack after peek: " + stack);
        System.out.println("Stack pop: " + stack.pop());    // pop returns the top element and removes it
        System.out.println("Stack after pop: " + stack);

        stack.push(1000);   // insert an element at the end of the stack
        System.out.println("Stack after push: " + stack);

        System.out.println("Stack contains 100: " + stack.contains(100));
        System.out.println("Stack contains 1000: " + stack.contains(1000));

        System.out.println("Stack length: " + stack.size());
        System.out.println("Is stack empty: " + stack.isEmpty());

        stack.clear();
        System.out.println("Stack length after clear operation: " + stack.size());
        System.out.println("Stack after clear operation: " + stack);
    }

}
