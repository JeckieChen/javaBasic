package com.company.Practice02;

public class Kids extends ManKind {
    int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(getYearsOld());
    }

    public static void main(String[] args) {
        // write your code here
        Kids someKid = new Kids();
        someKid.setYearsOld(20);
        someKid.setSex(1);
        someKid.setSalary(20000);
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
