package ExceptionDemo;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *        异常  Exception
 *
 *        Throwable
 *        /        \
 *       Error     Exception
 *       Error : 一般指由虚拟机产生并脱出的错误,不由程序猿控制
 *       Exception : 异常
 *         RuntimeException:运行时异常 : 发生在程序运行期间
 *             一般增强程序的健壮性
 *         CheckedException:编译时异常|检查时异常 : 发生在程序编译期间
 *             处理异常的方案:
 *                         异常抛出
 *                         异常捕获
 *      常见的运行时异常:
 *         1.NullPointerException 空指针异常
 *             引用没有正确指向对象,指向为null,然后通过引用调用成员会遇到空指针异常
 *         2.ArrayIndexOutOfBoundsException 数组越界异常
 *             索引在[0,length-1]之外
 *         3.NegativeArraySizeException 数组长度负数异常
 *         4.ArithmeticException 数学异常
 *         5.ClassCastException 类型转换异常
 *         6.NumberFormatException 数学格式异常
 *
 *  */
public class Example01 {
    public static void main(String[] args) {
        //健壮性
     String  str=null;
     if (str!=null){   //此处会出现运行异常，可以通过条件判断来增强代码的健壮性
       str.length();
     }
        //数组越界
      int [] arr=new int[4];
       arr[4]=10;  //此处会抛出数组越界异常

      //类型转换异常
        String s = "123abc";
        int i = Integer.valueOf(s);
        System.out.println(i);

        //编译时异常
        //InputStream in=new FileInputStream("D:\\README");

    }


}
