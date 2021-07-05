package Thread多线程;
/**
    yield() 礼让线程
        让一个线程恢复到就绪状态
        给了其他线程更多的可能性
 */
public class YieldDemo implements Runnable{
    public static void main(String[] args) {
        new Thread(new YieldDemo(),"A").start();
        new Thread(new YieldDemo(),"B").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"结束执行");
    }
}
