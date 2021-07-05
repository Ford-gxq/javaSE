package Thread多线程.生成者消费模式;
/**
 * 线程通信
 *         wait() 与 notify() | notifyAll() 实现线程之间共享资源的控制问题,要求使用在同步环境下
 *         来自于Object类
 *             wait() 当一个线程wait()，会进入当前对象的等待池中进行等待，等下下一次被唤醒
 *             notify() 唤醒对应对象等待池中等待的线程,随机唤醒一个
 *             notifyAll() 唤醒全部
 *     通过信号灯法:
 *         人车公用街道的案例:
 *             一条街道    一个红绿灯  boolean flag   人与车交替进行
 *             人:  东西     绿灯true
 *             车:  南北     红灯false
 *     生产者消费者模式
 *     练习 : 可以使用多线程 实现:
 *         AB1CD2EF3.....YZ
 * */
public class WaitDemo {
    //main方法中测试
    public static void main(String[] args) {
    Street street=new Street();
    new Thread(new Person(street)).start();
    new Thread(new Car(street)).start();

    }

}
//街道类
class Street{
    private boolean flag = false;//信号灯
    //南北  车
    public synchronized void ns(){
      if(flag==false){
          //车执行
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          System.out.println("车正在行驶..");
      }
     //信号灯转换
      flag=true;
        //唤醒对方
      this.notify();
        //等待
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //东西  人
    public synchronized void ew(){
        if(flag){
            //人走
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("人正在走..");
        }
        //信号灯转换
        flag=false;
        //唤醒对方
        this.notify();
        //等待
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
//人类
class Person implements  Runnable{
    Street street;

    public Person(Street street) {
        this.street = street;
    }
    @Override
    public void run() {
        while(true){
            street.ew();
        }
    }
}
//车类
class Car implements  Runnable{
  Street street;

    public Car(Street street) {
        this.street = street;
    }

    @Override
    public void run() {
        while(true){
            street.ns();
        }
    }
}