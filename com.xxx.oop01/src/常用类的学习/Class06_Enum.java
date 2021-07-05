package 常用类的学习;

import java.util.Arrays;

/**
    enum 枚举
        表示一种事物的所有可能,所有情况
        更多的是提供一种标识
        枚举也是类,使用enum关键字定义枚举类
        通过enum关键字定义的枚举类型,隐式的继承自java.lang.Enum
        枚举类中的字段-->作为当前枚举类型的一个实例存在,默认相当于被public static final修饰
        枚举类中的构造器,默认私有
 */
public class Class06_Enum {
    public static void main(String[] args) {
        System.out.println(Week1.DAY1.getName());
        //枚举类的使用
        //获取枚举字段  通过:  枚举类名.实例名
        WeekDay day = WeekDay.MON;
        System.out.println(day);

        //name()  --> 获取当前枚举字段的字段名
        System.out.println(day.name());
        //ordinal() --> 返回枚举常量的序号
        System.out.println(day.ordinal());
        //values() -->返回当前枚举类型的所有实例
        System.out.println(Arrays.toString(day.values()));

        day.setName("星期一");
        System.out.println(day.getName());

        //switch判断
        switch(day){
            case MON:
                System.out.println("周一");
                break;
            case TUES:
                System.out.println("周二");
                break;
        }
    }
}

//一周7天,一周中的每一天
enum WeekDay{
    //枚举字段
    MON,TUES("星期二"),SUN("星期天");
   static  String  countDay;
    //枚举的成员变量
    private String name;
   //空构造
    private WeekDay(){}
    //含参构造
    private WeekDay(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

//定义一个星期类
class Week1{
    public static final Week1 DAY1 = new Week1("周一");  //周一
    public static final Week1 DAY2 = new Week1("周二");  //周二

    private String name;

    public Week1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

