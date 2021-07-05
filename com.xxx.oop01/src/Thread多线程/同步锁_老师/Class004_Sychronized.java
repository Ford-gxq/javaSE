package Thread多线程.同步锁_老师;
/**
   同步块
    synchronized(this|类.class|资源){
        排队执行的代码范围；
    }
 资源: 自定义的引用数据类型才能锁住
    注意: 锁要锁不变的内容,会变的锁不住
          自定义引用数据类型对象地址永远不会变
 */
class Class004_Synchronized implements Runnable{
    Tickets tickets = new Tickets(); //100张票

    @Override  //ABC
    public void run(){
        while(true){
            //睡眠一下: 为了切换不同的线程执行下面同步块的代码
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (tickets){
                if(tickets.num<=0){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets.num--);
            }
        }
    }

    public static void main(String[] args) {
        //一趟车次 100张
        Class004_Synchronized web = new Class004_Synchronized();
        Class004_Synchronized web2 = new Class004_Synchronized();
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

class Tickets{
    int num = 100;
}