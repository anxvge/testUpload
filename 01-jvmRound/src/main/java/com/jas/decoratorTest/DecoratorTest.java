package com.jas.decoratorTest;

/**
 * ClassName:DecoratorTest
 * Package:com.jas.decoratorTest
 * Descrip: 装饰者模式
 *
 * @Date:2018/7/21 下午8:25
 * @Author:jas
 */
public class DecoratorTest {

    public static void main(String[] args) {

        B b = new B(new A());
        b.doA();
    }

}

interface AB {
    void doA();
}

class A implements AB{
    public void doA(){
        System.out.println("A在做一件事");
    }
}

class B implements AB{
    private A a;
    public B (A a){
        this.a = a;
    }

    public void doA() {
        System.out.println("B在A之前做了一件事");
        a.doA();
    }
}
