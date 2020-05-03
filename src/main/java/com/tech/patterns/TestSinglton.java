package com.tech.patterns;

public class TestSinglton {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        instance.show();
    }
}
