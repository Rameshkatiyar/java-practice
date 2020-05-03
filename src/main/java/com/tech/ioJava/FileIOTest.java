package com.tech.ioJava;

import java.io.*;

public class FileIOTest {
    final static String outputFile = "/Users/rameshkatiyar/IdeaProjects/java-practice/src/main/java/com/tech/ioJava/output.txt";
    final static String inputFile = "/Users/rameshkatiyar/IdeaProjects/java-practice/src/main/java/com/tech/ioJava/input.txt";

    public static void main(String[] args) throws IOException {
//        fileInputOutputStreamTest();
//        addbufferInInputOutputStreamTest();
//        fileReaderWriterTest();
//        addBufferInfileReaderWriterTest();
        readDataFromConsoleSource();

    }

    /**
     * This add the buffer in file reader and writer, which increase the efficiency of it.
     */
    private static void addBufferInfileReaderWriterTest() throws IOException {
        String str = "welcome reader writer"; //Here you don't need to convert the string into bytes.
        Writer writer = new FileWriter(outputFile);

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(str);

        bufferedWriter.close();
        writer.close();


        //Buffer reader use to read the data in char form.
        //It can be used to read data line by line by readLine() method.
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Line1: "+bufferedReader.readLine());
        System.out.println("Line2: "+bufferedReader.readLine());

        bufferedReader.close();
        reader.close();
    }

    /**
     * It handle the char oriented data. Reading or writing to character streams
     */
    private static void fileReaderWriterTest() throws IOException {
        String str = "welcome reader writer"; //Here you don't need to convert the string into bytes.
        Writer writer = new FileWriter(outputFile);
        writer.write(str);
        writer.close();

        Reader reader = new FileReader(inputFile);
        System.out.println("Reading: "+reader.read());// It is return the bytes.
        System.out.println("2: "+(char)reader.read());
    }

    /**
     * This add the buffer in output and input stream, which increase the efficiency of it.
     */
    private static void addbufferInInputOutputStreamTest() throws IOException {
        String str = "Welcome input output stream";
        byte[] bytes = str.getBytes(); //Here need to convert the string into bytes.
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
        fileOutputStream.close();
    }

    /**
     * It is used to handle the byte oriented data.
     * @throws IOException
     */
    private static void fileInputOutputStreamTest() throws IOException {
        OutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(67);
        String str = "welcome";
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);

        outputStream.close();

        InputStream inputStream = new FileInputStream(inputFile);
        System.out.println((char)inputStream.read());
        System.out.println(inputStream.read());
    }

    private static void readDataFromConsoleSource() throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter Name: ");
        String str = br.readLine();
        System.out.println("Welcome: "+str);

        reader.close();
        br.close();

    }
}
