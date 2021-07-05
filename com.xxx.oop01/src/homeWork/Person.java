package homeWork;
/**定义一个人类
 * 私有属性为:
 * 姓名 （name） 和年龄 （age）定义构造方法用来初始化数据成员
 *  再定义显示display()方法将姓名和年龄打印出来。
 * **/
public class Person {
    private String name;
    private  int age;

    //定义display方法
    public void display() {
        System.out.println("姓名为："+name);
        System.out.println("年龄为："+age);
    }
    //定义构造方法
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p=new Person("张三",18);
        p.display();
    }
}
