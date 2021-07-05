package A_Java复习练习;
/**
 * 实现多线程方式二：实现Runnable接口：
 *   1.  Thread构造方法：
 *         | Thread(Runnable target)                 分配一个新的Thread对象
 *         | Thread(Runnable target, String name)    分配一个新的Thread对象，为线程起一个名字
 * 2. 实现步骤：
 *         - 定义一个类MyRunnable实现Runnable接口
 *         - 在MyRunnable类中重写run()方法
 *         - 创建MyRunnable类的对象
 *         - 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
 *         - 启动线程
 *
 * */
//定义一个MyRunnable实现类，实现Runnable接口
    class MyRunnable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
//测试类
public class Thread_Runnable2 {
    public static void main(String[] args) {
     //创建MyRunnable类的对象
     MyRunnable my=new MyRunnable();
    //Thread(Runnable target, String name)    分配一个新的Thread对象，为线程起一个名字
     Thread th=new Thread(my,"飞机");
     Thread th2=new Thread(my,"坦克");
     //启动线程
        th.start();
        th2.start();

    }


}
