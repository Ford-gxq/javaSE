package Thread多线程.同步锁_老师;

/**
   同步块
        double check 双重检查 为了提高效率,不必要的代码不要放入同步块中
 */
class Class005_Synchronized implements Runnable{
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
            //满足条件
            if(tickets.num<=0){
                break;
            }
            //不需要排队执行
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            System.out.println("------------------------------------");
            //ABC
            synchronized (tickets){
                //double check 双重检查
                if(tickets.num<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets.num--);
            }
        }
    }

    public static void main(String[] args) {
        //一趟车次 100张
        Class005_Synchronized web = new Class005_Synchronized();
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