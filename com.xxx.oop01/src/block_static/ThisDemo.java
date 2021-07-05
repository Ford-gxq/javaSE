package block_static;
/**
    this 关键字
        1. 指代当前new的对象,存储对应指向的对象的地址
          在构造器的首行,用来调用本类中的其他构造器
            this(实参);
        2.当成员变量与局部变量同名时,会默认发生就近原则
            想要指代成员变量,通过this.成员变量进行调用,this动态指向调用当前构造器|方法的对象
            在成员方法中的this,指代调用成员方法的对象
            如果没有同名问题,想要指代成员时候,默认省略了this.
       注意: static修饰的方法中不能使用this
 **/
public class ThisDemo {
    public static void main(String[] args) {
        Person p=new Person("张三",18);
        p.Study();
        Person.height=18;
        p.height=19;


    }
}
//一个程序里面可以定义多个类，但只能有一个public修饰的类
 class Person {
    String name;
    int age;
    static int height;
    public void Study() {
        System.out.println("正在学习...");
    }

    //无参构造
    public Person(){
        System.out.println("这是无参构造...");
    }
    //有参构造
    public Person( String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    public static void testStatic(){
        System.out.println("静态方法");
    }
}