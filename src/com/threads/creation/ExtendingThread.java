package com.threads.creation;

public class ExtendingThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("CustomThread by extending Thread");

    }
}
