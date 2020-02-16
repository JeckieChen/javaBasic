package com.company.Demo01;

public class Demo01 {
    public static volatile boolean isTrue = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("wait data...");
                while (!isTrue){ }
                System.out.println("success..........");
            }
        }).start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                PrepareData();
            }
        }).start();
    }

    public static void PrepareData(){
        System.out.println("init data...");
        isTrue = true;
        System.out.println("done");
    }
}