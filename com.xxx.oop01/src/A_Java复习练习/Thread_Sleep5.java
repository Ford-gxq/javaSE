package A_Java复习练习;
/**线程休眠：
 * static void sleep(long millis)使当前正在执行的线程停留（暂停执行）指定的毫秒
 *
 * */
//定义一个类实现Runnable接口，并重写Runnable中的run方法
class MyRunnable1 implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=20 ; i++) {
            try {
                //让此线程休眠100ms
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
//测试
public class Thread_Sleep5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("睡觉前");
        Thread.sleep(2000);
        System.out.println("睡醒了");
        //创建一个MyRunnable对象，并把该对象作为Thread类构造器的构造参数传递进去
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
    }

}
