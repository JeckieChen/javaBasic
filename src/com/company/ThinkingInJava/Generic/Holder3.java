package com.company.ThinkingInJava.Generic;

public class Holder3<T> {
    private T a;
    public Holder3(T a) {this.a = a;}
    public void set(T a) {this.a = a;}
    public T get() {return a;}

    public static void main(String[] args) {
        Holder3<Automobile> h3_1 = new Holder3<>(new Automobile());
        Automobile a = (Automobile) h3_1.get();
        Holder3<String> h3_2 = new Holder3<>("");
        h3_2.set("Not an Automobile");
        String s = h3_2.get();
        Holder3<Integer> h3_3 = new Holder3<>(0);
        h3_3.set(100);
        Integer x = h3_3.get();
        System.out.println("a:" +  a + ",a的类型是：" + a.getClass().toString());
        System.out.println("s:" +  s + ",s的类型是：" + s.getClass().toString());
        System.out.println("x:" +  x + ",x的类型是：" + x.getClass().toString());
    }
}
