package com.company.Features.encapsulation;

public class test {
    public static void main(String[] args) {
        Person2 p2 = new Person2();
        p2.age = 2;
        p2.name = "abc";
        // 不可以隐藏细节
        p2.age = p2.age + 1;
        // 可以随意修改成员变量
        p2.age.byteValue();
        System.out.println(p2.toString());

        Person p = new Person();
        p.setAge(3);
        p.setName("cba");
        System.out.println(p.toString());
    }
}
