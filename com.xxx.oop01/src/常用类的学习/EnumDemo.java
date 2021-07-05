package 常用类的学习;

import java.util.Arrays;

/**
 * 枚举类型的定义包括枚举声明和枚举体:  ---> 枚举体就是放置一些常量
 *    enum  枚举名 {
 *          枚举体（常量列表）
 *      }
 *  eg:
 *      enum Season {
 * 	       SPRING, SUMMER, AUTUMN, WINDER
 *    }
 *
 * */
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Week2.DAY1.getName());//类的静态变量的使用
        //枚举类的使用
        //获取枚举字段  通过:  枚举类名.实例名
       Week w1=Week.MON;//枚举的使用--->通过枚举名.字段即可
       System.out.println(w1);

        //枚举的 name()方法  --> 获取当前枚举字段的字段名
        System.out.println(w1.name());//枚举引用.name()即可获取枚举的字段名

        //获取枚举常量的序号的方法ordinal() --> 返回枚举常量的序号
        System.out.println(w1.ordinal());

        //values() -->返回当前枚举类型的所有实例
        System.out.println(Arrays.toString(w1.values()));
        //使用switch语句判断是星期几

        switch(w1){
            case MON:
                System.out.println("周一");
                break;
            case TUES:
                System.out.println("周二");
                break;
        }

    }


}




//  定义一个枚举来表示一周7天
enum Week{
    //定义枚举字段
    MON,TUES("星期二"),WEDNESDY,THRSDAY,FRI,Sta("星期六"),SUN("星期日");
    //枚举的成员变量
    private  String name;
    //空构造
    Week() { }

    //含参构造
    Week(String name) {
        this.name = name;
    }
   //Set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写toString 方法

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }

}
//定义一个枚举表示四季
 enum  Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}


//定义一个星期的类
class Week2 {
    public static final  Week2 DAY1=new Week2("星期一");
    public static final  Week2 DAY2=new Week2("星期二");
    //成员变量
    private String  name;

    //含参构造
    public Week2(String name) {
        this.name = name;
    }
  //set和get方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}