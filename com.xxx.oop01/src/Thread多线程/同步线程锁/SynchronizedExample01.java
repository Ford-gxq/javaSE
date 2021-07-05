package Thread多线程.同步线程锁;
/**
 线程安全问题:
     当多线程同时操作 同一份资源的时候,才有可能遇到线程不安全问题
     同步锁：让一些代码多线程排队执行
 synchronized ：
  同步方法 ： 静态方法|成员方法
    同步成员方法 相当于锁this
    同步块 ：
    同步的代码范围过大： 效率低
    同步的代码范围太小： 锁不住
 */
public class SynchronizedExample01 implements  Runnable {
    int tickets=100;//100张票
    public static void main(String[] args) {
        SynchronizedExample01 tick1=new SynchronizedExample01();
        //创建线程对象
        Thread th1=new Thread(tick1,"张三");
        Thread th2=new Thread(tick1,"王五");
        Thread th3=new Thread(tick1,"赵六");
        //3个线程同时开启
        th1.start();
        th2.start();
        th3.start();
    }

    //封装每次买一张的过程
    public  synchronized  boolean buyTicket(){
        //停止买票的条件
        if(tickets<=0){
            return true;
        }
        //买票的时间
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--);
        return false;
    }

    @Override
    public void run() {
        while (tickets!=0){
           //在条件里调用买票的方法
            if(buyTicket()){
                break;
            }

        }
    }
}
