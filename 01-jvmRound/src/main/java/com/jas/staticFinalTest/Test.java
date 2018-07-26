package com.jas.staticFinalTest;

/**
 * ClassName:Test
 * Package:com.jas.staticFinalTest
 * Descrip:
 *
 * @Date:2018/7/13 上午10:04
 * @Author:jas
 */
public class Test {

    int r = 10;

    public static void main(String[] args) {
        System.out.println(A.m);
        System.out.println(A.m);
        System.out.println(new A().c);
        System.out.println(new A().c);
        final A a = new A();
        Test.B b = new Test().new B();
        b.read();
        new Test.C().print();
        System.out.println(new C().b);
    }

    class B {
        int r = 20;
        public void read(){
            System.out.println(Test.this.r);
            System.out.println(this.r);
            System.out.println(r);
        }
    }

    static class C {
        int b = 90;
        public void print(){
            final Test b = new Test();
            final int a = 10;
            //局部内部类和匿名内部类只能访问final修饰的局部变量
            new Thread(){
                public void run(){
                    System.out.println(a);
                    System.out.println(b.r);
                }
            }.start();
        }

    }

}

class A {
   public static double m = Math.random();
   public final double c = Math.random();
   public  int d = 1;
}


