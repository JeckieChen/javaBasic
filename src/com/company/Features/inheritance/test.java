package com.company.Features.inheritance;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("狗");
        dog.eat();
        dog.sleep();
        System.out.println("===============");
        Cat cat = new Cat("猫");
        cat.eat();
        cat.sleep();
    }
}
