package A_Java复习练习;
/**
 *设置和获取线程名称:
 *    方法介绍:
 *         | 方法名                     | 说明
 *         | void  setName(String name) | 将此线程的名称更改为等于参数name
 *         | String  getName()          | 返回此线程的名称
 *         | Thread  currentThread()    | 返回对当前正在执行的线程对象的引用
 * static void sleep(long millis)使当前正在执行的线程停留（暂停执行）指定的毫秒
 * */

 class MyThread extends Thread {
      public MyThread() {}
      public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
//测试
public class Thread_getName4 {
    public static void main(String[] args) {
    //创建两个线程对象
      MyThread my1=new MyThread();
      MyThread my2=new MyThread();
      //void setName(String name)：将此线程的名称更改为等于参数 name
      my1.setName("高铁1");
      my2.setName("飞机1");
      //Thread​(String name) 分配新的 Thread对象
        MyThread my3 = new MyThread("高铁2");
        MyThread my4 = new MyThread("飞机2");
        my1.start();
        my2.start();
//        my3.start();
//        my4.start();
        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }

}
