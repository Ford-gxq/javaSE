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
public class Demo03 {
    public static void main(String[] args) {
        //测试消费型函数接口的方法
        consumer(10000,(m)-> System.out.println("花钱购买了一台电脑"+m));
        //测试供给型函数式接口的方法
        System.out.println( getRandom(5,()->(int)(Math.random()*1000)));

        //测试函数型函数式接口
       /* System.out.println(Factorial(10,(n)->{if(n==1) return 1;return n*(n-1);}));*/
        System.out.println(Factorial(10,(m)->{return m*(m-1);}));
       //测试断言型
     /*   System.out.println(predicate("下雨"),(str)->{"下雨".equals(str)?"带伞":"不带伞";});*/


    }
    //1. 定义一个消费型函数式接口---> Interface  Consumer<T>  void accept(T t)   有来无回  有参数没有返回值
    /**1. 第一个参数是方法所需要参数，第二个参数是消费型函数式接口类型-->接口中提供的抽象方法-->有参无返回值*/
    public static void consumer(double money, Consumer<Double> com){
        com.accept(money);
    }
   //2. 定义一个供给型函数式接口Interface Supplier<T>  T get()  没有参数,有一个返回值
    /**@param num
     * 第一个参数是函数体中用到到形参
     * @param s 第二个参数是供给型函数式接口类型--->接口内提供的抽象方法--->无参有返回值
     * */
    public static List<Integer> getRandom(int num, Supplier<Integer> s){
     List<Integer>  list=new ArrayList<>();
        for (int i = 0; i <=num ; i++) {
           list.add(s.get());
        }
        return list;
    }
   //3. 定义一个函数型接口Interface Function<T,​R>    R apply(T t)  一个参数一个返回值
    /**方法的参数1是方法中用到的参数，参数2是函数式接口类型f*/
   public static int Factorial(int n, Function<Integer,Integer> f ){
       return f.apply(n);
   }
   //4. 定义一个段言型接口函数式接口--> Predicate<T>  boolean test(T t) 一个参数一个Boolean结果
    public static String predicate(String s, Predicate<String> pre){
       String str=s;
       if (!pre.test(str)){
           return null;
       }
        return str;
    }


}
