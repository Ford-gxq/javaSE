package Thread多线程.守候线程;
/**
    了解
    interrupt()  为线程添加中断标识
    isInterrupted()  判断一个线程是否添加过中断标识,是否之前调用过interrupt()方法添加中断标识
    interrupted() 判断一个线程是否添加过中断标识,是否之前调用过interrupt()方法添加中断标识
        与isInterrupted区别在于: interrupted()判断中断标识的同时清除这个标识-->复位标识

 */
public class InterruputExample {
    public static void main(String[] args) {
        Thread th  = new Thread(()->{
            int i = 1;
            while(true){
                if(Thread.interrupted()){
                    System.out.println("当前线程添加过中断标识");
                    //break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("当th线程sleep的时候添加了中断标识,遇到InterruptedException异常");
                }
                System.out.println("哈哈哈哈"+i++);
            }
        });
        th.start();

        //判断th线程是否存在中断标识
        System.out.println(th.isInterrupted());

        for(int i=1;i<=10;i++){
            if(i==5){
                //为th线程添加中断标识
                th.interrupt();
                System.out.println(th.isInterrupted());
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终判断"+th.isInterrupted());

    }
}
