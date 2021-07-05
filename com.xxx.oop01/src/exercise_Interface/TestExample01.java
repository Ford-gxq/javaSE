package exercise_Interface;

/**
 *  1.按如下要求编写Java程序：
 * （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
 * （2）定义接口B，里面包含抽象方法void setColor(String c)。
 * （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
 * （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
 * 圆柱体的高height、颜色color。
 * （5）创建主类来测试类Cylinder

 * */
//定义接口A
interface A{
    public static double PI=3.14;
    public abstract double area();

}
//定义接口B
interface B{
    public abstract void setColor(String c);

}
//定义接口C
interface C extends A,B{
    public abstract void volume();

}
//定义圆柱体类
class Cylinder implements C{
    private double radius;
    private double height;
    private String color;

//构造函数
    public Cylinder(double radius,double height,String color){
        this.radius=radius;
        this.height=height;
        this.color=color;

    }
//重写接口A的抽象方法
    @Override
    public double area(){
        System.out.println(PI);
        return PI*radius*radius;

    }
//重写接口B的抽象方法
    @Override
    public void setColor(String c){
        System.out.println(c);

    }
//重写接口C的抽象方法
    public void volume(){
        System.out.println("圆柱体的体积："+area()*height);
    }

}
//测试类
public class TestExample01{
    public static void main(String[] args) {
        Cylinder a=new Cylinder(1,2,"red");
        a.area();
        a.setColor("red");
        a.volume();
    }

}
