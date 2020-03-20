package com.company.DesignPatterns.Factory.simple;

public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");

        car.name();
        car2.name();
    }
}
