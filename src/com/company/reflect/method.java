package com.company.reflect;

public class method {
    public static void main(String[] args) {
        // 方式一
        A a = new A();
        Class c = a.getClass();
        System.out.println(c.getName());
        // 方式二
        Class c2 = A.class;
        System.out.println(c == c2);
        // 方式三
        try {
            Class c3 = Class.forName("com.company.reflect.A");
            System.out.println(c2 == c3);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

//        A a1 = new A("test");
    }
}
