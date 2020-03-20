package com.company.current;

public class VolatileAtomic {
    public static volatile int num = 0;

    public static void add(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException{

        Thread[] threads = new Thread[10];
        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000;i++){
                        add();
                    }

                }
            });
            threads[i].start();
        }
        for (Thread t: threads){
            t.join();
            // 等待所有线程执行完成
        }
        System.out.println(num);
        // <=10000
    }
}
