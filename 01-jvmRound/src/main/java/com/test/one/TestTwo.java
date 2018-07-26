package com.test.one;

import java.math.BigDecimal;

/**
 * ClassName:TestTwo
 * Package:com.test.one
 * Descrip:
 *
 * @Date:2018/7/26 下午2:33
 * @Author:jas
 */
public class TestTwo {
    public static void changeStr(String str){
        str = "welcome";
    }

    public static void changeObject(ObjectClass object){
        object = new ObjectClass("welcome");
        System.out.println(object.value);
    }

    public static void main(String[] args) {
        String str = "1234";
        changeStr(str);
        System.out.println("StringValue:"+str);

        ObjectClass object = new ObjectClass(str);  //传递的只是对象保存的内存地址
        changeObject(object);  //这里产生的ObjectClass对象会执行完这个方法后立刻被垃圾回收器回收
        System.out.println("ObjectValue:" + object.value);
        System.out.println(object.a);
        System.out.println(object.b.toString());
        System.out.println(object.c);
    }

}

class ObjectClass{
    String value = null;
    public ObjectClass(final String value){
        this.value = value;
    }

    BigDecimal a = new BigDecimal(100);
    BigDecimal b = new BigDecimal(0.1);
    BigDecimal c = new BigDecimal(0.2);


}