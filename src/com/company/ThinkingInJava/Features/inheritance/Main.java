package com.company.ThinkingInJava.Features.inheritance;

public class Main {

    public static void main(String[] args) {
        System.out.println("以下没有继承----------------------");
        Penguin p = new Penguin("企鹅", 1);
        p.eat();
        p.sleep();
        p.introduction();
        Mouse m = new Mouse("老鼠", 2);
        m.eat();
        m.sleep();
        m.introduction();
        // 继承Animal
        System.out.println("以下继承了Animal----------------------");
        Cat c = new Cat("猫", 3);
        c.eat();
        c.sleep();
        c.introduction();
        Dog d = new Dog("狗", 4);
        d.eat();
        d.sleep();
        d.introduction();
    }
}
