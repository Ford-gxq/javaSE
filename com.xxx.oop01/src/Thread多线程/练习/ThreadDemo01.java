package Thread多线程.练习;
/**
 * 多线程实现的三种方式：
 *   1.  定义一个类继承Thread类，重写run()方法，创建类的对象，类对象.start()
 *   2.  定义一个类MyRunnable实现Runnable接口,在MyRunnable类中重写run()方法,创建MyRunnable类的对象;
 *      创建Thread类的对象，把MyRunnable对象作为构造方法的参数,启动线程
 *   3. 定义一个类MyCallable实现Callable接口,在MyCallable类中重写call()方法,
 *       创建MyCallable类的对象,创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数;
 *       创建Thread类的对象，把FutureTask对象作为构造方法的参数; 启动线程,再调用get方法，就可以获取线程结束之后的结果。
 * +
 *
 * */
public class ThreadDemo01 extends Thread {
    public static void main(String[] args) {
        ThreadDemo01 th=new ThreadDemo01();
        th.start();//线程开启
        for (int i = 0; i <=10 ; i++) {
            System.out.println("一边听歌..");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
   //重写run()
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("一边学习..");
        }
    }
}
