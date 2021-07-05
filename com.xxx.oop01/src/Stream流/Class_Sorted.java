package Stream流;

import jDk8新特性.Lamabada方法引用.Employee;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

/**
     sorted()  默认升序排序  ->使用默认内部比较器|自然排序|内部比较规则
     Stream<T> sorted(Comparator<? super T> comparator) -> 排序使用参数指定的比较规则|定制排序
 */
public class Class_Sorted {

    public static void main(String[] args) {
        List<Employee> list= List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("赵六",18,16000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,15000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );
        //list.stream().distinct().sorted().forEach(System.out::println);
        //list.stream().distinct().sorted().forEach(System.out::println);
        //不能通过方法引用,因为参数列表不能完整匹配
        //list.stream().distinct().sorted((x,y)->Integer.compare(x.getAge(), y.getAge())).limit(2).forEach(System.out::println);
        list.stream().distinct().sorted((x,y)->Integer.compare(x.getAge(),y.getAge())).limit(2).forEach(System.out::println);

    }
}
