package com.threads;

public class ThreadBinding {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                createDataOne();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        Thread t2 = new Thread(()-> {
            try {
                createDataOTwo();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();

    }

    static void createDataOne() throws InterruptedException {
        int i = 0;
        while (i <= 5) {
            Thread.sleep(1000);
            System.out.println(i);
            i++;
        }
    }

    static void createDataOTwo() throws InterruptedException {
        int i = 5;
        while (i <= 10) {
            Thread.sleep(1000);
            System.out.println(i);
            i++;
        }
    }
}
