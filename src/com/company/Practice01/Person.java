package com.company.Practice01;

public class Person {
    private int age;

    public int getAge() {
        if (age > 150 || age < 0){
            return 0;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
