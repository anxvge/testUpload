package com.jas.jvmTest;

/**
 * ClassName:JvmTest
 * Package:com.jas.jvmTest
 * Descrip:
 *
 * @Date:2018/7/11 上午11:00
 * @Author:jas
 */
public class JvmTest {
        public static int k = 0;
        public static JvmTest t1 = new JvmTest("t1");
        public static JvmTest t2 = new JvmTest("t2");
        public static int i = print("i");
        public static int n = 99;
        public int j = print("j");

        {
            print("构造块");
        }
        static {
            print("静态块");
        }

        public JvmTest(String str) {
            System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
            ++i;
            ++n;
        }

        public static int print(String str) {
            System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
            ++n;
            return ++i;
        }

        public static void main(String args[]) {
            JvmTest t = new JvmTest("init");
        }
}
