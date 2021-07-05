package Thread多线程;
/**
    模拟12306买票
        定义100张票-->多线程共享的资源
        3个人重复买完,票没了就结束
 */
public class Thread12306Demo implements  Runnable{
    int tickets = 100; //100张票

    /**
    * 线程体
    * */
    @Override
    public void run() {
     while (true){
         //停止买票的条件
         if(tickets<=0){
             break;
         }
         try {
             Thread.sleep(1);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets-- +"票");
       }

    }
    //main方法测试
    public static void main(String[] args) {
        Thread12306Demo  demo=new Thread12306Demo();
        //创建3条线程
        Thread   th1=new Thread(demo,"张三");
        Thread  th2=new Thread(demo,"李四");
        Thread th3=new Thread(demo,"王五");
        //开启线程
        th1.start();
        th2.start();
        th3.start();

    }
}
