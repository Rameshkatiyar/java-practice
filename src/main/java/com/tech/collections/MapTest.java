package com.tech.collections;

import java.util.*;

/**
 * Java Map is not a part of java collection, because it has key value pare value.
 */
public class MapTest {
    public static void main(String[] args) {
//        mapExample();
        sortedMapExample();
    }

    /**
     * It's implement the map interface.
     * how different from hashmap? Answer: Hashtable is synchronized. It is thread-safe and can be shared with many threads.
     * Hashtable inherits Dictionary class.
     */
    private static void hashTable(){
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "ramesh");
        hashtable.put(2, "katiyar");

    }

    /**
     * Map interface has two implementation
     * 1. HashMap: it doesn't maintain any order.
     * 2. LinkedHashMap: It inherits HashMap class. It maintains insertion order.
     *
     * Also it has one inner or sub interface called: Map.Entry Interface
     * It provides methods to get key and value.
     */
    private static void mapExample(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ramesh");
        map.put(1, "Katiyar");
        map.put(2, "rahul");
        map.put(3, "santhosh");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

    }

    /**
     * SortedMap: It is an interface which extend the Map interface.
     * TreeMap is the implementation of Map and SortedMap. It maintains ascending order of keys.
     */
    private static void sortedMapExample(){
        Map<Integer, String> map = new TreeMap<>();
        map.put(0, "z");
        map.put(1, "ramesh");
        map.put(1, "Katiyar");
        map.put(2, "rahul");
        map.put(3, "a");


        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

    }
}
