package com.test;

import com.task.MyThreadPool1;
import com.task.PrintATask;
import com.task.PrintBTask;

/**
 * @desc：
 * @title：TestThread
 * @author: huangwencai
 * @date: 2019-10-24 10:56
 * @version: v4.40.0
 */
public class TestThreadPool1 {
    public static void main(String[] args) {
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintATask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
        MyThreadPool1.getInstance().add(new PrintBTask());
    }
}