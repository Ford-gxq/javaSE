package 反射;
/**
 1.   反射
        java的动态机制
        发生在程序运行期间的行为
        反射的源头: Class对象
           Class<T> 类类实例表示正在运行的Java应用程序中的类和接口。
 2.   注意:
        一个类在加载到内存中就存在当前类型的一个Class对象,唯一的,不变的
        Class对象包含这个类的所有内容
        反射的源头就是Class对象,通过Class对象可以操作类中的所有内容
 3.   反射的源头Class对象的获取方式:
        1.类名.class
        2.对象.getClass()
        3.Class.forName("权限定名")    权限定名: 包名.类名
 */
public class ReflectDemo002 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象
        Class<String> cls1=String.class;
        Class<Integer> cls=Integer.class;
        System.out.println(cls1);
        System.out.println(cls);
        //对象.getClass()
          Class cls2= "zhangsan".getClass();
        System.out.println(cls2);

          //Class.forName("权限定名")    权限定名: 包名.类名
        Class cls3 = Class.forName("java.lang.String");
        System.out.println(cls3);

        // 获取基本数据类型的Class对象
        System.out.println(int.class);
        System.out.println(Integer.TYPE);
        System.out.println(Double.TYPE);
        System.out.println(Integer.TYPE==int.class);
    }

}
