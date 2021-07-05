package TreeMapDemo;

import 集合_Collection.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList();
        list.add(new Student(1001,"王小二",18,"张三"));
        list.add(new Student(1002,"王小三",19,"张三"));
        list.add(new Student(1003,"王小四",20,"张三"));
        list.add(new Student(1004,"王小五",21,"张三"));
        list.add(new Student(1005,"张三",22,"张三"));
        TreeMap<Integer, ArrayList> treeMap=new TreeMap<>();
        treeMap.put(1001,list);
        TreeMap<Integer,Student> tree2=new TreeMap<>();
        tree2.put(1001,new Student(1001,"王小二",18,"张三"));
        tree2.put(1002,new Student(1002,"王小三",19,"张三"));
        tree2.put(1003,new Student(1003,"王小四",22,"张三"));


    }

}
