package A_Java复习练习;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**线程优先级:
 *1.线程调度, 两种调度方式:
 *      -- 分时调度模型：所有线程轮流使用 CPU的使用权，平均分配每个线程占用 CPU的时间片
 *      -- 抢占式调度模型：优先让优先级高的线程使用CPU，如果线程的优先级相同，那么会随机选择一个，
 *          优先级高的线程获取的CPU时间片相对多一些.
 *2.-Java使用的是抢占式调度模型
 *    - 随机性:
 *         假如计算机只有一个CPU，那么CPU在某一个时刻只能执行一条指令，线程只有得到CPU时间片，
 *         也就是使用权，才可以执行指令。所以说多线程程序的执行是有随机性，因为谁抢到CPU的使用权是不一定的
 *3.优先级相关方法:
 *   | final int getPriority()                  返回此线程的优先级
 *   | final void setPriority(int newPriority)  更改此线程的优先级默认为5；线程优先级的范围是：1-10(数值越大优先级越高)
 *
 * */

//定义一个类实现Callable接口
    class MyCallable1 implements Callable<String>{
    @Override
    public String call() throws Exception {
        for (int i = 0; i <=50 ; i++) {
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
     return "线程执行结束";
    }
}
public class Thread_Priority6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      //优先级: 1 - 10 默认值:5
      //创建MyCallable对象
      MyCallable1 mc=new MyCallable1();
      FutureTask<String> ft=new FutureTask<>(mc);//把mc对象作为参数通过FutureTask构造器传递进去
      Thread th=new Thread(ft);
      //设置线程的名字和优先级
      th.setName("飞机线程");
      th.setPriority(10);
      //开启线程
      th.start();
      String str=ft.get();
      System.out.println(th.getName()+str);
      /*再定义一个线程*/
       MyCallable1 mc1=new MyCallable1();
       FutureTask<String> fc1=new FutureTask<>(mc1);
       Thread th1=new Thread(fc1);
       //设置线程的名字和优先级
        th1.setName("高铁线程");
        th1.setPriority(4);
        //线程开启，并调用未来任务对象的get方法获取线程执行结果返回值
        th1.start();
        String str1=fc1.get();
        System.out.println(th1.getName()+str1);

    }


}
