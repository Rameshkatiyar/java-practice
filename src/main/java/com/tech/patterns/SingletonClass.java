package com.tech.patterns;

public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return singletonClass;
    }

    public void show(){
        System.out.println("Singleton class...!!!");
    }
}
