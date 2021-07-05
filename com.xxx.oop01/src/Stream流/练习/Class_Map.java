package Stream流.练习;

import jDk8新特性.bean.Employee;

import java.util.List;

public class Class_Map {


    public static void main(String[] args) {
        //创建一个存放员工信息的集合
        List<Employee> list=List.of(
             new Employee("zhangsan",18,12000),
             new Employee("lisi",19,25000),
             new Employee("王五",22,12000),
             new Employee("zhangsan",18,12000)

        );
        //获取所有的员工姓名
    // list.stream().map(e->e.getName()).distinct().forEach(System.out::println);
       list.stream().map(e->e.getSal()).distinct().forEach(System.out::println);
       list.stream().map(e->e.getName()).distinct().forEach(System.out::println);

    }


}
