package JDK8新特性和函数式接口练习;

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
public class Demo02 {
    public static void main(String[] args) {
    //消费型函数式接口的调用
    testConsumer(1000,m->System.out.println("给主播PDD刷火箭消费"+m));
    System.out.println(testSupplier(5,()->(int)(Math.random()*(10-1+1)+1)));;
    System.out.println(testSupplier(3,()->(int)(Math.random()*(5-2+1)+2)));;
    //调用字符串操作方法，在参数中使用lamada表达式箭头函数实现函数的方法
    System.out.println(strOperator("zhangsan",(s)->s.toUpperCase()));
        System.out.println(strOperator("zhangsan",s ->s.substring(5) ));
      //  断言型
        System.out.println(testPre(List.of(10,15,20,25,30),age->age<18));//年龄小于18岁的
        System.out.println(testPre(List.of(10,22),age->age>18));

    }
    //封装方法: 对某个字符串进行某种处理
//    函数型接口
//    Function<T,R>
//    R apply(T t)  一个参数一个返回值
    public static String strOperator(String str, Function<String,String> my){
        return my.apply(str);
    }

    /**定义一个方法：
     *  对一个整数集合中的数据进行判断,满足条件返回；
     *  返回值为一个整型的集合，方法参数1：整型类型的集合，参数2：断言型接口
     *
     * */
    public static List<Integer> testPre(List<Integer> ls, Predicate<Integer> pre){
        //存储判定过之后满足条件的数据
        List<Integer> list=new ArrayList<>();
        for (Integer in:ls){
            if (pre.test(in)){
                list.add(in);
            }
        }
        return  list;
    }
    //消费型接口--->静态方法   Consumer<T>
    //        void accept(T t)   有来无回  有参数没有返回值
    public static void testConsumer(double money, Consumer<Double> con){
        con.accept(money);

    }
    //定义供给型接口-->静态方法--->提供指定个数的随机数
    //   Supplier<T>
    //       T get()  没有参数有一个返回值
    public static List<Integer> testSupplier(int num, Supplier<Integer> sup){
        //定义一个集合,存储产生的随机数
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <=num; i++) {
            ls.add(sup.get());

        }
        return ls;
    }
}


