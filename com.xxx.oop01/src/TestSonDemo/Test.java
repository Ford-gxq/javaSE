package TestSonDemo;

import oopday03.Demo;
//不同包下的子类
public class Test extends Demo {
    void test(){
        System.out.println(super.testProtected);
        System.out.println(testPublic);
    }

    public static void main(String[] args) {
        Test test=new Test();
        //通过子类对象调用  通过继承关系使用,在子类中可以使用
        System.out.println(test.testPublic);
        System.out.println(test.testProtected);
        //直接访问成员的权限,没有通过继承关系,所以通过父类对象不能直接使用
        System.out.println( new Demo().testPublic);
        /** System.out.println( new Demo().testProtected);
         * **/

    }

}
//同包下的其他类
class Test01{
    public static void main(String[] args) {

        //通过子类对象调用  通过继承关系使用,但是当前所在的类是其他类不是子类,就不可以使用
        Test test=new Test();
        System.out.println(test.testPublic);
//        System.out.println(test.testProtected);   //同包下的其他类也不能访问父类的保护权限的变量

    }
}
