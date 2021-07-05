package homework_5_24;

import Stream流.Employee;

import java.util.List;
import java.util.Optional;

/**
 *2.用map和reduce方法数一数流中一共用多少个Employee
 *
 * */
public class Demo03 {

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,25000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );
        Optional<Integer> count =list.stream()
                .map((e) -> 1)
                .reduce(Integer::sum);
        System.out.println(((Optional) count).get());

    }
}
