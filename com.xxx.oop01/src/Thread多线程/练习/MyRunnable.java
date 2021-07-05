package Thread多线程.练习;

import 嵌套循环小练习.ForDemo;

/**
 *  定义一个类MyRunnable实现Runnable接口,在MyRunnable类中重写run()方法,创建MyRunnable类的对象;
 *  *      创建Thread类的对象，把MyRunnable对象作为构造方法的参数,启动线程
 *  */
public class MyRunnable implements  Runnable{
    public static void main(String[] args) {
        //Thread​(Runnable target) 分配新的 Thread对象
        MyRunnable myRun=new MyRunnable();
        Thread th=new Thread(myRun,"线程A");
        th.start();
        for (int i = 0; i <=20 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("一边学习..");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("一边听歌..");
        }

    }



}
