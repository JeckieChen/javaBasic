package com.company.Enum;

import java.util.concurrent.ConcurrentHashMap;

public class SwitchEnum {
    public static void translation(Week week){
        switch (week){
            case Monday:
                System.out.println("Monday的中文是周一");
                break;
            case Tuesday:
                System.out.println("Tuesday的中文是周二");
                break;
            case Wednesday:
                System.out.println("Wednesday的中文是周三");
                break;
            case Thursday:
                System.out.println("Thursday的中文是周四");
                break;
            case Friday:
                System.out.println("Friday的中文是周五");
                break;
            case Saturday:
                System.out.println("Saturday的中文是周六");
                break;
            case Sunday:
                System.out.println("Sunday的中文是周日");
                break;
            default:
                System.out.println("无法翻译");
                break;
        }
    }

    public static void main(String[] args) {
        translation(Week.Monday);
        translation(Week.Tuesday);
        translation(Week.Wednesday);
        translation(Week.Tuesday);
        translation(Week.Friday);
        translation(Week.Saturday);
        translation(Week.Sunday);

    }
}
