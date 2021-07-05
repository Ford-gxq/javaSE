package Thread多线程.同步锁_老师;
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
public class Class001_Synchronized implements Runnable{
    int tickets = 100; //100张票

    @Override  //ABC
    public void run(){
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //ABC
            if(buyTicket()){
                break;
            }
        }
    }

    //封装每次买一张的过程
    public synchronized boolean buyTicket(){
        //停止买票的条件
        if(tickets<=0){
            return true;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--);
        return false;
    }


    public static void main(String[] args) {
        Class001_Synchronized web = new Class001_Synchronized();
        //创建线程
        Thread th1 = new Thread(web,"zhangsan");
        Thread th2 = new Thread(web,"lisi");
        Thread th3 = new Thread(web,"wangwu");
        //开启线程
        th1.start();
        th2.start();
        th3.start();
    }


}

