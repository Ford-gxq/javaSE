package homework_5_19;

import Thread多线程.Code2;
import homework_5_18.Student1;

import java.util.*;

/**
 * 签到的案例中可以加入多线程实现(人数到了就结束签到
 *     时间到了就结束签到比如开始签到1分钟以内结束签到)
 * */
public class Example01 implements Runnable{
    boolean flag=false;
    public static void main(String[] args) {
        Example01 em=new Example01();
        Thread th=new Thread(em,"时间线程");
        HashMap<Integer, Student1> hm=new HashMap();
        System.out.println("------------------开始签到--------------");
        th.start();
        //签到使用Scanner模拟
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入登记序号：");
        int snum=sc.nextInt();
        System.out.println("请输入学生的姓名:");
        String name=sc.next();//获取输入的名字
        Student1 stu=new Student1(name,new Date());//new一个存储名字和时间的Student类
        hm.put(snum,stu);
        //循环签到  结束的条件: 1)人数够了  2)到点了
        while(true){
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(em.flag){
                System.out.println(hm);
                break;
            }
            //人数判断
            if(hm.size()==10){
                System.out.println("所有人已签到");
                System.out.println(hm);
                em.flag=true;
                break;
            }

        }
        System.out.println("签到人数"+hm.size());
        System.out.println("签到名单"+hm);
        //遍历map集合并判断张三班长是否在名单中
        Set<Integer> set=hm.keySet();
        //获得一个set集合，使用增强foreach和 Iterator
        Iterator it=set.iterator();//获取一个Iterator对象
        while(it.hasNext()){
            if(hm.get(it.next()).getName().equals("张三")){
                System.out.println("班长张三在名单中！");
            }

        }
    }
    @Override
    public void run() {

        for (int i = 0; i <=20 ; i++) {
            try {
                Thread.sleep(1000);
                if(flag){
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("签到时间到，签到结束");
        flag=true;

    }
}
