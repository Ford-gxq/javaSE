package Thread多线程;
/**
    线程的状态方法
        getState()
 线程状态。 线程可以处于以下状态之一：
        NEW
        尚未启动的线程处于此状态。
        RUNNABLE
        在Java虚拟机中执行的线程处于此状态。
        BLOCKED
        被阻塞等待监视器锁定的线程处于此状态。
        WAITING
        无限期等待另一个线程执行特定操作的线程处于此状态。
        TIMED_WAITING
        正在等待另一个线程执行最多指定等待时间的操作的线程处于此状态。
        TERMINATED
        已退出的线程处于此状态。
 */
public class ThreadSateDemo {
    public static void main(String[] args) {
    Thread th1=new Thread(()->{
        for (int i = 0; i <=10 ; i++) {
            if (i==6){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    });
        //获取线程状态
        System.out.println(th1.getState());
        th1.start();
        System.out.println(th1.getState());//Runnable
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(th1.getState());

            //终止条件
            if(th1.getState().equals(Thread.State.TERMINATED)){
                break;
            }
        }
    }
}
