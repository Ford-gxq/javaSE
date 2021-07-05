package jDk8新特性.Lamabada方法引用;

import java.util.function.Function;
import java.util.function.Supplier;
/**
 * 构造器引用
 *      类名::new
 * 数组引用
 *     类名::new
 */
public class Lamabda_Quote03 {

    public static void main(String[] args) {
        // Supplier<Employee> sup = ()-> new Employee();

        //lambda体通过构造器引用的方式 : new了一个类型的对象Employee,调用构造器初始化信息的时候,Employee类型的构造器,哪一个构造器->看lambda的参数列表,因为lambda的参数列表就匹配构造器的参数列表
        Supplier<Employee> sup = Employee::new;

        Function<String,Employee> fun = Employee::new;

        System.out.println(sup.get());
        System.out.println(fun.apply("李四"));

        //数组引用
        //Function<Integer,String[]> fun2 = i -> new String[i];
        Function<Integer,String[]> fun2 = String[]::new;


    }


}
