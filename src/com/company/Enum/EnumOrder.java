package com.company.Enum;

public class EnumOrder {
    public static void main(String[] args) {
        for (Week w : Week.values()){
            System.out.println(w + " , ordinal " + w.ordinal());
        }
        System.out.println("=======================================");
        Week w = Week.valueOf("Wednesday");
        System.out.println(w.name() + " , ordinal " + w.ordinal());
        System.out.println(w.getDeclaringClass().getName());
        System.out.println(w.toString().getClass().getName());
    }
}
