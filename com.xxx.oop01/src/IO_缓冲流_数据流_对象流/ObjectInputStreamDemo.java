package IO_缓冲流_数据流_对象流;

import java.io.*;
import java.util.Arrays;

/**
    Object流 | 对象流  字节流的功能流
        读写对象|引用数据类型的数据

    序列化: 把对象类型数据转为可存储或者可传输的状态的过程称为序列化
    反序列化: 转为对象状态

    ObjectInputStream  反序列化输入流 新增方法:Object readObject()
    ObjectOutputStream 序列化输出流  新增方法:void writeObject(Object obj)

    先序列化后反序列化
    写出与读入的顺序要保持一致
    不是所有的引用数据类型都能够序列化 需要实现一个接口  java.io.Serializable
    不是所有的属性都需要序列化  transient
    静态的内容不能序列化
    父类实现序列化,子类中所有的内容都能够序列化
    子类实现序列化,父类没有实现,子类只能序列化子类独有的内容

 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObj("D://ppp.txt");
        readObj("D://ppp.txt");
    }

    //反序列化
    public static  void readObj(String src) throws IOException, ClassNotFoundException {
        //流
        ObjectInputStream is=new ObjectInputStream(new FileInputStream(src));

        //读
        Object obj1 =(Person)is.readObject();
        int[] obj2 = (int[]) is.readObject();

        System.out.println(obj1);
        System.out.println(Arrays.toString(obj2));

        //关闭
        is.close();
    }

    //序列化
    public static void writeObj(String dest) throws IOException {
        //流
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dest));

        Person p = new Person("张三",18,1001);
        int[] arr = new int[]{1,2,3,4};

        //写出
        out.writeObject(p);
        out.writeObject(arr);

        //刷出
        out.flush();

        //关闭
        out.close();

        p.setName("张三丰");
        p.setAge(20);
    }
}

class Person implements Serializable{
    private static final long serialVersionUID = 3608615805362898881L;
    private String name;
    private static int age;
    private transient int num ;

    public Person() {
    }

    public Person(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
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

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
    }

    public void setNum(int num) {

        this.num = num;
    }
}
