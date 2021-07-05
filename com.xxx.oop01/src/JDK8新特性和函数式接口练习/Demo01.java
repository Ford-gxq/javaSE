package JDK8新特性和函数式接口练习;
/**
 * Java8接口新增:
        1.默认方法
        方法被default关键字修饰
        只能跟随实现类对象调用
        2.静态方法
        只能跟随接口名调用,实现类对象无法调用
 */
public class Demo01 {
    public static void main(String[] args) {
        //接口中的静态方法可以直接使用接口名.方法名调用
        DemoInterface.testStatic();
        //接口中的默认方法，只能用实现类对象调用接口中的默认方法
        new Imp().testDefault();
    }


}
//包含默认方法和静态方法的接口
interface  DemoInterface{
    //默认方法
    default void testDefault(){
        System.out.println("我是接口中的默认方法");
    }
   //静态方法
    static void testStatic(){
        System.out.println("我是接口中的静态方法");
    }
}
//继承了包含默认方法和静态方法的接口的实现类
class Imp implements DemoInterface{

}
