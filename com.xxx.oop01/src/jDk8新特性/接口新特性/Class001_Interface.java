package jDk8新特性.接口新特性;
/**
    Java8接口新增:
        1.默认方法
            方法被default关键字修饰
            只能跟随实现类对象调用
        2.静态方法
            只能跟随接口名调用,实现类对象无法调用
 */
public class Class001_Interface {
    public static void main(String[] args) {
        Demo.haha();
        //实现类对象调用接口中的默认方法
        new Impl().test();
    }
}
//包含默认方法和静态方法的接口
interface Demo{
    //默认方法
    default void test(){
        System.out.println("默认方法");
    }
    //静态方法
    static void haha(){
        System.out.println("静态方法");
    }
}
//继承了包含默认方法和静态方法的接口
class Impl implements Demo{
}