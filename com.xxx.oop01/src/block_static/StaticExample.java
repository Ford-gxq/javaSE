package block_static;

public class StaticExample {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.show();
        b.show();
    }
}
class A{
    //静态方法
    public static void show(){
        System.out.println(" Static Method of A");
    }
}
class B extends A{

    public static void show(int a){
        System.out.println("这是一个重写的静态方法" );
    }
    public static void show(){
        System.out.println("Static Method of B");

    }
}