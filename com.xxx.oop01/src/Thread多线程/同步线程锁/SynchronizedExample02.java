package Thread多线程.同步线程锁;
/**
 同步块
   synchronized(this|类.class|资源){
     排队执行的代码范围；
    }
 类.class : 某一个类的Class对象，每一个类都存在一个Class对象，每一个类只有一个，在加载到内存的就存在，不需要我们创建
 注意: 锁类可以实现安全,但是一个类只有一个Class对象,多线程之间操作不同资源的时候,也需要排队,安全但是效率低
 */
public class SynchronizedExample02 implements Runnable{
    int tickets = 100; //100张票

    @Override
    public void run() {
        while (tickets!=0){

      //排对执行 ： 执行的要求： 1）cpu的调度   2）获取Class002_Synchronized的Class对象
      synchronized (SynchronizedExample02.class){
          if(tickets<=0){
              break;
          }
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--);
      }

        }
    }

    //测试
    public static void main(String[] args) {
        SynchronizedExample02 tick1=new SynchronizedExample02();
        SynchronizedExample02 tick2=new SynchronizedExample02();
        //创建线程对象
        Thread th1=new Thread(tick1,"张三");
        Thread th2=new Thread(tick1,"王五");
        Thread th3=new Thread(tick2,"赵六");
        //3个线程同时开启
        th1.start();
        th2.start();
        th3.start();
    }

}
