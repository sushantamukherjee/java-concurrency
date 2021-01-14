package com.example.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    protected BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue){
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
