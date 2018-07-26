package com.jas.ioTest;

import java.io.*;

/**
 * ClassName:SystemInOutTest
 * Package:com.jas.ioTest
 * Descrip:
 * System.in 是对应的标准输入设备,是键盘,是InputStream对象
 * System.out 是对应的标准输出设备,是控制台,是PrintStream对象
 *
 * @Date:2018/7/19 上午10:46
 * @Author:jas
 */
public class SystemInOutTest {

    public static void InOut(){
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new OutputStreamWriter(System.out));

            String line = null;

            while((line = reader.readLine())!= null){

                //实现的功能是,在控制台上输出键盘上键入的内容,以回车作为一段的结束,然后再用newline换行,当输出的为over时,关闭流
                if("over".equals(line)){
                    break;
                }

                writer.write(String.valueOf(line.toCharArray()[0]).toUpperCase()+line.substring(1));
                writer.newLine();
                writer.flush();

            }

            if(writer != null){
                writer.close();
                reader.close();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InOut();
    }

}
