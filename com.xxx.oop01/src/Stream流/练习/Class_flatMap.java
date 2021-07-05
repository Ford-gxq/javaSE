package Stream流.练习;

import Stream流.Employee;

import java.util.Arrays;
import java.util.List;

public class Class_flatMap {

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,15000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );
        //map---> //{{"z","h","a"},{},{},{}}
     list.stream().map(e-> Arrays.stream(e.getName().split("")))
             .forEach(e->{
                 e.forEach(System.out::println);
             }
     );
        System.out.println("---------------------------------------------------------");
        //flatMap
        list.stream().flatMap(e->Arrays.stream(e.getName().split(""))).forEach(System.out::println);

    }

}
