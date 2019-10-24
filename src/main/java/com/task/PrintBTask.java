package com.task;

/**
 * @desc：
 * @title：PrintATask
 * @author: huangwencai
 * @date: 2019-10-24 10:33
 * @version: v4.40.0
 */
public class PrintBTask implements Runnable {

    @Override
    public void run() {
        System.out.println("B"+Thread.currentThread().getName());
    }
}