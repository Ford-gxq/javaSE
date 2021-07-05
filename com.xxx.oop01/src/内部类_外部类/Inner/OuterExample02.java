package 内部类_外部类.Inner;
/**
 静态内部类
 定义静态内容,可以定义成员内容
 在静态内部类中可以使用外部类中包括私有的内容,但是不能直接使用非静态的成员,需要通过外部类的对象调用
 外部类中可以直接跟随内部类对象使用内部类中的成员

 其他类中使用静态内部类中的内容:
 */
public class OuterExample02 {
    private  int x=10;
    private  static int  y=20;

    //静态内部类
    static class Inner{
        //成员变量
        private int a=5;
        static  int b=6;//静态变量

        //静态内部类的成员方法
          public  void test(){
          System.out.println("我是静态内部类的成员方法");
          System.out.println(a);//可以访问自身的成员变量
          System.out.println(Inner.b);//可以通过静态内部类.静态变量名
              //因为类是静态的
          System.out.println(new OuterExample02().x);
          System.out.println(y);
      }

      //静态内部类的静态方法
      public static void testStatic(){
          System.out.println("我是静态内部类的静态方法");
          //内部类的静态方法中访问静态内部类的的成员变量--->通过外部类.内部类 引用名 =new 外部类.内部类();
          //引用名.成员变量名
          OuterExample02.Inner in = new OuterExample02.Inner();
          System.out.println(in.a);
          System.out.println(b);//静态内部类的静态方法访问静态内部类的静态变量可以直接使用，也可以内部类名.变量名
          System.out.println(y);//可以直接访问外部类的静态变量
          System.out.println(new OuterExample02().x);//使用外部类的对象调用外部类的成员变量
      }

    }
    //外部类成员方法
    void outer(){
        System.out.println("我是外部类成员方法");
        System.out.println(Inner.b);//外部类的成员方法中使用静态内部类的成员变量，可以直接
        //外部类成员方法中使用静态内部类的静态方法，外部类.内部类.内部类的静态方法
        OuterExample02.Inner.testStatic();
        //外部类成员方法中调用静态内部类的成员变量和成员方法，使用静态内部类对象调用
        Inner in = new Inner();
        System.out.println(in.a);
        in.test();
    }
}
