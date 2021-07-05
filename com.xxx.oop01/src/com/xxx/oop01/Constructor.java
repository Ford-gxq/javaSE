package com.xxx.oop01;

/**
 * 构造方法的定义：
 * 在一个类中定义的方法如果同时满足以下三个条件，该方法称为构造方法，具体如下:
 ● 方法名与类名相同
 ● 在方法名的前面没有返回值类型的声明
 ● 在方法中不能使用return语句返回一个值，但是可以单独写return语句来作为方法的
 结束。
 */

public class Constructor {

    public static void main(String[] args) {

        Person p = new Person("张三","男",18);
        System.out.println(p.name+p.age+p.gender);
    }

}
class Person{
    String name;
    String gender;
    int age;
    public Person(String pName,String pGender,int pAge){
        name=pName;
        age=pAge;
        gender=pGender;
        System.out.println("有参的构造器被调用了");
    }
}


