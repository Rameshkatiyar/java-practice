package com.tech.java8;

import com.tech.access.A;

public class D extends A {
    public static void main(String[] args) {
        D d = new D();
        d.protectedMethod();
        d.pubMethod();

        A a = new A();
        a.pubMethod();
    }
}
