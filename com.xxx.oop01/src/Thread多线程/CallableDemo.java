package Thread多线程;

import java.util.concurrent.*;

/**
 * 模拟龟兔赛跑
 * @author yana
 *     把这个代码改一改,用来实现Callable接口
 *   Class Executors
 *       ---java.lang.Object
 *       ---java.util.concurrent.Executors
 * Executors类的静态方法：
 * 1)static ExecutorService newFixedThreadPool​(int nThreads)
 *       创建一个线程池，该池重用在共享的无界队列中运行的固定数量的线程。
 * 2)Future<?> submit​(Runnable task) 提交Runnable任务以执行并返回表示该任务的Future。
 *  Interface ExecutorService继承于Executors
 */
public class CallableDemo implements Callable<Integer>{
    private  String winner;//胜利者

    private boolean gameOver(int steeps) {
        if(steeps ==100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner==>"+winner);
            return true;
        }
        if(winner!=null) { //存在胜利者
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CallableDemo racer = new CallableDemo();
        //创建执行服务: 
        ExecutorService  ser=Executors.newFixedThreadPool(2);
        //提交执行: 
        Future<Integer> result1 =ser.submit(racer) ;
        Future<Integer> result2 =ser.submit(racer) ;
        //获取结果:  
        Integer r1 =result1.get();
        Integer r2 =result2.get();
        System.out.println(r1+"-->"+r2);
        //关闭服务:  
        ser.shutdownNow();
    }
    @Override
    public Integer call() throws Exception {
        for(int steeps =1;steeps<=100;steeps++) {
            //模拟休息 因为兔子总是睡懒觉,如果是兔子的话,我们就让他每走十步睡2毫秒
            if(Thread.currentThread().getName().equals("pool-1-thread-1") && steeps%10==0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steeps);
            //比赛是否结束
            boolean flag = gameOver(steeps);
            if(flag) {
                return steeps;
            }
        }
        return null;
    }
}