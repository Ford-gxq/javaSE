package 反射;

import java.lang.reflect.Modifier;

/**
 *Class中常见方法:
 *   boolean isPrimitive() 确定指定的 类对象是否表示基本类型.
 *   int getModifiers()--->int getModifiers() 返回此类或接口的Java语言修饰符，以整数编码的总和的int数值
 *   String getName()--->String getName()
 *       返回此类对象表示的实体名称（类，接口，数组类，基本类型或void），作为 String 。
 *
 *
 *
 * */
public class Reflect_ClassDemo003 {
    public static void main(String[] args) {
    //获取一个Class对象
    Class<String> cls=String.class;
    //int getModifiers()--->int getModifiers() 返回此类或接口的Java语言修饰符，以整数编码的总和的int数值
    //java.lang.reflect.Modifier下看修饰符的对应的int值
    System.out.println(cls.getModifiers());
    System.out.println(Modifier.toString(cls.getModifiers()));  //Modifier->反射包下
    /**
     * String getName()--->String getName()
      返回此类对象表示的实体名称（类，接口，数组类，基本类型或void），作为 String 。
      */
        System.out.println(cls.getName());//返回对象的包+类名 -->//java.lang.String
        System.out.println(cls.getSimpleName());//返回的是具体的类名-->//String
        //getPackage()-->
        System.out.println(cls.getPackage());//返回包名

       //类<? super T> getSuperclass()  返回父类Class对象
        System.out.println(cls.getSuperclass());

        //String getTypeName() 返回此类型名称的信息字符串。
        System.out.println(cls.getTypeName());
       //boolean isInterface()
        System.out.println(cls.isInterface());
        //getInterfaces  返回当前Class对象表示的类型所实现的接口数组
        System.out.println(cls.getInterfaces());


    }

}
