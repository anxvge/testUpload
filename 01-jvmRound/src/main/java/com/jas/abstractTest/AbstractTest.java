package com.jas.abstractTest;

/**
 * ClassName:AbstractTest
 * Package:com.jas.abstractTest
 * Descrip:  接口的适配器模式
 *
 * @Date:2018/7/21 下午8:02
 * @Author:jas
 */
public class AbstractTest extends AbstractMethodTest{

    public void test() {
        System.out.println("继承了抽象类从而只需要实现接口的其中一个方法");
    }

    public static void main(String[] args) {
        AbstractMethod abstractMethod = new AbstractTest();
        abstractMethod.test();
        abstractMethod.test2();
        abstractMethod.test3();
    }

    public void test3() {
        System.out.println("抽象类可以不实现'实现接口'的所有方法,而交给它的子类来实现");
    }
}

interface AbstractMethod{
    void test();
    void test2();
    void test3();
}

abstract class AbstractMethodTest implements AbstractMethod{
    public void test() {
        System.out.println("抽象类实现了接口的一个方法");
    }

    public void test2() {
        System.out.println("抽象类实现了接口的另外一个方法");
    }
}


