package 多线程模拟龟兔赛跑;

/**
* 龟兔赛跑
* */
public class Hare_TortoiseGame implements  Runnable {
    //标识->用来判断决定线程是否继续执行
    private String flage = null;
    public static void main(String[] args) {
        Hare_TortoiseGame demo=new Hare_TortoiseGame();
        //创建两个线程对象
        Thread th1=new Thread(demo,"兔子");
        Thread th2=new Thread(demo,"乌龟");
        //开启线程
        th1.start();
        th2.start();
    }

    /**
    * 线程体
    * */
    @Override
    public void run() {
       for (int steep=1;steep<=100;steep++){
           System.out.println(Thread.currentThread()+"正在跑第"+steep+"步");
           if (Thread.currentThread().getName().equals("兔子")&& steep%10==0){//String getName() 返回此线程的名称。
               try {
                   Thread.sleep(5);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           if (Thread.currentThread().equals("乌龟")){
               try {
                   Thread.sleep(1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
       }
           //结束的条件
           if(!checkOver(steep)){
               break;
           }
        }

    }
    //检查线程是否结束  返回值: true继续跑   false结束
    private boolean checkOver(int steep) {
        //我是否赢了
        if(steep==100){
            flage = Thread.currentThread().getName();
            return false;
        }
        //是否已经有人赢了
        if(flage!=null){
            return false;
        }
        return true;
    }
}
