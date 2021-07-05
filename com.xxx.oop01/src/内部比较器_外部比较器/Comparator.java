package 内部比较器_外部比较器;

import java.util.Arrays;

/**
  比较器:
    内部比较器|自然排序 : 比较规则定义在要比较的元素内部
    外部比较器|定制排序 : 实现Comparator接口, 重写int compare(T o1, T o2) ,内部定义比较规则
 */
public class Comparator {
    public static void main(String[] args) {
        Emp[] emps = {
                new Emp(103,"zhangsan",10),
                new Emp(102,"lisi",10),
                new Emp(101,"lisi2",20),
                new Emp(104,"wangwu",20),
                new Emp(104,"wangwu1",230),
        };

        //默认使用内部比较规则
        //Arrays.sort(emps);
        //static <T> void sort(T[] a, Comparator<? super T> c)   //Comparator<? super T> c = new Demo();
        Arrays.sort(emps,new Demo());
        System.out.println(Arrays.toString(emps));

    }
}

//外部比较器 : 对Emp类型数据的外部比较规则
class Demo implements java.util.Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return o2.getSno()-o1.getSno();//降序
    }
}