package 多线程模拟龟兔赛跑;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 模拟龟兔赛跑
 *
 * @author yana
 * 把这个代码改一改,用来实现Callable接口
 */
public class CallableExample implements Callable<Integer>{
    private  String winner;//胜利者

    private boolean gameOver(int steps) {
        if(winner!=null) { //存在胜利者
            return true;
        }else {
            if(steps ==100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner==>"+winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CallableExample racer = new CallableExample();
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
        for(int steps =1;steps<=100;steps++) {
            //模拟休息 因为兔子总是睡懒觉,如果是兔子的话,我们就让他每走十步睡2毫秒
            if(Thread.currentThread().getName().equals("pool-1-thread-1") && steps%10==0) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            //比赛是否结束
            boolean flag = gameOver(steps);
            if(flag) {
                return steps;
            }
        }
        return null;
    }
}