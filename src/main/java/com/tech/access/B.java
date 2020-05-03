package com.tech.access;

public class B {
    private static A a = new A();

    public static void main(String[] args) {
        a.defaultMethod();
        a.protectedMethod();
        a.pubMethod();
    }
}
