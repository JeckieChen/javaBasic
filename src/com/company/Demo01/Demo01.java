package com.company.Demo01;
import java.util.concurrent.atomic.*;
public class Demo01 {
    // volatile 增加共享变量的可见性
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