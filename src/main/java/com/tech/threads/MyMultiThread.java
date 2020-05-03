package com.tech.threads;

public class MyMultiThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Running : "+ Thread.currentThread().getName());
        try {
            commonResoucres();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exist thread: "+Thread.currentThread().getName());
    }

    synchronized public void commonResoucres() throws InterruptedException {
        System.out.println("Resources using by thread: "+Thread.currentThread().getName());
        Thread.sleep(5000);
    }

    public static void main(String[] args) throws InterruptedException {
        MyMultiThread myMultiThread = new MyMultiThread();
        Thread t1 = new Thread(myMultiThread);
        Thread t2 = new Thread(myMultiThread);
        t1.start();
        t2.start();

        System.out.println("Ending main thread: "+Thread.currentThread().getName());
    }
}
