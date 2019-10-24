package com.task;

import java.util.concurrent.*;

/**
 * @desc：
 * @title：MyThreadPool
 * @author: huangwencai
 * @date: 2019-10-24 10:34
 * @version: v4.40.0
 */
//饿汉单例模式线程池
public class MyThreadPool1 {
    private static ExecutorService taskPool;
    private MyThreadPool1(){
        taskPool = new ThreadPoolExecutor(
                6,
                12,
                0L,
                TimeUnit.MILLISECONDS,
                //new LinkedBlockingQueue<Runnable>() 也可以
                new LinkedBlockingQueue<Runnable>(20)
        );
    }
    private static MyThreadPool1 myThreadPool1=new MyThreadPool1();

    public static MyThreadPool1 getInstance(){
        return  myThreadPool1;
    }
    public void add(Runnable Task){
        taskPool.execute(Task);
    }
}