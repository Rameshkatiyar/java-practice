package com.tech.ioJava;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

/**
 * Three stream Java by default create. All these streams are attached with the console.
 * 1) System.out: standard output stream
 *
 * 2) System.in: standard input stream
 *
 * 3) System.err: standard error stream
 */

public class SystemTest {
    public static void main(String[] args) throws IOException {
//        systemInput();
//        copyArrayTest();
//        getSystemProperties();
        testConsoleRead();

    }

    private static void systemInput() throws IOException {
        System.out.println("Hello");
        System.err.println("This is error");
        int readValue = System.in.read();
        System.out.println("Read Value: "+readValue);
    }

    public static void copyArrayTest(){
        int a[] = new int[]{1,2,3,4,5,6};
        int b[] = new int[6];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.arraycopy(a, 2, b, 1, 3);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    private static void getSystemProperties() {
        System.out.println(System.getenv());
        System.out.println(System.getProperty("user.home"));
    }

    private static void testConsoleRead(){
        Console console = System.console();
        System.out.println("Enter Password");
        char[] s = console.readPassword();
        System.out.println("Your password: "+s);
    }
}
