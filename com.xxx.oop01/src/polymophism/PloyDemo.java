package polymophism;
/**
 1. 多态:
    一种多种形态,多种表现形式
    多态的表现形式: 父类引用指向子类对象
    多态的前提: 类的继承|接口的实现
    多态使用特点: 当父类类型的引用调用方法时候,会调用子类中的重写方法(前提子类中存在重写方法)
 2. 多态调用:
        成员变量
            编译运行,看父类|类型|左边
        成员方法
            编译看父类|左边|类型
            运行找对象|子类|右边
 3.   总结: 多态如果不配合方法的重写,没有意义
 */
class PloyDemo01 {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        //多态--->父类引用指向子类对象，成员变量-->编译运行均看父类
        Person p1 = new Student();
        System.out.println(p1.name);
        //s1.test();
    }
}
class Person{
    String name = "父类";
    //父类的方法
    void test(){
        System.out.println("父类test方法");
    }
}
class Student extends Person{
    String name = "子类";
    //重写方法
    void test(){
        System.out.println("子类test方法");
    }
}
