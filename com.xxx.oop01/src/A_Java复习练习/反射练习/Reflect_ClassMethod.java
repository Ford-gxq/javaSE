package A_Java复习练习.反射练习;
/**
 * 一、Class类中常见的方法：
 *      1) boolean isPrimitive() 确定指定的类对象是否表示基本类型.
 *      2) int getModifiers()--->int getModifiers() 返回此类或接口的Java语言修饰符，以整数编码的总和的int数值
 *      3) String getName()--->String getName()
 *        返回此类对象表示的实体名称（类，接口，数组类，基本类型或void），作为 String 。
 *二、通过反射操作方法
 * 1.获取方法
 *      1) 方法 getDeclaredMethod(String name, 类<?>... parameterTypes) 返回 方法对象，
 *       该对象反映此 类对象表示的类或接口的指定声明方法。
 *      2) 方法[] getDeclaredMethods() 返回一个包含 方法对象的数组，
 *       方法对象反映此 类对象表示的类或接口的所有已声明方法，包括public，protected，default（package）访问和私有方法，
 *        但不包括继承的方法。
 *      3) 方法 getMethod(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此类对象表示的类或接口的指定公共成员方法。
 *      4) 方法[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。
 *2.调用方法
 *        Object invoke(Object obj, Object... args)  调用执行方法
 *          方法的返回值: 所调用的那个方法的返回值,如果调用方法没有返回值,返回null
 *          参数:
 *              Object obj->调用当前成员方法的对象
 *              Object... args ->实参
 *
 *
 *
 * */
public class Reflect_ClassMethod {

    public static void main(String[] args) {



    }


}
