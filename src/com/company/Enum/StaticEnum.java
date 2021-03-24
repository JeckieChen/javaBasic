package com.company.Enum;

import static com.company.Enum.Week.*;

public class StaticEnum {

    Week week;
    public StaticEnum(Week week) {this.week = week;}

    @Override
    public String toString() {
        return "StaticEnum is " + week;
    }

    public static void main(String[] args) {
        System.out.println(new StaticEnum(Monday));
        System.out.println(new StaticEnum(Tuesday));
        System.out.println(new StaticEnum(Wednesday));
    }
}
