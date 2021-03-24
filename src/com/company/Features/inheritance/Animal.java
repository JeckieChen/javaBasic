package com.company.Features.inheritance;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "吃饭");
    }

    public void sleep(){
        System.out.println(name + "睡觉");
    }
}
