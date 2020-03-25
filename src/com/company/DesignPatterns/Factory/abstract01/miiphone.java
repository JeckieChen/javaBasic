package com.company.DesignPatterns.Factory.abstract01;

public class miiphone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void sms() {
        System.out.println("小米发短信");
    }
}
