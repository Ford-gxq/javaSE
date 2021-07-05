package 常用类的学习;

import java.util.Random;
/**
    Math 数学相关工具类
        静态工厂
 */
public class Class05_Math {
    public static void main(String[] args) {
        //static int abs(int a) 返回 int值的绝对值。
        System.out.println(Math.abs(-1.1));
        //static double ceil(double a) 向上取整 大于等于
        System.out.println(Math.ceil(1));
        System.out.println(Math.ceil(1.1));

        //static double floor(double a)  向下取整 小于等于
        System.out.println(Math.floor(-1.1));
        System.out.println(Math.floor(-2.0));

        //static long max(long a, long b) 返回两个 long值中较大的 long 。
        //static double min(double a, double b) 返回两个 double值中较小的 double 。
        System.out.println(Math.max(2,3));

        //static double random() 返回带有正号的 double值，大于或等于 0.0且小于 1.0 。
        Random ran = new Random();
        System.out.println(Math.random());  //[0.0,1.0) -->[0.0,max-min+1)+min ->[min,max]
        /**
            [min,max) 随机整数   (int)(Math.random()*(max-min)+min)
            [min,max] 随机整数   (int)(Math.random()*(max-min+1)+min)
         */
        //[1,5]
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));
        System.out.println((int)(Math.random()*(5-1+1)+1));

        //static long round​(double a) 返回与参数最接近的 long ，并将关系四舍五入为正无穷大。-->针对小数点后一位
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.45));

        //static double pow(double a, double b)
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(3,3));

        //static double sqrt(double a)
        System.out.println(Math.sqrt(2));


    }
}
