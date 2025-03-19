package com.threads.others;

public class VolatileKeyword {
    volatile boolean value = true;

    public static void main(String[] args) throws InterruptedException {
        VolatileKeyword volatileKeyword = new VolatileKeyword();
        Runnable writer = () -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                volatileKeyword.value = false;
            }
        };
        Runnable reader = () -> {
            while (volatileKeyword.value) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Value is true now");
            }
            System.out.println("Value changed to false, exiting loop.");
        };
        Thread t2 = new Thread(reader);
        Thread t1 = new Thread(writer);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
