package com.tech.effectiveJava.CreatingAndDestroyingObjects;

public class RandomNumber {
    private static RandomNumber RAN_NUM = new RandomNumber(10);

    private final int number;

    private RandomNumber(int num){
        System.out.println("Constructor!!!");
        this.number = num;
    }

    public static RandomNumber of(){
        return RAN_NUM;
    }
}
