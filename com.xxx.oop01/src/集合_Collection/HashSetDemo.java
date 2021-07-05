package 集合_Collection;

import java.util.HashSet;
import java.util.Objects;

/**
*  HashSet
 *         底层是由HashMap维护的
 *         底层结构: 哈希表(数组+链表+红黑树)
 *         特点 : 查询,增删效率较高,无序,没有索引,去重
 *         新增方法: 无新增方法
 *         遍历方式: 1)foreach  2)iterator迭代器
 *         练习: 定义HashSet存储自定义引用数据类型的数据,观察去重问题(所有成员变量的值相同就是一个对象,就要去重)
* */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        hs.add(new Student(1001,"张三",18));
        hs.add(new Student(1002,"李四",18));
        hs.add(new Student(1002,"李四",18));
        System.out.println(hs);
    }

}
class Student{
    private  int id;
    private  String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//重写equals方法和hashCode方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
//重写toString


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}