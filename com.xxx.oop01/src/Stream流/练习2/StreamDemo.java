package Stream流.练习2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
需求:按照下面的要求完成集合的创建和遍历
     1:创建一个集合， 存储多个字符串元素
     2:把集合中所有以"张”开头的元素存储到一个新的集合
     3:把"张”开头的集合中的长度为3的元素存储到一个新的集合
     4:遍历上一步得到的集合
*/
public class StreamDemo {
    public static void main(String[] args) {
//创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add( "张敏");
        list.add("张无忌");
       // 把集合中所有以"张”开头的元素存储到一个新的集合
        ArrayList<String>  zhanglist=new ArrayList<>();
        for (String  s: list){
            if (s.startsWith("张")){
              zhanglist.add(s);
            }
        }
       // System.out.println(zhanglist);
     //把"张”开头的集合中的长度为3的元素存储到一个新的集合
      ArrayList<String> threelist=new ArrayList<>();
      for (String ss:zhanglist){
          if (ss.length()==3){
              threelist.add(ss);
          }
      }
        System.out.println(threelist);
        //遍历上一步得到的集合
        for(String ts:threelist){
            System.out.println(ts);
        }
        System.out.println("-------------------------使用Stream流来改进程序----------------------------------------------");
//     list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s -> System.out.println(s));
         list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);
    }

}