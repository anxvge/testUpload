package com.jas.interfaceTest;

import com.jas.interfaceTest.impl.ServiceImpl;

/**
 * ClassName:Test
 * Package:com.jas.interfaceTest
 * Descrip:
 *
 * @Date:2018/7/18 下午3:00
 * @Author:jas
 */
public class Test {
    public static void main(String[] args) {
        service test = new ServiceImpl();
        test.test();
    }
}
