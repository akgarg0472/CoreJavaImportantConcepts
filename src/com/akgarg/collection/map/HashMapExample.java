package com.akgarg.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("KeyOne", 10);
        map.put("KeyTwo", 20);
        map.put("KeyThree", 30);
        map.put("KeyFour", 40);
        map.put("KeyFive", 50);
        System.out.println("Map: " + map);

        System.out.println("==========================================");

        map.putIfAbsent("KeyOne", 100);
        map.putIfAbsent("KeySix", 60);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Value of key " + entry.getKey() + " is " + entry.getValue());
        }

        System.out.println("==========================================");

        map.remove("KeyFive");
        System.out.println("Map after removing ket KeyFive: " + map);
        System.out.println("Entry set: " + map.entrySet());
        System.out.println("Does map contains key KeyValue: " + map.containsKey("KeyValue"));
        System.out.println("Does map contains key KeyFour: " + map.containsKey("KeyFour"));
        System.out.println("Map keys: " + map.keySet());
        System.out.println("Map values: " + map.values());
        System.out.println("Value of key KeyTwo: " + map.get("KeyTwo"));
        System.out.println("Value of key KeyEighteen: " + map.getOrDefault("KeyEighteen", Integer.MIN_VALUE));
        System.out.println("Size of map: " + map.size());
        map.clear();
        System.out.println("Map after clearing map: " + map);

        System.out.println("==========================================");
    }

}
