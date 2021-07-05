package 常用类_练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
    SimpleDateFormat  日期格式转换类
        日期对象转字符串(指定格式)  format()
        字符串转日期对象  parse()
 */
public class Class08_SimpleDateFormat {

    public static void main(String[] args) throws ParseException {
        //当前日期对象
        Date date = new Date();

        //格式转换器 -->默认格式
        SimpleDateFormat simple = new SimpleDateFormat();
        System.out.println(simple.format(date));

        System.out.println(simple.parse(simple.format(date)));

        //格式转换器-->自定义转换格式
        SimpleDateFormat simple2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS SSS E");
        System.out.println(simple2.format(date));
        //System.out.println(simple2.parse("2022-12-13 11:13:45 457"));
    }
}
