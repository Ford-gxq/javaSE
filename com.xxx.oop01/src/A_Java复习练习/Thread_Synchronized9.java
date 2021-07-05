package A_Java复习练习;

import Thread多线程.练习.ThreadDemo01;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

/**-1. 同步代码块格式：
          synchronized(任意对象) {
          多条语句操作共享数据的代码
          }
 synchronized(任意对象)：就相当于给代码加锁了，任意对象就可以看成是一把锁

 -2. 同步的好处和弊端
        - 好处：解决了多线程的数据安全问题
        - 弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 *
 *
 * */
//测试
public class Thread_Synchronized9 {
    public static void main(String[] args) {
     SellTicket1 st=new SellTicket1();
     Thread th1=new Thread(st,"售票窗口1");
     Thread th2=new Thread(st,"售票窗口2");
     Thread th3=new Thread(st,"售票窗口3");
     //开启三个线程
        th1.start();
        th2.start();
        th3.start();
    }

}
class SellTicket1 implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){// 对可能有安全问题的代码加锁,多个线程必须使用同一把锁
        //t1进来后，就会把这段代码给锁起来
        if (tickets>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"票");
            tickets--; //tickets = 99;
        }
          }
        //t1出来了，这段代码的锁就被释放了
        }

    }
}
