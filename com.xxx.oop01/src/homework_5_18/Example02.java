package homework_5_18;

import TreeMapDemo.Student;

import java.util.*;

/**
 * 模拟签到：  要求使用ArrayList
 *   		1、准备一个空白本子
 *   		2、开始签到
 *   		3、签到结束
 *   		4、获取一共有多少人签到了
 *   		5、获取到所有的名单
 *   		6、查看班长在不在名单上
 * */
public class Example02 {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList();
        HashMap<Integer,Student1> hm=new HashMap();
        //签到使用Scanner模拟
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------开始签到--------------");
        //static long  currentTimeMillis() 以毫秒为单位返回当前时间。  返回的是一个长整型数据
        //Date​(long date) 分配 Date对象并初始化它以表示自标准基准时间（称为“纪元”）以来的指定毫秒数，即1970年1月1日00:00:00 GMT。
        /*boolean after(Date date)
        若当调用此方法的Date对象在指定日期之后返回true,否则返回false */
//        System.out.println(System.currentTimeMillis());
        Date end=new Date(System.currentTimeMillis()+120*1000);//获取当前时机以及计数的时间60秒
        //循环签到  结束的条件: 1)人数够了    2)到点了
        while(true){
            System.out.println("请输入登记序号：");
            int snum=sc.nextInt();
            System.out.println("请输入学生的姓名:");
            String name=sc.next();//获取输入的名字
            Student1 stu=new Student1(name,new Date());//new一个存储名字和时间的Student类
//            list.add(stu);
            hm.put(snum,stu);
            //人数判断
            if(hm.size()==5){
                System.out.println("所有人已签到");
                break;
            }
            //时间限制
            if(new Date().after(end)){
                System.out.println("到点了,结束签到");
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


}
