package com.cnsyear.day01.thread;

import com.cnsyear.util.TlUtil;

/**
 * @Description: 实现Runabled接口
 * @Author: 趙小傑~～
 * @Date: 2018/10/26 13:49
 */
public class TestRunable implements Runnable{

    public static void main(String[] args) {
        TestRunable testRunable = new TestRunable();
       /* new Thread(testRunable).start();*/

        TlUtil.timeTasks(10000,10,testRunable);

    }

    @Override
    public void run() {
        System.out.println("-------run TestRunable------");
    }
}
