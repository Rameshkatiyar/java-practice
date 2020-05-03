package com.tech.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethodTest {
    public static void main(String[] args) {
        List<Integer> collection = getCollection();

        print(collection);
        Collections.sort(collection, Collections.reverseOrder());
        System.out.println("Sorted:");
        print(collection);


    }

    private static void print(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static List<Integer> getCollection(){
        List<Integer> listOfvalues = new LinkedList<>();
        listOfvalues.add(1);
        listOfvalues.add(3);
        listOfvalues.add(2);
        listOfvalues.add(5);
        listOfvalues.add(4);
        listOfvalues.add(1);

        return listOfvalues;
    }
}
