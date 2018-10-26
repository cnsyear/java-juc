package com.cnsyear.day01.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Description:有返回值的
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 14:27
 */

public class TestCallable implements Callable {

    public static void main(String[] args) throws Exception {
        FutureTask task  = new FutureTask<>(new TestCallable());
        new Thread(task).start();
        System.out.println(task.get());
    }

    @Override
    public String call() throws Exception {
        return "我是一个返回值！！";
    }
}
