package com.example.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        }catch(InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
