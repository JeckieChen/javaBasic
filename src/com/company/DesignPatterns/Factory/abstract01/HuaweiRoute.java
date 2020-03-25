package com.company.DesignPatterns.Factory.abstract01;

public class HuaweiRoute implements IRouteProduct {
    @Override
    public void start() {
        System.out.println("华为关闭路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关闭路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("华为打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("华为打开设置");
    }
}
