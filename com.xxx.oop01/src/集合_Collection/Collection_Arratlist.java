package 集合_Collection;

import java.util.ArrayList;

/**Collection集合
 1. Collection: 单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个
重要的子接口，分别是List和Set。其中，List的特点是元素有序、元素可重复。Set
的特点是元素无序，而且不可重复。List接口的主要实现类有Arraylist和LinkedList,
Set接口的主要实现类有HashSet和TreeSet.
   2. Map:双列集合类的根接口，用于存储具有键(Key)、值(Value)映射关系的元素，每
         个元素都包含一对键值，在使用Map集合时可以通过指定的Key找到对应的Value,
     例如 根据一个学生的学号就可以找到对应的学生。Map接口的主要实现类有HashMap和TreeMap。
 *
 * */
public class Collection_Arratlist {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(new Person("王小二",18));
        list.add(new Person("王小三",19));
        list.add(new Person("王小四",20));
        System.out.println(list.size());
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }

}
 class Person {
    private  String name;
    private  int  age;

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
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

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
