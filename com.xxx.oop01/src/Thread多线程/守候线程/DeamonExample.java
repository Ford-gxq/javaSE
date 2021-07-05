package Thread多线程.守候线程;
/**
 1.守护线程 --> 了解
        用户线程
        守护线程 : 守护用户线程的
            当所有的用户线程都执行完毕 时候,无论守护线程是否执行完毕,JVM可以直接终止结束守护线程的执行
 2. 线程默认用户线程
        垃圾回收机制就是守护线程案例
     使用:
        setDeamon(true) 设置一个线程为守护线程
        要在就绪前设置守护
 */
public class DeamonExample {
    public static void main(String[] args) {
        Thread th1=new Thread(()->{
            for (int i = 0; i <=10 ; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i ="+i);
            }
        });
        //设置th1为守护线程--->void setDaemon​(boolean on) 将此线程标记为 daemon线程或用户线程
        th1.setDaemon(true);
        //就绪--->先设置线程为守候线程再开启线程
        th1.start();
        //让th1线程休眠200ms
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //主线程
        for (int i = 0; i <=10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i="+i);
        }


    }
}
