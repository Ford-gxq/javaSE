package 匿名内部类_lambda;
/**
 java8新特性:  lambda表达式
 lambda表达式 : 简化匿名内部类
 前提: 函数式接口
 函数式接口 : 只有一个必须要重写的抽象方法的接口就是函数式接口
 检测是否为函数式接口: @FunctionalInterface

 匿名内部类对象可以通过lambda结构简化
 定义结构:
 ()->{}
 () : 抽象方法的参数列表
 -> : 箭头符号  lambda符号  箭头函数
 {} : 重写的抽象方法的方法体
 */
public class LambdaExample {
    public static void main(String[] args) {
        //匿名内部类对象
//        Smoke1 s = new Smoke1(){
//            @Override
//            public void smoking1() {
//                System.out.println("这是匿名内部类对象的方法");
//            }
//        };
        //Lambda表达式1:
//        Smoke1 s1 =()->{
//            System.out.println("边吸烟边吐烟圈..");
//        } ;

        //Lambda 2： 当方法体语句只有一句的时候，前后的{}可以省略
        //Smoke s =()-> System.out.println("边吸烟边吐烟圈..");

        //Lambda 3： 参数列表中参数的数据类型可以省略
        //Smoke s =(x,y)-> System.out.println("边吸烟边吐烟圈.."+x+y);

        //Lambda 4： 参数列表中参数的个数只有一个的时候，前后的()可以省略
        //Smoke s = x -> System.out.println("边吸烟边吐哈哈笑.."+x);

        //Lambda 5： 如果抽象方法时有返回值类型的,方法体只有一个句并且是return语句,前后的{}以及return关建字可以一起省略
        Smoke1 s2 = () -> true;
        System.out.println(s2.smoking1());

    }

    }


//定义一个接口包含一个有返回值的抽象方法
@FunctionalInterface//函数是接口
 interface Smoke1{
    boolean smoking1();
 }