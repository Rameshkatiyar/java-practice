package com.tech.effectiveJava.CreatingAndDestroyingObjects;

//Example stream in collection.
public interface Number {
    static RandomNumber get(){
        return RandomNumber.of();
    }
}
