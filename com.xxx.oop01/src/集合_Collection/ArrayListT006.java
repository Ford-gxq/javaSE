package 集合_Collection;

import java.util.ArrayList;
import java.util.List;

/**
    ArrayList 是list接口的实现类
        有序  可重复
    ArrayList
        底层结构: 可变数组
        优点: 根据索引做查询效率高
        缺点: 做增删涉及数据的拷贝等效率低
        应用场景: 在大量做查询,少量做增删的情况下适合使用ArrayList
        扩容: 默认初始容量为10,每次扩容原容量的1.5倍 int newCapacity = oldCapacity + (oldCapacity >> 1);
        新增方法: void forEach(Consumer<? super E> action)   遍历
        同步: 不同步的,线程不安全的,效率较高

    Vector 向量
        底层结构: 与ArrayList一样,都是数组
        特点与ArrayList相同
        不同: 1) 线程安全的,效率较低
              2) ArrayList扩容原容量的1.5倍,有利于节约内存
                 Vector 扩容原容量的2倍

        建议:  如果不需要线程安全实现，建议使用ArrayList代替Vector 。

 */
public class ArrayListT006 {
    public static void main(String[] args) {
        //ArrayList() 构造一个初始容量为10的空列表。
        List<Integer> ls = new ArrayList<>();  //默认空数组 ,在第一次add添加的时候才会创建|扩容
        ls.add(11);
        ls.add(123);
        ls.add(145);
        ls.add(1456);
        ls.add(14);

        //遍历打印
        ls.forEach(System.out::println);
        //顶一个ArrayList集合,存储自定义引用数据类型->Person,操作一下

    }
}
