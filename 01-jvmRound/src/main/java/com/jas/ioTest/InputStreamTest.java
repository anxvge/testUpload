package com.jas.ioTest;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ClassName:InputStreamTest
 * Package:com.jas.ioTest
 * Descrip:
 *
 * @Date:2018/7/19 下午8:16
 * @Author:jas
 */
public class InputStreamTest {

    private static String filename = "/Users/hayoung/Desktop/aa.txt";

    //要从磁盘中读取这个文件,是读取到了内存中
    public static String readFile(String fileName){
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
            String len = null;
            while((len = in.readLine())!= null){
                buffer.append(len);
            }
            if(null != in){
                in.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            //FileInputStream inputStream = new FileInputStream(fileName);
//
//            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("/Users/hayoung/Desktop/bb.txt" , true ) , "UTF-8");
//
//            //利用转化流可以转化字符的编码表
//
//            InputStreamReader inputStream = new InputStreamReader(new FileInputStream("/Users/hayoung/Desktop/aa.txt" ));
//            int len = 0;
//            char[] b = new char[10];
//            while((len = inputStream.read(b))!= -1){
//                out.write(b);
//            }
//            out.write("\n");
//            if(null != inputStream){
//                inputStream.close();
//            }
//
//            if(null != out){
//                out.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return buffer.toString();
        try {
            //FileInputStream inputStream = new FileInputStream(fileName);

            OutputStream out = new FileOutputStream("/Users/hayoung/Desktop/bb.txt" , false );

            //利用转化流可以转化字符的编码表

            InputStream inputStream =new FileInputStream("/Users/hayoung/Desktop/aa.txt" );
            int len = 0;
            byte[] b = new byte[20];
//            while((len = inputStream.read(b))!= -1){
//                out.write(b);
//            }

            int n = inputStream.read(b , 2 , 10);
            //返回值是读取的长度值
            System.out.println(n);
            for(int i= 0 ; i< b.length ; i++){
                out.write((char)b[i]);
            }
            if(null != inputStream){
                inputStream.close();
            }

            if(null != out){
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(InputStreamTest.readFile(filename));
    }

}
