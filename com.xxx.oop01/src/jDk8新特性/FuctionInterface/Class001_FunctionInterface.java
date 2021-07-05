package jDk8新特性.FuctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
    四大内置函数式接口:
        1.消费型接口
            Consumer<T>
                void accept(T t)   有来无回  有参数没有返回值
        2.供给型接口
            Supplier<T>
                T get()  没有参数有一个返回值
        3.函数型接口
            Function<T,R>
                R apply(T t)  一个参数一个返回值
        4.段言型接口
            Predicate<T>
                boolean test(T t) 一个参数一个Boolean结果
 */
public class Class001_FunctionInterface {
    public static void main(String[] args) {
        testComsumer(10000,m-> System.out.println("给主播PDD刷火箭消费"+m));
        testComsumer(5000,m-> System.out.println("给主播小团团刷火箭消费"+m));

        System.out.println(getNum(5,()->(int)(Math.random()*(10-1+1)+1)));;
        System.out.println(getNum(3,()->(int)(Math.random()*(5-2+1)+2)));;

        System.out.println(strHandler(" zhangsan ",s->s.trim()));
        System.out.println(strHandler(" zhangsan ",s->s.toUpperCase()));

        System.out.println(testPre(List.of(18,20,11,19,15,30),age->age>=18));
        System.out.println(testPre(List.of(18,20,11,19,15,30),age->age>=18 && age<=25));

        List.of(18,20,11,19,15,30).forEach(i->System.out.println(i));

    }

    //对一个整数集合中的数据进行判断,满足条件返回-->
    // 返回值为一个整型的集合，方法参数1：整型类型的集合，参数2：断言型接口
    public static List<Integer> testPre(List<Integer> ls, Predicate<Integer> pre){
        //存储判定过之后满足条件的数据
        List<Integer> list = new ArrayList<>();
        for(Integer in:ls){
            if(pre.test(in)){
                list.add(in);
            }
        }
        return list;
    }

    //封装方法: 对某个字符串进行某种处理
    public static String strHandler(String str, Function<String,String> my){
        return my.apply(str);
    }

    //提供指定个数的随机数
    public static List<Integer> getNum(int num, Supplier<Integer> sup){
        //定义一个集合,存储产生的随机数
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=num;i++){
            ls.add(sup.get());
        }
        return ls;
    }

    //消费
    public static void testComsumer(double money, Consumer<Double> com){
        com.accept(money);
    }
}
