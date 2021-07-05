package A_Java复习练习;
/**
 *守护线程:(相关方法如下)
 *   void setDaemon(boolean on)将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 *  当普通线程执行完之后,那么守护线程也没有继续运行下去的必要了
 *
 * */
//定义一个我的线程类
    class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=50 ; i++) {
            System.out.println(getName()+"---"+i);
        }

    }
}
  class MyThread2 extends Thread{
        @Override
        public void run(){
            for (int i = 0; i <=100 ; i++) {
           System.out.println(getName() + "---" + i);
            }
        }
  }
//测试线程
public class Thread_Daemon7 {
    public static void main(String[] args) {
    MyThread1 mt1=new MyThread1();
    MyThread2 mt2=new MyThread2();
    //设置线程的名字
     mt1.setName("女神");
     mt2.setName("天使");
   //把第二个线程设置为守护线程
   //当普通线程执行完之后,那么守护线程也没有继续运行下去的必要了.
    mt2.setDaemon(true);
    mt1.start();
    mt2.start();

    }

}
