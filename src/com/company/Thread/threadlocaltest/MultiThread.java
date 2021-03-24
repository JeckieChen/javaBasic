package com.company.Thread.threadlocaltest;

public class MultiThread {


    public static void main(String[] args) {
        person p = new person();
        IntThread intThread = new IntThread(p);
        OutThread outThread = new OutThread(p);
        intThread.start();
        outThread.start();
    }
}

class person{
    public String name;
    public String sex;
}

class IntThread extends Thread{
    private person p;

    public IntThread(person p){
        this.p = p;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            if (count == 0){
                p.name = "man";
                p.sex = "男";
            }else {
                p.name = "woman";
                p.sex = "女";
            }
            count = (count + 1) % 2;
        }
    }
}

class OutThread extends Thread {
    private person p;

    public OutThread(person p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(p.name + "--" + p.sex);
        }
    }
}
