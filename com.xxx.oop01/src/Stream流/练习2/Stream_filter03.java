package Stream流.练习2;
import java.util.ArrayList;
/**
 * Stream<T> filter (Predicate predicate):用于对流中的数据进行过滤
 *     Predicate接口中的方法boolean test (T t):对给定的参数进行判断，返回一个布尔值
 * */
public class Stream_filter03 {

    public static void main(String[] args) {
        //创建一个集合， 存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
     //需求1: 把list集合中以张开头的元素在控制台输出
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);

     //需求2: 把list集合中长度为3的元素在控制台输出
     list.stream().filter(s->s.length()==3).forEach(System.out::println);
     //需求3:把list集合中 以张开头的，长度为3的元素在控制台输出
      list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);

    }

}

