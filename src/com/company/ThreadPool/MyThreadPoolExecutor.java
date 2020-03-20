package com.company.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadPoolExecutor {
    private int coreSize;
    private int MaxPoolSize;
    LinkedBlockingQueue<Runnable> workQueue = null; // 队列大小，即任务仓库

    public MyThreadPoolExecutor(int coreSize, int MaxPoolSize, int workQueueSize){
        this.coreSize = coreSize;
        this.MaxPoolSize = MaxPoolSize;
        workQueue = new LinkedBlockingQueue<>(workQueueSize);
    }

    public class Worker extends Thread{
        Runnable firstTask;
        public Worker(Runnable firstTask){
            this.firstTask = firstTask;
        }
        @Override
        public void run() {
            try {
                Runnable task = firstTask;
                while (task != null || (task = workQueue.take()) != null){
                    task.run();
                    task = null;
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("pool error");
            }

        }
    }

    AtomicInteger currentPoolSize = new AtomicInteger(0);

    public void execute(Runnable task){
        if (currentPoolSize.get() < coreSize){
            if (currentPoolSize.incrementAndGet() <= coreSize) {
                new Worker(task).start();
            }else {
                currentPoolSize.decrementAndGet();
            }
        }
        if (workQueue.offer(task)){
            return;
        }
    }
}
