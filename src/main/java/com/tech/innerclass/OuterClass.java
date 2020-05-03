package com.tech.innerclass;

public class OuterClass {
    public int age = 10;
    public void showAge(){
        System.out.println("Outer age: "+age);
    }

    public class InnerClass{
        public void displayAge(){
            System.out.println("Inner age: "+age);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.showAge();

        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.displayAge();
    }
}

