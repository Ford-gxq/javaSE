package 内部类_外部类.Inner;
/**
 内部类  --了解
 类中定义类
 当类中的成员也是一种事物的时候
 人-->心脏     汽车-->发动机
 成员内部类
 局部内部类
 私有内部类
 静态内部类
 匿名内部类***
 lambda表达式
 成员内部类:
 一个类定义在另一个类成员位置,就是它的成员内部类
 成员: 定义在类中方法外部
 就拥有成员的特性 : 成员修饰符 public private protected default static final
 也拥有类的特性
 组成:
 只能定义成员,不能定义静态,除了静态的常量
 使用:
 在内部类中可以直接使用外部类的成员(静态,成员)包括私有
 外部类中可以通过内部类对象使用成员内部类中的内容包括私有
 其他类中使用成员内部类中的内容
 依赖于外部类对象
 外部类.内部类 引用 = new 外部类().new 内部类();
 */
public class OuterExample01 {
    private  int i=100;//成员变量
    private  static int z=20;//静态变量

   //成员内部类
    class Inner{
        //内部类的成员变量
       private int x=10;
       static final  double y=3.14;//内部类的静态变量
       //内部类的成员方法
       void inner(){
           System.out.println("我是内部类的成员方法");
           System.out.println(i);//内部类的成员方法可以访问外部类的成员变量
           System.out.println(z);//可以访问外部类的静态变量
       }

   }
   //外部的成员方法
    public void outer(){
        System.out.println("我是外部类的成员方法");
        Inner in=new Inner();
        System.out.println(in.x);//外部类的成员方法需要调用内部类的成员变量时，使用内部类的对象.成员变量
        System.out.println(Inner.y);//外部类的成员方法调用内部类的静态变量用内部类名.变量名
        in.inner();//内部类对象.方法名
    }


}
