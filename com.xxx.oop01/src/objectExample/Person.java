package objectExample;
/**
 *1.  Object 类
 *         根类
 *         java中所有类的父类
 *         所有的类都直接或者间接的继承自Object类
 *         一个类如果没有显示通过extends关键字继承某个父类,默认继承自Object
 *
 * 2.  toString()把对象数据以字符串的形式返回
 *         在java中打印一个引用的时候,默认打印的是调用了toString()方法以后的返回值
 *     当打印引用的时候,想要获取到每一个对象的所有成员变量的值而非地址-->toString功能可以,功能的实现不满意
 *        -->我们可以在子类中重写这个toString()方法
 *         注意:
 *             以后定义的javabean中都要重写toString()方法,打印对象的内容(成员变量的值)而非地址
 * */
public class Person {
   private String  name;
   private int age;
   private int  height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void  work(){
        System.out.println("正在工作...");

   }
}
