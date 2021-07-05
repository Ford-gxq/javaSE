package 集合_Collection;
import 内部比较器_外部比较器.Emp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
/**
 TreeMap
     key就是TreeSet
         底层: 红黑树
     特点: 自动做升序排序(根据key)
 练习: 使用TreeMap,key存储自定义引用数据类型的数据  默认比较规则|自定义比较规则
 * */
/**
 * 三目运算符语法复习：
 * boolean表达式 ? 表达式1 : 表达式2
 * 解释：
 * boolean表达式的结果是true,则整个表达式的结果就是表达式1，相反则是表达式2。
 * */
    public class TreeMapDemo {
    public static void main(String[] args) {
        //定义比较规则  TreeMap(Comparator<? super K> comparator)
        TreeMap<Employee,Integer>  treeMap=new TreeMap<>((e1,e2)->e1.getAge()-e2.getAge());
        treeMap.put(new Employee(1002,"李白",18,12000),1002);
        treeMap.put(new Employee(1002,"杜甫",18,10000),1002);
        treeMap.put(new Employee(1001,"马克思",18,8000),1001);
        treeMap.put(new Employee(1004,"刘胡兰",18,25000),1004);
        System.out.println(treeMap);
        //定义一个匿名内部类让他继承Comparator，实现compare()抽象方法
        new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                int num=o1.getEmpno()-o2.getEmpno();
                return num==0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        };



    }

}
