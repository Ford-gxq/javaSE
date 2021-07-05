package Thread多线程;
/**
    join 插队线程
        join可能一个线程进入阻塞状态,等待插队线程执行完毕
 */
public class Yield_JionMethod {
    public static void main(String[] args) {
    new Thread(new Father(),"Father线程").start();

    }

}
//定义一个Father类
class Father  implements  Runnable{

    @Override
    public void run() {
        System.out.println("想抽烟了...");
        System.out.println("拿钱给儿子买烟...");
       Thread  th= new Thread(new Son(),"Son线程");
       th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//定义一个儿子类实现Runnable接口
class Son implements Runnable{
    @Override
    public void run() {
        System.out.println("接过钱去超市买烟...");
        for (int i=0;i<=10;i++){
            System.out.println("去游戏厅玩10S..");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"s过去 了...");
        }
        System.out.println("拿钱去超市买烟...");
    }
}