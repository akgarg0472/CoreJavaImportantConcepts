package com.akgarg.generics;

import com.akgarg.exception.CollectionException;

/**
 * Class to store generic type of data
 */
@SuppressWarnings({"unchecked", "unused"})
public class MyCollection<T> {

    private final T[] collection;
    private final int size;
    private int index;

    /**
     * Constructor to creates a new collection of specified size
     *
     * @param size total number of elements to store in the collection
     * @throws CollectionException if the provided size is less than 1
     */
    public MyCollection(int size) {
        if (size <= 0) {
            throw new CollectionException("Size of collection should be greater than zero");
        }

        this.collection = (T[]) new Object[size];
        this.index = 0;
        this.size = size;
    }

    /**
     * Inserts an element into the collection
     *
     * @param item Item to insert in the collection
     * @throws CollectionException if the collection is full to its capacity
     */
    public void addItem(T item) {
        if (this.index >= this.size) {
            throw new CollectionException("Collection has reached it's capacity");
        }

        this.collection[index] = item;
        index++;
    }

    /**
     * Returns the item of specified index
     *
     * @param index index to fetch value of
     * @return Returns the value stored at index provided
     * @throws CollectionException if the index provided is invalid
     */
    public T getItem(int index) {
        if (index < 0 || index >= this.size) {
            throw new CollectionException("Invalid index provided");
        }

        return this.collection[index];
    }

    /**
     * Returns the current size of the collection
     */
    public int getSize() {
        return this.index;
    }

    /**
     * Returns the total capacity of the collection
     */
    public int getCapacity() {
        return this.size;
    }

}
