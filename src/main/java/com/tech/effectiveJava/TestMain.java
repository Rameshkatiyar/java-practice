package com.tech.effectiveJava;

import com.tech.effectiveJava.CreatingAndDestroyingObjects.Number;
import com.tech.effectiveJava.CreatingAndDestroyingObjects.RandomNumber;

import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        RandomNumber ranNum1 = RandomNumber.of();
        RandomNumber ranNum2 = RandomNumber.of();

        System.out.println(ranNum1 == ranNum2);
        System.out.println(ranNum1);
        System.out.println(ranNum2);
        System.out.println(Number.get());

        List<Integer> integers = Arrays.asList(1, 2, 3);

    }
}
