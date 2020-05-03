package com.tech.exceptions;

public class ExceptionTest {
    public static void main(String[] args) throws MyException {
        int age = 10;
        if (age < 18){
            throw new MyException("Invalid Age.");
        }
        System.out.println("Valid age. "+age);
    }
}
