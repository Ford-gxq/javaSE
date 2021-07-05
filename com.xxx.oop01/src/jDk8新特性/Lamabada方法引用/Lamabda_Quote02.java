package jDk8新特性.Lamabada方法引用;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *      语法:
 *          对象::成员方法名
 *          类名::静态方法名
 *          类名::成员方法名
 * *       构造器引用
 *          类名::new
 */
public class Lamabda_Quote02 {

    public static void main(String[] args) {
    //类名::成员方法名
    /*1)lambda的实现是否是通过调用另外方法实现的->equals
      2)lambda 的参数列表的第一个参数匹配调用内部成员方法的对象存在,lambda的参数列表如果有其他参数,
         第二个参数往后->匹配内部调用的成方法的参数列表,返回值要匹配对应*/
    //当引用的方法为成员方法: 1.lambda的参数列表有2个参数,其中一个参数作为调用内部成员方法的对象存在->类名::成员方法名
    //BiFunction<String,String,Boolean> fun = (x,y)->x.equals(y);
    BiFunction<String,String,Boolean> fun=String::equals;
     System.out.println(fun.apply("张三","张三"));;
        //当引用的方法为成员方法: 1.lambda的 参数列表只有一个参数,作为调用内部成员方法的对象存在->类名::成员方法名
        Function<String,String> fun2=String::toString;

        //问: 能不能通过方法引用简化???  不能,因为lambda体不是通过调用其他方法实现的
        Comparator<Integer> com=(x,y)->{return x-y;};
        Comparator<Integer> comp=(a,b)->a-b;
        /*问: 能不能通过方法引用简化???  能  1) lambda体是通过调用其他方法实现的->compare
         2)引用的是静态方法,lambda的参数列表与返回值与内部引用的静态方法的参数列表与返回值匹配*/
        //Comparator<Integer> com2 = (x,y)-> Integer.compare(x,y);
        Comparator<Integer> com2=Integer::compare;



    }


}
