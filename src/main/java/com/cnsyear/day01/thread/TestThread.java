package com.cnsyear.day01.thread;

/**
 * @Description: 继承Thread
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 13:49
 */
public class TestThread extends Thread{

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
    }

    @Override
    public void run() {
        System.out.println("-------run TestThread------");
    }
}
