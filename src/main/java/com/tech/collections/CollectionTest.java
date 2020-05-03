package com.tech.collections;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        iterateExample();
//        vectorExample();
//        stackExample();
//        dequeuExample();
//        setExample();
        sortedSetExample();
    }

    /**
     * SortedSet is the interface which extend the Set interface.
     * Its implementation is TreeSet.
     * - Its provide the ordering on its elements.
     * - Elements arranged in the increasing (ascending) order.
     */
    private static void sortedSetExample(){
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(1);
        sortedSet.add(1);
        sortedSet.add(4);

        Iterator<Integer> iterator = sortedSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    /**
     * It not allowed the duplicate item. Also its not in order form.
     * Implementation:
     * 1. HashSet: It uses a hash table for storage and Hashing is used to store the elements.
     * 2. LinkedHashSet: It extends the HashSet class and implements Set interface.
     * It maintains the insertion order and permits null elements.
     */
    private static void setExample(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * Deque interface extends the Queue interface.
     * In Deque, we can remove and add the elements from both the side.
     * ArrayDeque, is a implmentation of deque.
     * Also it's top interface is quque interface.
     */
    private static void dequeuExample(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); //F-1-L
        deque.addFirst(2); //F-21-L
        deque.addLast(3);  //F-213-L


        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        //output: 2,1,3
    }

    /**
     * Stack extend the vector class only. Means stack is implemented by Array in Java collection
     * class Stack<E> extends Vector<E>
     */
    private static void stackExample(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(2);

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * Vector is same as ArrayList
     * Only the difference is, ArrayList is not synchronized and vector is synchronized.
     * Vector is slow as it is thread safe. And Arraylist is fast.
     * If an element is inserted into the Array List, it increases its Array size by 50%.
     * Vector defaults to doubling size of its array.
     */
    private static void vectorExample(){
        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    /**
     * Collection extend the Iterable interface.
     * Iterable interface has only one method called iterator()
     * So each collection class has to implement it.
     * Iterator is an interface which has three methods: hasNext(), next(), remove()
     */
    private static void iterateExample() {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
