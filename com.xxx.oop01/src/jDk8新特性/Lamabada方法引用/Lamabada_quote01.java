package jDk8新特性.Lamabada方法引用;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 *  方法引用:  ::
 *      作用: 为了简化Lambda表达式,称为lambda表达式的另外一种表现形式
 *      前提: 当lambda体{}中的代码,是通过调用另外一个方法实现的,这时候完整的lambda结构可以通过方法引用来简化,引用内部所调用的方法
 *      语法:
 *          对象::成员方法名
 *          类名::静态方法名
 *          类名::成员方法名
 *       构造器引用
 *          类名::new
 */
public class Lamabada_quote01 {

    public static void main(String[] args) {

   //对象::成员方法名
   //思考: 1)lambda体是否是通过调用其他方法实现的->println     2)lambda结构的参数列表()是否匹配lambda体重所引用的那个方法的参数列表() 与 返回值 -->对象::成员方法名
   //Consumer<String> com = s->System.out.println(s);
   //PrintStream ps = System.out;
   //Consumer<String> com = ps::println;
    Consumer<String> con=System.out::print;
    con.accept("张三");
     List.of(1,2,3,4,5).forEach(s->{System.out.println(s);});
     List.of(2,3,4,6,5).forEach(s->System.out.println(s));
     List.of(25,35,40,50).forEach(System.out::println);
    //类名::静态方法名
    //思考: 1)lambda体是否是通过调用其他方法实现的->max  2) lmabda结构重写的抽象方法的参数列表与返回值自动匹配内部所引用方法的参数列表与返回值
        //BiFunction<Double,Double,Double> bi = (a,b)->{return Math.max(a,b);};--->函数型函数式接口
        BiFunction<Double,Double,Double> bi=Math::max;
        System.out.println(bi.apply(1.5,2.5));
        BiFunction<Integer,Integer,Integer> bi1=(a,b)->{return Math.addExact(a,b);};
       BiFunction<Integer,Integer,Integer> bi2=Math::addExact;
        System.out.println(bi1.apply(6,7));
        System.out.println(bi2.apply(5,6));

    }

    }

