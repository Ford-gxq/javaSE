package Thread多线程.同步锁_老师;

/**
   同步块
    synchronized(this|类.class|资源){
        排队执行的代码范围；
    }
    this : 在成员方法中,默认指代当前调用成员方法的对象
        注意: 锁this,相当于锁了这个对象的所有资源
 */
public class Class003_Synchronized implements Runnable{
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
            synchronized (this){//
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
        Class003_Synchronized web = new Class003_Synchronized();
        Class003_Synchronized web2 = new Class003_Synchronized();
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

