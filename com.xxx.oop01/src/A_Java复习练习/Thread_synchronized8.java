package A_Java复习练习;
/**
 *### 卖票【应用】----->没有实现线程同步，出现多卖票，一张票被卖了多次，出现负票的数据安全问题。
 * - 案例需求
 *   某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 * - 实现步骤:
 *           - 定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
 *           - 在SellTicket类中重写run()方法实现卖票，代码步骤如下
 *           - 判断票数大于0，就卖票，并告知是哪个窗口卖的
 *           - 卖了票之后，总票数要减1
 *           - 票卖没了，线程停止
 *           - 定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
 *           - 创建SellTicket类的对象
 *           - 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
 *           - 启动线程
 * */
class SellTicket implements Runnable {
    private int tickets = 100;
    //在SellTicket类中重写run()方法实现卖票，代码步骤如下
    @Override
    public void run() {
        while (true) {
            if(tickets <= 0){
                //卖完了
                break;
            }else{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets--;
                System.out.println(Thread.currentThread().getName() + "在卖票,还剩下" + tickets + "张票");
            }
        }
    }
}
public class Thread_synchronized8 {
    public static void main(String[] args) {
        //创建SellTicket类的对象
        SellTicket st = new SellTicket();

        //创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}