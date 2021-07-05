package Thread多线程;
/**开启线程的第二种方法：
   实现Runnable接口,重写run() + start()
    类单继承,接口多实现
    实现资源的共享
    Thread​(Runnable target, String name) 分配新的 Thread对象。
 */
public class Example02  implements  Runnable{
    public static void main(String[] args) {
        Example02 em=new Example02();
        Thread th=new Thread(em);//Thread​(Runnable target) 分配新的 Thread对象。
       //开启线程
        th.start();
   for (int i=1;i<20;i++){
       System.out.println("一边学习..");
       try {
           Thread.sleep(1);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
   }

    /**
           线程体 : 线程执行的代码
        */
    @Override
    public void run() {
   for(int i=1;i<=20;i++){
            System.out.println("一边谈恋爱..");
       try {
           Thread.sleep(1);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
    }
}
