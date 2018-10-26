package com.cnsyear.day01.thread;

/**
 * @Description: 线程顺序
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 14:16
 */
public class ThreadSort {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            System.out.println("thread 1");
        });
        Thread thread2 = new Thread(()->{
            System.out.println("thread 2");
        });
        Thread thread3 = new Thread(()->{
            System.out.println("thread 3");
        });
        //显示结果不同是因为CPU分配的时间分片不同
        //thread1.start();
        //thread2.start();
        //thread3.start();

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
