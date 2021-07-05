package Stream流;

import jDk8新特性.bean.Employee;

import java.util.List;
import java.util.stream.Stream;

/**
流的中间操作:
        Stream<T> filter(Predicate<? super T> predicate)  过滤
        Stream<T> distinct()  去重
        Stream<T> limit(long maxSize) 返回由此流的元素组成的流，截断长度不超过 maxSize 。
        Stream<T> skip(long n) 在丢弃流的第一个 n元素后，返回由此流的其余元素组成的流。  如果没有返回一个空流
 */
public class Class_Stream002 {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,15000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );
        //获取stream
        Stream<Employee> stream = list.stream();
        //中间操作
        //过滤   去重
        //延迟执行
        stream = stream.filter(employee -> {
            System.out.println("中间过滤操作.....");
            return employee.getAge()>=18;
        }).distinct().limit(2).skip(1);

        //终止行为
        stream.forEach(System.out::println);

        list.stream().filter(e->e.getSal()<15000).distinct().forEach(System.out::println);

    }
}
