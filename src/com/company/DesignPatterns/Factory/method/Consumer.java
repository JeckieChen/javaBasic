package com.company.DesignPatterns.Factory.method;

import com.company.DesignPatterns.Factory.simple.CarFactory;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();

        car.name();
        car1.name();

        Car car2 = new MobaiFactory().getCar();
        car2.name();
    }
}
