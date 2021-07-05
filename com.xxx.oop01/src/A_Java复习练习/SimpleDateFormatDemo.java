package A_Java复习练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat  日期格式转换类
 *      1. 构造方法：SimpleDateFormat() 构造一个 SimpleDateFormat使用默认模式和日期格式符号默认 FORMAT区域设置
 *    日期对象转成字符串(指定格式)  --->  format()
 *    字符串转日期对象  parse()
 *    2. 自定义日期格式的构造方法：
 *       SimpleDateFormat​(String pattern) 构造一个 SimpleDateFormat使用给定的模式和默认的默认日期格式符号 FORMAT区域设置
 *
 * */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
    Date date=new Date();

    //格式转换器 -->没有指定格式，按默认格式转换
        SimpleDateFormat  simple=new SimpleDateFormat();
        System.out.println(simple.format(date));//2021/5/22 下午4:44
        //字符串转日期对象  parse()
        System.out.println(simple.parse(simple.format(date)));

    //格式转换器-->自定义转换格式
//        SimpleDateFormat​(String pattern) 构造一个 SimpleDateFormat使用给定的模式和默认的默认日期格式符号 FORMAT区域设置
        SimpleDateFormat simple2=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        System.out.println(simple2.format(new Date()));//2021-05-22 周六 16:52:48
        System.out.println(simple2.parse("2021-05-22 周六 16:54:36"));


    }


}
