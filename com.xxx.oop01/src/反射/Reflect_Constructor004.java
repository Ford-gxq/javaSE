package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
1. 通过Class对象获取构造器  ****
        构造器<T> getConstructor(类<?>... parameterTypes) 返回一个 构造器对象，该对象反映此 类对象所表示的类的指定公共构造函数。
        构造器<?>[] getConstructors() 返回一个包含 构造器对象的数组， 构造器对象反映了此 类对象所表示的类的所有公共构造函数。
        构造器<T> getDeclaredConstructor(类<?>... parameterTypes) 返回一个构造器对象，
              该对象反映此类对象所表示的类或接口的指定构造函数。
        构造器<?>[] getDeclaredConstructors() 返回 构造器对象的数组， 构造器对象反映由此 类对象表示的类声明的所有构造函数。
2. 通过反射创建对象
        1.Class-->newInstance()  -->默认调用空构造->不推荐使用
        2.获取指定的构造器,然后在创建对象时候指定调用当前构造器为对象初始化信息
            Constructor->  T newInstance(Object... initargs)

 */
public class Reflect_Constructor004 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    //通过Class对象获取构造器的四种方式
    //获取Class对象
    Class<User>   cls=User.class;
    //方式1：获取指定公共的构造器  构造器<T> getConstructor(类<?>... parameterTypes) 返回一个 构造器对象
        Constructor<User> con  =  cls.getConstructor(String.class,int.class);
        System.out.println(con);
   //方式2：获取所有的构造器包括私有的--->获取所有的构造器
        Constructor[] cons=cls.getDeclaredConstructors();
        for (Constructor c:cons){//遍历构造器数组
            System.out.println(c);
        }
    //通过反射创建对象--->创建对象
       //1)方式一：Class-->newInstance()
       /* User user1=cls.newInstance;*/

    //2)方式二：获取指定的构造器,然后再创建对象-->Constructor->  T newInstance(Object... initargs)
     User user=con.newInstance("张三",19);
        System.out.println(user);

   //私有的内容通过反射使用时候,需要注意权限问题
   //忽略权限
     cons[0].setAccessible(true);
     User user1= (User) cons[0].newInstance("zhangsan");
      cons[0].setAccessible(false);
      System.out.println(user1);
      user1.getAge();
      user1.getName();
      user1.setAge(100);
      user1.speak();
      user1.toString();
      System.out.println(user1.getAge());


    }

}
class User{
    private String name;
    private int age;

    public User(){}
    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
   //定义一个私有的成员方法
    private   void  test(Double d){
        System.out.println("我是私有test方法");
    }

    //定义一个静态方法
    public static  void  testStatic(){

        System.out.println("我是静态的testStatic方法");
    }

    public void setAge(int age) {
        this.age = age;
    }
   public void speak(){
       System.out.println("正在说话..");
   }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    private void eating(){
        System.out.println("吃饭...");
    }

}