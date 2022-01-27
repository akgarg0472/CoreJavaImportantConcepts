package com.akgarg.generics;

public class Introduction {

    public static void main(String[] args) {
        var collection = new MyCollection<>(8);
        System.out.println(collection.getCapacity());

        for (int i = 0; i < 8; i++) {
            var item = "Item " + i;
            collection.addItem(item);
        }

        for (int i = 0; i < collection.getCapacity(); i++) {
            var item = collection.getItem(i);
            System.out.println(item);
        }
    }

}
