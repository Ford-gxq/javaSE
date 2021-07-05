package homework_5_18;

import TreeMapDemo.Student;
import 内部比较器_外部比较器.Emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class Example01 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList();
        list.add(new Student(1001,"王小二",18,"张三"));
        list.add(new Student(1002,"王小三",19,"张三"));
        list.add(new Student(1003,"王小四",20,"张三"));
        list.add(new Student(1004,"王小五",21,"张三"));
        list.add(new Student(1005,"张三",22,"张三"));
        //匿名内部类  接口多态
           new Comparator<Student1>(){
               @Override
               public int compare(Student1 s1, Student1 s2) {
                   return s1.getAge()-s2.getAge();
               }
           };
        System.out.println(list);
        //遍历
        for(Student stu :list){
            System.out.println(stu.getAge());
        }
        System.out.println("班级年龄最大的学生是："+list.get(list.size()-1));
        System.out.println("班级中年龄最小的学生是："+list.get(0));
    }
}
