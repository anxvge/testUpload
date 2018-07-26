package com.jas.threadTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * ClassName:threadTest
 * Package:com.jas
 * Descrip:实现callable接口,利用executorService线程池实现返回结果的多线程
 *TODO:为什么sunchronized不起作用,是因为executorService线程池的原因吗?
 * @Date:2018/7/12 上午10:32
 * @Author:jas
 */
public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Date startDate = new Date();
        System.out.println("所有线程开始工作了");

        List<Future> list = new ArrayList<Future>();
        //创建了包含五个线程的线程池
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i = 1 ; i <= 5 ; i++){
            CountTime c = new CountTime(i);
            Future future = service.submit(c);
            list.add(future);
        }

        //循环遍历出future
        for(Future future : list){
            System.out.println("返回值的结果为"+future.get().toString());
        }
        Date endDate = new Date();
        System.out.println("所有线程运行结束了,耗时为"+(endDate.getTime()-startDate.getTime())+"毫秒");

        service.shutdown();
    }

}

class CountTime implements Callable{

    private int num;

    private CountTime(){}
    public CountTime(Integer num){
        this.num = num;
    }

    public synchronized Object call() throws Exception {
        Date startDate = new Date();
        System.out.println("这个线程开始工作");
        Thread.sleep(1000);
        Date endDate = new Date();
        System.out.println("输出"+num+"结束,耗时"+(endDate.getTime()-startDate.getTime())+"毫秒");

        return num;
    }
}