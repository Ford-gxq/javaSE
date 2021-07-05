package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * 中间操作:
     map() 遍历每一个流操作的元素,作为实参传递的行为(函数式接口抽象方法的重写),最后的所有结果汇总成一个流返回       {张三,李四}     {{},{},{}}
     flatMap() 遍历每一个流操作的元素,作为实参传递的行为(函数式接口抽象方法的重写),每一个结果为stream,最终把所有的流汇总成一个流返回   {{1,2,3},{4,5},{6,7}}-->{1,2,3,4,5,6,7}
 */
public class Class_flatMap {


    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,15000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );

        //map
        list.stream().map(e-> Arrays.stream(e.getName().split("")))//{{"z","h","a"},{},{},{}}
                .forEach(e->{
                    e.forEach(System.out::println);
                });

        System.out.println("---------------------------------------------------------");
        //flatMap
        list.stream().flatMap(e-> Arrays.stream(e.getName().split("")))  //{"z","h","a"...}
                .forEach(System.out::println);



    }
}
