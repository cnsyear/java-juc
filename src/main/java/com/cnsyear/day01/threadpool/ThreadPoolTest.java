package com.cnsyear.day01.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 线程池创建
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 15:00
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();//创建一个线程池
        executorService.submit(new Runnable() {
            @Override
            public void run(){
                System.out.println("run----"+Thread.currentThread().getName());
            }
        });
        executorService.shutdown();
    }
}
