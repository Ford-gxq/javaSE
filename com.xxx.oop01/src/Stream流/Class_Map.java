package Stream流;

import java.util.List;

/**
 中间操作:
    map() 遍历每一个流操作的元素,作为实参传递的行为(函数式接口抽象方法的重写),最后的所有结果汇总成一个流返回
    distinct() 去重针对hashcode与equals方法
 */
public class Class_Map {
    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,15000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );
  //获取所有的员工姓名
//        list.stream().map(e->e.getName()).distinct().forEach(System.out::println);
//        list.stream().map(e->e.getName().length()).forEach(System.out::println);
    list.stream().map(e->e.getName()).distinct().forEach(System.out::println);

    }

}
