package com.jas.threadTest;

/**
 * ClassName:ThreadTest2
 * Package:com.jas.threadTest
 * Descrip:
 * 基于匿名内部类的多线程实现
 * @Date:2018/7/13 上午11:01
 * @Author:jas
 */
public class ThreadTest2 {
    public static void main(String[] args) {
       new Thread(new Runnable(){
            public void run() {
                System.out.println("实现runnable接口");
            }
        }){
            public void run(){
                System.out.println("覆盖runnable接口的run方法,启动线程");
            }
        }.start();

    }
}

