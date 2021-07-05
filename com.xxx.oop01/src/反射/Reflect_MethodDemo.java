package 反射;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
通过反射操作方法
        1.获取方法
            1) 方法 getDeclaredMethod(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定声明方法。
            2) 方法[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映此 类对象表示的类或接口的所有已声明方法，
                  包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
            3) 方法 getMethod(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
            4) 方法[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。
        2.调用方法
            Object invoke(Object obj, Object... args)  调用执行方法
                方法的返回值: 所调用的那个方法的返回值,如果调用方法没有返回值,返回null
                参数:
                    Object obj->调用当前成员方法的对象
                    Object... args ->实参
 */
public class Reflect_MethodDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取User的Class类对象
        Class<User> cls=User.class;//此处获得一个User的class类对象
        //通过类对象获取一个构造器，然后创建一个User对象
        User user=cls.getDeclaredConstructor(String.class,int.class).newInstance("张三",18);
        Method [] arr=cls.getDeclaredMethods();
        for ( Method  m: arr){
            System.out.println(m);
        }

        //利用类对象--->获取方法
        Method[] methods=cls.getMethods();
        for (Method ms: methods){  //遍历方法数组
            System.out.println(ms);
        }
        //调用方法
        System.out.println(methods[0].invoke(user));

        /**获取私有方法-->类对象.getDeclaredMethod(参数1，参数2);参数1方法名，参数2方法的参数类型的对象*/
          Method m= cls.getDeclaredMethod("test",Double.class);
        System.out.println(m);

        //获取静态方法
        Method m1=cls.getDeclaredMethod("testStatic");

        //私有的方法调用 忽略权限
        m.setAccessible(true);
        System.out.println(m.invoke(user,10.1));

        //静态方法可以通过类对象调用 | 类调用  第一个参数: 指定对象|静态方法null
        m1.invoke(null);
        user.testStatic();
        System.out.println(m1.getParameterCount());


    }

}
