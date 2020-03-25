package com.company.DesignPatterns.Factory.abstract01;

public class miroute implements IRouteProduct {
    @Override
    public void start() {
        System.out.println("小米开启路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关闭路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("小米打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("小米打开设置");
    }
}
