package com.test.one;

/**
 * ClassName:TestOne
 * Package:com.test.one
 * Descrip:
 *
 * @Date:2018/7/26 下午2:23
 * @Author:jas
 */
public class TestOne {
    public static void main(String[] args) {
        A s = new B();
        s.out();
        System.out.println(((B) s).i + "--" + ((B) s).j);
    }
}

abstract class BaseClass{
    int i;
    int j;
    BaseClass(){
        System.out.println("B0");
    }
    abstract void out();
}

class A extends BaseClass{
    int i= 0;
    int j= 3;
    A(){
        System.out.println("F0");
    }
    void out(){
        System.out.println(i+" "+j);
    }

    static{
        System.out.println("F1");
    }

    {
        System.out.println("F2");
    }

}

class B extends A{
    int i = 3;
    int j = 0;
    {
        System.out.println("C0");
    }

    B(){
        System.out.println("C1");
}

    void out(){
        System.out.println(i + " " + j);
    }

    static{
        System.out.println("C2");
    }

    {
        System.out.println("C3");
    }
}



