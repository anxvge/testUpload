package com.jas.enumTest;

/**
 * ClassName:SOFTWARE
 * Package:com.jas.enumTest
 * Descrip:
 *
 * @Date:2018/7/13 下午2:56
 * @Author:jas
 */
public enum Software{
    INSTANCE(12 , "hello");
    private int a;
    private String b;

    private Software(int a , String b){
        this.a = a;
        this.b = b;
        System.out.println("一个枚举对象被创建了");
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void doSomething(){
        System.out.println("这是一个枚举单例");
    }

    @Override
    public String toString() {
        return Integer.toHexString(hashCode());
    }
}
