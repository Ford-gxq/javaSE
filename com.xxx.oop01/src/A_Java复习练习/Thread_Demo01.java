package A_Java复习练习;
/**
 *1. 实现多线程方式一：继承Thread类:
 *     void run()在线程开启后，此方法将被调用执行
 *     void start()使此线程开始执行，Java虚拟机会调用run方法()
 *2.实现步骤:
 *           ---定义一个类MyThread继承Thread类
 *           ---在MyThread类中重写run()方法
 *           ---创建MyThread类的对象
 *           ---启动线程start();
 *3.run()方法和start()方法的区别？
 *                  run()：封装线程执行的代码，直接调用，相当于普通方法的调用
 *                  start()：启动线程；然后由JVM调用此线程的run()方法
 * */
public class Thread_Demo01 extends Thread {

    public static void main(String[] args) {
     Thread_Demo01 th=new Thread_Demo01();
        th.start();
        for (int i = 0; i <=20 ; i++) {
            System.out.println(Thread.currentThread());
            try {
                Thread.currentThread().sleep(1000);//主线程休息1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("一边听歌...");
        }


    }
/**
 * 线程体
 *
 * */
    @Override
    public void run() {
        for (int i = 0; i <=20 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread());
            System.out.println("一边学习...");

        }
    }
}
