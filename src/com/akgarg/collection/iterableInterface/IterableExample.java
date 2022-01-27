package com.akgarg.collection.iterableInterface;

import java.util.Iterator;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class IterableExample {

    public static void main(String[] args) {
        IterableInterface<Integer> integerIterableInterface = new IterableInterface<>(10);

        for (int loop = 1; loop <= 10; loop++) {
            integerIterableInterface.insert(loop * 10);
        }

        // before implementing Iterable, we have no mechanism to iterate over IterableInterface Collection.
        // so to address this problem, we have to use Iterable interface

        // after iterable implementation, now we can safely iterate over this custom collection without worrying about the internal implementation of the collection
        Iterator<Integer> integerIterator = integerIterableInterface.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        System.out.println("==============");

        for (Integer integer : integerIterableInterface) {
            System.out.println(integer);
        }
    }

}
