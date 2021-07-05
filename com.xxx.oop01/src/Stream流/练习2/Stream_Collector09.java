package Stream流.练习2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
Stream流的收集方法
    R collect (Collector collector) 它是通过工具类Jollectors提供了具体的收集方式
    public static <T> Collector tolist ():   把元素收集到List集合中.
    public static <T> Collector toSet ():     把元素收集到Set集合中
    public static Collector toMap (Function keyMapper, Function valueMapper):  把元素收集到Map集合中

 */
public class Stream_Collector09 {


    public static void main(String[] args) {
 //创建List集合对象
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
     //需求1:得到名字为3个字的流
        Stream<String> listtream = list.stream().filter(s -> s.length() == 3);

        //需求2:把使用Stream流操作完毕的数据收集到List集合中并遍历
        /*List<String> collectList = listtream.collect(Collectors.toList());
        for (String name: collectList){
            System.out.println(name);
        }*/

        //创建Set集合对象
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
       //需求3：得到年龄大于25岁的
        Stream<Integer> ageStream = set.stream().filter(age -> age > 25);
      //把使用Stream流操作完毕的数据收集到set中遍历
        Set<Integer> ages = ageStream.collect(Collectors.toSet());
        for (Integer age :ages){
            System.out.println(age);
        }
        //定义一个字符串数组，每个数据有姓名和年龄组成
        String[] strArray = {"林青霞,30","张曼玉,35","王祖贤,33","柳岩,25"};
     //需求5:得到字符串中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        //需求6:把使用Stream流操作完毕的数据收集到Map集合中并遍历，字符串中的姓名作键，年龄作值
        Map<String, Integer> map= arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keyset= map.keySet();
       for (String  key: keyset){
       Integer value=map.get(key);
        System.out.println(key+","+value);

        }

    }
}


