package Stream流;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
    终止行为
      收集
       Collectors静态方法的实现
 */
public class Class08_Collertor {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("zhangsanfeng",18,20000),
                new Employee("zhangsan",17,10000),
                new Employee("lisi",20,25000),
                new Employee("wangwu",19,13000),
                new Employee("wangwu",19,13000)
        );

        //Collectors.toList()
        List<Employee> ls = list.stream().collect(Collectors.toList());
        System.out.println(ls);


        //joining() 流操作的每一个字符串数据的拼接->结果一个完整字符串
        System.out.println(list.stream().map(Employee::getName).collect(Collectors.joining()));

        ////Collectors.toSet()
        System.out.println(list.stream().map(Employee::getName).collect(Collectors.toSet()));

        //////Collectors.toMap()
        //Map<String,Integer> map = list.stream().distinct().collect(Collectors.toMap(e->e.getName(), e->e.getAge()));
        //注意: 实现可以key的去重
        Map<String,Integer> map = list.stream().distinct().collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println(map);

        //常见的收集行为
        System.out.println(list.stream().map(Employee::getSal).collect(Collectors.counting()));
        System.out.println(list.stream().collect(Collectors.averagingDouble(Employee::getSal)));
        System.out.println("-------------");
        System.out.println(list.stream().collect(Collectors.summarizingDouble(Employee::getSal)).getMin());
        System.out.println(list.stream().collect(Collectors.maxBy((x,y)->Double.compare(x.getSal(),y.getSal()))));
        System.out.println(list.stream().collect(Collectors.minBy((x,y)->Double.compare(x.getSal(),y.getSal()))));
    }
}
