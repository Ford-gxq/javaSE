package Thread多线程;
/**
    多线程:
        多任务执行,多条路径执行,如果没有多任务就不需要多线程
        进程线程之间区别:
        串行,并行,并发-->了解
    学习多线程的目标:
        1、创建线程的方式   ***
        2、线程的状态
        3. 线程安全问题     ***
        4. 线程通信
      线程开启方式:
        1.继承Thread,重写run()+start()
        2.实现一个接口Runnable接口,重写run()方法+start()  ****
            多实现
            实现资源共享
        3.Callable接口,重写call(),+开启方式-->了解
 */
//开启线程的第一种方式：
public class Example01 extends Thread{

    public static void main(String[] args) {
        //创建一个新的线程
        Example01 th = new Example01();

        //开启一个线程: 可以准备执行,执行要看cpu的调度
        th.start();

        //主线程
        for(int i= 0 ;i<=20;i++){
            System.out.println("一边吃饭...");
            //休息5ms
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
        线程体
     */
    @Override
    public void run() {
        for(int i= 0 ;i<=20;i++){
            System.out.println("一边听歌...");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
