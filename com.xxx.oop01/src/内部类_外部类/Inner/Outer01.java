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
public class Outer01 {
    private int x = 100;
    private static int y = 1;

    //成员

    //成员内部类
    class Inner extends Object implements A{
        //成员变量
        private int i = 1;
        static final int I = 10;

        //内部类中的成员方法
        private void inner(){
            System.out.println("内部类中的成员方法");
            System.out.println(x);
            System.out.println(y);
            //outer();
        }
    }

    //外部类的成员 方法
    public void outer(){
        System.out.println("外部类的成员方法");
        Inner in = new Inner();
        System.out.println(in.i);
        System.out.println(Inner.I);
        in.inner();
    }
}

interface  A{}