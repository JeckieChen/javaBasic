package com.company.ThinkingInJava.Generic;

public class Holder2 {
    private Object a;
    public Holder2(Object a){
        this.a = a;
    }
    public Object get(){
        return a;
    }
    public void set(Object a){
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();
        h2.set("Not an Automobile");
        String s = (String) h2.get();
        h2.set(1);
        Integer x = (Integer) h2.get();
        System.out.println("a:" +  a + ",a的类型是：" + a.getClass().toString());
        System.out.println("s:" +  s + ",s的类型是：" + s.getClass().toString());
        System.out.println("x:" +  x + ",x的类型是：" + x.getClass().toString());
    }
}
