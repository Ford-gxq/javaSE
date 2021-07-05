package 反射;

import java.lang.reflect.Array;

/**
    通过反射操作数组
        1.创建数组  Array类提供了动态创建和访问Java数组的静态方法。
        2.获取值  static Object get(Object array, int index)
        3.赋值  static void set(Object array, int index, Object value)
 */
public class Reflect_Array006 {

    public static void main(String[] args) {
    //static Object newInstance​(类<?> componentType, int length)
        String[] arr = (String[]) Array.newInstance(String.class,3);

    //static void set​(Object array, int index, Object value)-->为对应的数组的某个下标赋值
        Array.set(arr,0,"李思思");

    //static Object get​(Object array, int index)
        System.out.println(Array.get(arr,0));
        Class cls=arr.getClass();
        System.out.println(cls);

        //判断他是不是数组
        System.out.println(cls.isArray());

    }



}
