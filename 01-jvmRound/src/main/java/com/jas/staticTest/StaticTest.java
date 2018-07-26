package com.jas.staticTest;

/**
 * ClassName:StaticTest
 * Package:com.jas.staticTest
 * Descrip:
 *
 * @Date:2018/7/15 下午8:41
 * @Author:jas
 */
public class StaticTest {
    public static void saySomething(){
        System.out.println("你能调用我吗?");
    }

    public void say(){
        saySomething();
    }

    public static void main(String[] args) {
        new StaticTest().say();
    }
}
