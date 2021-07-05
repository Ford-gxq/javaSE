package 反射;

import java.io.IOException;
import java.util.Properties;

public class ReflectDemo001 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //Person p = new Student();--->在调用smile方法的时候只能使用多态或者创建对应的类型的对象
        Properties pro = new Properties();//定义一个Properties对象
        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("className.properties"));
        //Class.forName(pro.getProperty("className"))
        Person p = (Person) Class.forName(pro.getProperty("className")).newInstance();
        p.smile();

    }

}

class Person{
    void smile(){
        System.out.println("哈哈");
    }
}

class Teacher extends Person{
    void smile(){
        System.out.println("呵呵");
    }
}

class Student extends Person{
    void smile(){
        System.out.println("嘿嘿");
    }
}