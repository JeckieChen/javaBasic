package com.company.Features.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("我不吃饭");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
