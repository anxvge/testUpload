package com.jas.enumTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * ClassName:EnumTest
 * Package:com.jas.enumTest
 * Descrip:
 * 利用枚举生成的单例模式
 * @Date:2018/7/13 下午2:55
 * @Author:jas
 */
public class EnumTest {

    public static void main(String[] args) {

        ExecutorService pools = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++ ){
            pools.execute(new Runnable() {
                public void run() {
                    Software software = Software.INSTANCE;
                    //software.doSomething();
                    System.out.println("枚举实例对象的内存地址为"+software.toString());
                    System.out.println("枚举实例对象的哈希值为"+software.hashCode());

                    EnumTest a = new EnumTest();
                    System.out.println("普通实例对象的内存地址为"+a.toString());
                    System.out.println("普通实例对象的哈希值为"+a.hashCode());
                }
            });

        }

        pools.shutdown();

        Software software = Software.INSTANCE;
        //software.doSomething();
        System.out.println("枚举实例对象的内存地址为"+software.toString());
        System.out.println("枚举实例对象的哈希值为"+software.hashCode());

        EnumTest a = new EnumTest();
        System.out.println("普通实例对象的内存地址为"+a.toString());
        System.out.println("普通实例对象的哈希值为"+a.hashCode());
    }
}
