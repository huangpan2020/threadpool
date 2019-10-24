package com.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @desc：
 * @title：MyThreadPoo2
 * @author: huangwencai
 * @date: 2019-10-24 10:34
 * @version: v4.40.0
 */
//Holder单例模式线程池  利用JVM保证线程安全性。将懒加载和线程安全完美结合的一种方式（无锁）。（推荐）
public class MyThreadPool2 {
    private static ExecutorService taskPool;
    private MyThreadPool2(){
        taskPool = new ThreadPoolExecutor(
                6,
                12,
                0L,
                TimeUnit.MILLISECONDS,
                //new LinkedBlockingQueue<Runnable>() 也可以
                new LinkedBlockingQueue<Runnable>(20)
        );
    }

    private static class SingletonHolder{
        //静态初始化器，由JVM来保证线程安全
        private static MyThreadPool2 myThreadPool2=new MyThreadPool2();
    }

    public static MyThreadPool2 getInstance(){
        return  SingletonHolder.myThreadPool2;
    }
    public void add(Runnable Task){
        taskPool.execute(Task);
    }
}