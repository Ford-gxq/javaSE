class HelloA {
    //无参构造
    public HelloA() {
        System.out.println("HelloA");
    }
    //构造块
    {   System.out.println("I'm A class");
    }
    //静态块
    static {
        System.out.println("static A");
    }
}
//子类
public class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }
    //构造块
    {   System.out.println("I'm B class");
    }
    //静态块
    static {
        System.out.println("static B");
    }
    //main方法
    public static void main(String[] args) {
        new HelloB( );
        System.out.println(3+'5');
    }
}
