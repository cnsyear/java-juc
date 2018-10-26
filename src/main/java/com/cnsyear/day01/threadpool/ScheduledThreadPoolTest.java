package com.cnsyear.day01.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 定时线程池
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 15:12
 */
public class ScheduledThreadPoolTest {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("run ---");
            }
        },5,TimeUnit.SECONDS);
       // executorService.shutdown();
    }
}
