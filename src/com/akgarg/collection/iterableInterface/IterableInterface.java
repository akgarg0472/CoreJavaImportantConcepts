package com.akgarg.collection.iterableInterface;

import com.akgarg.exception.CollectionException;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class IterableInterface<T> implements Iterable<T> {

    private final T[] collection;
    private int size;

    public IterableInterface(final int size) {
        this.collection = (T[]) new Object[size];
        this.size = 0;
    }

    public void insert(T element) {
        if (size == collection.length) {
            throw new CollectionException("Collection is full");
        }

        this.collection[size++] = element;
    }

    public T get(final int index) {
        if (index < 0 || index > this.collection.length - 1) {
            throw new CollectionException("Invalid index");
        }
        return this.collection[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new IterableInterfaceIterator<>();
    }

    private class IterableInterfaceIterator<E> implements Iterator<E> {
        private int currentIndex;

        public IterableInterfaceIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex != collection.length;
        }

        @Override
        public E next() {
            E element = (E) collection[currentIndex];
            currentIndex++;
            return element;
        }
    }

}
