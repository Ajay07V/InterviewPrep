package com.threads.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        ResourceOne r1 = new ResourceOne();
        ResourceTwo r2 = new ResourceTwo();
        Thread t1 = new Thread(() -> {
            synchronized (r2) {

                System.out.println("Resource 1 is not locked (t1)");
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
                synchronized (r1) {

                    System.out.println("Resource 2 is not locked (t1) ");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
                System.out.println("Resource 2 is not locked (t2)");
                synchronized (r1) {
                    System.out.println("Resource 1 is not locked (t2)");
                }
            }
        });
        t1.start();
        t2.start();

    }
}

class ResourceOne {
    void accessResource() {
        System.out.println("Resource one accessed");
    }
}

class ResourceTwo {
    void accessResource() {
        System.out.println("Resource two accessed");
    }
}