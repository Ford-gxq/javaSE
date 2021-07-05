package Thread多线程;

import java.util.Scanner;
import java.util.TreeMap;

public class Code2{
    static boolean flag = false;
    public static void main(String[] args) throws InterruptedException {
//        2.签到的案例中可以加入多线程实现(人数到了就结束签到,时间到了就结束签到比如开始签到1分钟以内结束签到)
        TimeCount tc = new TimeCount();
        Thread sc = new Thread(tc);
        TreeMap<Integer,String> tm = new TreeMap<>();
        int totalNumber = 10;
        System.out.println("开始签到");
        sc.start();
        Scanner scanner = new Scanner(System.in);
        String next;
        int count=0;
        while (true){
            Thread.sleep(600);
            if(Code2.flag){
                System.out.println(tm);
                break;
            }
            if(tm.size()==totalNumber){
                System.out.println("全员到齐，结束签到");
                System.out.println(tm);
                Code2.flag=true;
                break;
            }
            System.out.println("请签名：");
            next= scanner.next();
            tm.put(++count, next);

        }
    }

}
class TimeCount implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=0;i<60;i++){
                Thread.sleep(100);
                if(Code2.flag){
                    return;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("签到时间到，签到结束");
        Code2.flag=true;
    }
}