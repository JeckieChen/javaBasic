package com.company.DesignPatterns.Factory.abstract01;

public class HuaweiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("华为开启手机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关闭手机");
    }

    @Override
    public void call() {
        System.out.println("华为打电话");
    }

    @Override
    public void sms() {
        System.out.println("华为发短信");
    }
}
