package com.jas.ioTest;

import java.io.*;

/**
 * ClassName:OutputStream
 * Package:com.jas.ioTest
 * Descrip:
 *
 * @Date:2018/7/19 下午8:39
 * @Author:jas
 */
public class OutputStreamTest {
    //读取存入到内存中的数据
    private static String filename = "/Users/hayoung/Desktop/aa.txt";
    private static String file = "/Users/hayoung/Desktop/bb.txt";
    public static void main(String[] args) throws IOException {
        String s = InputStreamTest.readFile(filename);
        BufferedReader reader = new BufferedReader(new StringReader(s));

        PrintWriter writer = new PrintWriter(System.out);
        String b = null;
        while((b = reader.readLine()) != null){
            writer.print(b);
        }
        if(writer != null){
            writer.close();
        }

        if(reader != null){
            reader.close();

        }
//        PrintWriter writer = null ;
//        String b = null;
//        try {
//            writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//            while((b = reader.readLine()) != null){
//                writer.print(b);
//            }
//            if(writer != null){
//                writer.close();
//            }
//
//            if(reader != null){
//                reader.close();
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
