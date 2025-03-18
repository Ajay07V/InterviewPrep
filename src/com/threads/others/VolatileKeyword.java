package com.threads.others;

public class VolatileKeyword {
    volatile int value = 10;

    public static void main(String[] args) {
        VolatileKeyword volatileKeyword = new VolatileKeyword();
        Thread t1 = new Thread(() -> {

            volatileKeyword.value = 20;
            System.out.println(volatileKeyword.value);
        });
        Thread t2 = new Thread(()->{
            System.out.println(volatileKeyword.value);
        });
        t1.start();
        t2.start();

    }
}
