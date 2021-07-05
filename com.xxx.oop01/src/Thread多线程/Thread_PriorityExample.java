package Thread多线程;
/**
    线程的优先级:
        setPriority()  设置线程的优先级
            1~10  1最小 10最大
            默认优先级5
            static int MAX_PRIORITY 线程可以拥有的最大优先级。
            static int MIN_PRIORITY 线程可以拥有的最低优先级。
            static int NORM_PRIORITY 分配给线程的默认优先级。
        getPriority()  获取线程的优先级

        提高线程的先执行的机会可能
 */

public class Thread_PriorityExample {
    public static void main(String[] args) {
     Thread  th1=  new Thread(()->{
        System.out.println("线程"+Thread.currentThread().getName());
    });

    Thread th=new Thread(()->{
        System.out.println("线程: "+Thread.currentThread().getName());

    });
        //设置线程优先级
        th.setPriority(10);
        System.out.println("当前的线程的优先级为："+th.getPriority());
       th.start();
       th1.start();

    }


}
