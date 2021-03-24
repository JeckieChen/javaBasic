package com.company.Thread.CAS;

import java.util.concurrent.atomic.AtomicInteger;

public class test {
    private static AtomicInteger atomicInteger = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        Thread task1 = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i=0; i<1000; i++){
                    atomicInteger.incrementAndGet();
                }
            }
        };

        Thread task2 = new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i=0; i<1000; i++){
                    atomicInteger.incrementAndGet();
                }
            }
        };

        task1.start();
        task2.start();
        task1.join();
        task2.join();
        System.out.println(atomicInteger.get());
    }
}/*

*///:~
