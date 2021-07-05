package Thread多线程.同步锁_老师;

/**
   同步块
    synchronized(this|类.class|资源){
        排队执行的代码范围；
    }
    类.class : 某一个类的Class对象，每一个类都存在一个Class对象，每一个类只有一个，在加载到内存的就存在，不需要我们创建
    注意: 锁类可以实现安全,但是一个类只有一个Class对象,多线程之间操作不同资源的时候,也需要排队,安全但是效率低
 */
public class Class002_Synchronized implements Runnable{
    int tickets = 100; //100张票

    @Override  //ABC
    public void run(){
        while(true){
            //睡眠一下: 为了切换不同的线程执行下面同步块的代码
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //排对执行 ： 执行的要求： 1）cpu的调度   2）获取Class002_Synchronized的Class对象
            synchronized (Class002_Synchronized.class){
                if(tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--);
            }
        }
    }

    public static void main(String[] args) {
        //一趟车次 100张
        Class002_Synchronized web = new Class002_Synchronized();
        Class002_Synchronized web2 = new Class002_Synchronized();
        //创建线程
        Thread th1 = new Thread(web,"zhangsan");
        Thread th2 = new Thread(web,"lisi");
        Thread th3 = new Thread(web2,"wangwu");
        //开启线程
        th1.start();
        th2.start();
        th3.start();
    }


}

