package 内部类_外部类.Inner;
/**
    静态内部类
        定义静态内容,可以定义成员内容
        在静态内部类中可以使用外部类中包括私有的内容,但是不能直接使用非静态的成员,需要通过外部类的对象调用
        外部类中可以直接跟随内部类对象使用内部类中的成员

        其他类中使用静态内部类中的内容:
 */
public class Outer02 {
    private int x = 1;
    private static int y = 2;

    //静态内部类
    static class Inner{
        //成员
        int a = 10;
        static int  b = 20;
       //成员方法
        public void test(){
            System.out.println("成员方法");
            System.out.println(a);
            System.out.println(b);
            //因为类是静态的
            System.out.println(new Outer02().x);
            System.out.println(y);
        }

        public static void testStatic(){
            System.out.println("静态 方法");
            Inner in = new Inner();
            System.out.println(in.a);
            System.out.println(b);

            System.out.println(y);
            System.out.println(new Outer02().x);
        }
    }

    //外部类成员方法
    void outer(){
        System.out.println("外部类成员方法");
        System.out.println(Inner.b);
        Inner.testStatic();

        Inner in = new Inner();
        System.out.println(in.a);
        in.test();
    }
}
