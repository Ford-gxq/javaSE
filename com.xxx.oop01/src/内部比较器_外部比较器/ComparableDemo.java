package 内部比较器_外部比较器;

import java.util.Arrays;
import java.util.TreeSet;

import static java.util.Arrays.*;

/**
 自定义引用属于类型比较大小:
  比较器:
      内部比较器|自然排序 : Comparable接口 compareTo(T o) 中定义比较规则
         在排序的时候,默认找到数据类型中的内部比较规则
  外部比较器|定制排序
* */
public class ComparableDemo {
    public static void main(String[] args) {
        //TreeSet<Emp> set = new TreeSet<>(); //默认使用内部比较器
        //public TreeSet(Comparator<? super E> comparator)
    /**  TreeSet<Emp> set = new TreeSet<>(new Demo()); //指定当前这个集合比较存储数据的时候使用的是参数外部比较器
        set.add(new Emp(103,"zhangsan",10));
        set.add(new Emp(102,"lisi",10));
        set.add(new Emp(101,"lisi2",20));
        set.add(new Emp(104,"wangwu",20));
        set.add(new Emp(104,"wangwu1",230));
     */
//        TreeSet<Emp> emps=new TreeSet<>();
//        emps.add(new Emp(1001,"zhangsan",10));
//        emps.add(new Emp(1002,"lisi",10));
//        emps.add(new Emp(1003,"zhangsan",10));
//        emps.add(new Emp(1004,"wangwu",10));
//        System.out.println(emps);
        Emp[] emps={
         new Emp(1001,"zhangsan",10),
         new Emp(1002,"lisi",20),
         new Emp(1001,"zhangsan",10),
         new Emp(1004,"wangwu",10)
        };
        Arrays.sort(emps);
        System.out.println(emps);
    }


}
