package 集合_Collection;

import java.util.Objects;
import java.util.TreeSet;

/**
 TreeSet 是set接口的实现类
        无序,去重
        无序: 存放的顺序与内部存储的顺序不一致
        底层: 红黑树(平衡二叉树)
        特点: 存储数据时候,默认升序存储
 练习:
            自定义TreeSet集合存储数据
                1.使用TreeSet存储不同类型的数据?做排序?
                2.存储自定义引用数据类型的数据
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(33);
        set.add(44);
        // 存储数据时候,默认升序存储
        System.out.println(set);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("ab");
        set2.add("a");
        set2.add("abc");
        set2.add("bc");
        set2.add("b");
        set2.add("abc");
        set2.add("bcd");
        System.out.println(set2);

        TreeSet<Person1> set3=new TreeSet<>();
        set3.add(new Person1("张三",19,"男"));
        set3.add(new Person1("李四",19,"男"));
        set3.add(new Person1("李四",19,"男"));
        System.out.println(set3);
    }

}
class Person1 implements Comparable{
    private String name;
    private int age;
    private String  gender;

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
   //set和get方法
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return age == person1.age &&
                Objects.equals(name, person1.name) &&
                Objects.equals(gender, person1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
   //重写compareTo方法，定义内部比较器
    /**默认指定: 比较规则 默认根据年龄做比较升序
     * a.compareTo(b)
     *   返回值:
     *       负数  a<b
     *       0     a=b
     *       正数  a>b
     * */

    @Override
    public int compareTo(Object o) {
       if(o instanceof Person1){
      Person1 p=(Person1)o;
      return this.age-p.age;
       }else{
           throw new ClassCastException("参数转型异常！");
       }

    }
}