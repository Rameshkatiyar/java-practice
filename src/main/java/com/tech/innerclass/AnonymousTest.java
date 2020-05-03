package com.tech.innerclass;

/**
 * It should be used if you have to override method of class or interface.
 */
public class AnonymousTest {

    public static void main(String[] args) {
        AbstractEat abstractEat = new AbstractEat() {
            @Override
            void eat() {
                System.out.println("eat food now!");
            }
        };

        abstractEat.eat();
    }

}
