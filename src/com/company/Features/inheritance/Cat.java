package com.company.Features.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("我不睡觉");
    }
}
