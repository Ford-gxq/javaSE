package A_Java复习练习.反射练习;

import java.io.IOException;
import java.util.Properties;

/**Class类
 *Class Class<T>
 *    java.lang.Object
 *     java.lang.Class<T>
 * 参数类型
 *    T  此类对象构建的类的类型。例如，String.class的类型是Class<String> 。 如果正在创建的类未知，请使用Class<?> 。
 * 常用方法：
 *    ClassLoader getClassLoader() 返回类的类加载器。
 *    static 类<?> forName(String className) 返回与具有给定字符串名称的类或接口关联的类对象。
 *
 * */
public class Reflect_Demo01 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        //Person p = new Student();--->在调用smile方法的时候只能使用多态或者创建对应的类型的对象
       //static 类<?> forName(String className) 返回与具有给定字符串名称的类或接口关联的类对象。
     /* Person p= (Person) Class.forName("A_Java复习练习.反射练习.Student").newInstance();
      p.smile();*/
      //可以把"A_Java复习练习.反射练习.Student"--->这个字符串提出来定义成一个变量
       /* String str="A_Java复习练习.反射练习.Student";
        Person p= (Person) Class.forName(str).newInstance();
        p.smile();*/
       //构建一个Properties对象，使用它的成员方法：void load​(InputStream inStream) 从输入字节流中读取属性列表（键和元素对）。
        // 从哪里获得字节输入流-->获取当前线程对象-->getContextClassLoader(),返回此线程的上下文 ClassLoader类的对象-->
        //再调用getResourceAsStream​(String name) 返回用于读取指定资源的输入流InputStream。  里面的参数资源文件名
        //Class ClassLoader--->java.lang.Object继承于java.lang.ClassLoader 已知直接子类：SecureClassLoader
        Properties pro=new Properties();
        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("className.properties"));

        System.out.println(Class.forName(pro.getProperty("className")));

        /*Person p = (Person) forName(pro.getProperty("className")).newInstance();
        p.smile();*/


    }

}

class Person{
    void smile(){
        System.out.println("哈哈");
    }
}

class Teacher extends Person {
    void smile(){
        System.out.println("呵呵");
    }
}

class Student extends Person {
    void smile(){
        System.out.println("嘿嘿");
    }
}