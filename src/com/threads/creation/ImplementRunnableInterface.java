package com.threads.creation;

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyThreadTwo threadTwo = new MyThreadTwo();
        Thread t1 = new Thread(threadTwo);
        t1.start();
    }
}

class MyThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread implements Runnable Interface");
    }
}
