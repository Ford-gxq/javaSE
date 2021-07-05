package 反射;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
    通过反射操作属性|字段
        1.获取属性
            字段 getDeclaredField(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。
            字段[] getDeclaredFields() 返回 字段对象的数组，字段对象反映由此类对象表示的类或接口声明的所有字段。
            字段 getField(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段。
            字段[] getFields() 返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。
        2.使用属性
            设置值  void set(Object obj, Object value)
            获取值  Object get(Object obj) 返回指定对象上此 字段表示的字段的值。

 */
public class Reflect_FiledDemo005 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //1.获取User的Class对象
        Class<User> cls=User.class;
        User  user=cls.newInstance();

        //2.获取字段
        Field field=cls.getDeclaredField("name");
        Field field1=cls.getDeclaredField("age");

        //3.为字段设置值
        //忽略权限
        field.setAccessible(true);
        field.set(user,"zhangsan");
        System.out.println(user);
        field1.setAccessible(true);
        field1.set(user,28);
        System.out.println(user);

        //4.获取字段值
        System.out.println(field.get(user));
        //String getName()
        System.out.println(field.getName());
        System.out.println(field.getType());
        System.out.println(Modifier.toString(field.getModifiers()));
    }


}
