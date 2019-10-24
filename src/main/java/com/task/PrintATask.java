package com.task;

/**
 * @desc：
 * @title：PrintATask
 * @author: huangwencai
 * @date: 2019-10-24 10:33
 * @version: v4.40.0
 */
public class PrintATask implements Runnable{

    @Override
    public void run() {
        System.out.println("A"+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}