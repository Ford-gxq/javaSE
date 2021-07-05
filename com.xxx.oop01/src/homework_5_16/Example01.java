package homework_5_16;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Math.random() 方法用于返回一个随机数; 随机数范围为 0.0 =< Math.random < 1.0
 *  java.lang.Object
 *    --java.text.Format
 *     ---java.text.NumberFormat
 *       ---java.text.DecimalFormat (DecimalFormat类继承于text.NumberFormat-->text.Format -->lang.Object)
 * 构造方法： DecimalFormat​(String pattern) 使用给定模式和默认 FORMAT语言环境的符号创建DecimalFormat。
 * */
public class Example01 {
    public static void main(String[] args) {
        double d = Math.random()*100;//1.生成一个100以内的随机数
//        System.out.println(d);
        DecimalFormat df = new DecimalFormat("0.00");//给定保留两位小数的形式
        String str = df.format(d);
        System.out.println(str);
  //2. java.util.Date  -->new一个日期类对象 --->格式转换器-->自定义转换格式SimpleDateFormat
    Date date=new Date();
//    System.out.println(date);
    SimpleDateFormat simple2 = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(simple2.format(date));


    }

}
