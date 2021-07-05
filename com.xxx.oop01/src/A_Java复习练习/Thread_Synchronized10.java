package A_Java复习练习;

import javax.swing.plaf.TableHeaderUI;

/**
 * ### 同步方法解决数据安全问题
 1.   - 同步方法的格式:  ---> 就是把synchronized关键字加到方法上
     同步方法：
           修饰符 synchronized 返回值类型 方法名(方法参数) {
           方法体；
           }
2. 同步方法的锁对象是什么呢?
 ​	  -this
3. -静态同步方法
    同步静态方法：就是把synchronized关键字加到静态方法上
        修饰符 static synchronized 返回值类型 方法名(方法参数) {
        方法体；
        }
4.同步静态方法的锁对象是什么呢?---> 类对象
 ​	类名.class
 * */
public class Thread_Synchronized10 implements  Runnable{
    private static  int ticketsCount=100;
    public static void main(String[] args) {
    Thread_Synchronized10 ts=new Thread_Synchronized10();
    Thread th1=new Thread(ts,"窗口1");
    Thread th2=new Thread(ts,"窗口2");
    Thread th3=new Thread(ts,"窗口3");
    //开启三个线程
    th1.start();
    th2.start();
    th3.start();

    }
    //重写run()
    @Override
    public void run() {
     while (true){

         //调用方法判断第1个窗口的情况
         if("窗口1".equals(Thread.currentThread().getName())){ //调用方法判断第3个窗口的情况
                //将静态同步方法的返回结果保存一下
                boolean result = synchronizedMethod();
                if(result){//result=true表示票已经卖完，break跳出循环
                    break;
                }
            }
         //这里使用同步块处理
         if ("窗口2".equals(Thread.currentThread().getName())){
             //同步代码块
             synchronized(Thread_Synchronized10.class){//锁类对象的代码块
                 if(ticketsCount == 0){
                     break;
                 }else {
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                  ticketsCount--;
                  System.out.println(Thread.currentThread().getName()+"正在售票,还剩下"+ticketsCount+"张票");

                 }
             }

         }
   //调用方法判断第3个窗口的情况
         if ("窗口3".equals(Thread.currentThread().getName())){
             boolean result2=synchronizedMethod();//获取一下静态同步方法返回的布尔值
             if (result2){
                 break;
             }else{
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
              ticketsCount--;
              System.out.println(Thread.currentThread().getName()+"正在卖票，还剩"+ticketsCount+"张票");

             }
         }

     }


    }
 //定义一个静态方法synchronized修饰
  public static synchronized boolean synchronizedMethod(){
        //判断票数是否等于0
      if(ticketsCount== 0){
          return true;
      }else {//票的数量不为0，还有可出售的票
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          //票数自减
          ticketsCount--;
          //打印当前线程出售票后剩下的票数
       System.out.println(Thread.currentThread().getName()+"正在售票，还剩下"+ticketsCount+"张票");
          return false;
      }
  }

}

