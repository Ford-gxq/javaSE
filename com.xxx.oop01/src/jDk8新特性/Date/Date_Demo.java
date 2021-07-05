package jDk8新特性.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *Date  SimpleDateFormat  线程不安全的
 *     Java8中新增的时间相关的API都是线程安全的
 *     LocalTime   LocalDate  LocalDateTime  不可变的并且线程安全-->推荐使用
 *     通过now() 或者静态的of(....)方法获取对应的日期时间
 *
 * */
public class Date_Demo {

    public static void main(String[] args) {
       /* //今年
        System.out.println("今年"+ Year.now());
        System.out.println("指定年" + Year.of(2022));
        //6月
        System.out.println("月份:"+ Month.FEBRUARY);
        //今天不包含时分秒
        LocalDate today = LocalDate.now();
        System.out.println("今天:"+today);
        //此时此刻
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在:"+now);
        LocalTime time = LocalTime.now();
        System.out.println("当前时间:"+time);
        //您的生日
        LocalDate yourBirthDate = LocalDate.of(1999,12, 15);
        LocalDate yourBirthDate2 = LocalDate.of(2020, Month.FEBRUARY, 15);
        System.out.println("生日:"+yourBirthDate);
        System.out.println("生日:"+yourBirthDate2);

        System.out.println(LocalTime.of(10,20,30));
        System.out.println(LocalDateTime.of(1006,2,20,10,20,30));

        //日期时间相+-  提供了系列的plus..()的方法
        System.out.println(yourBirthDate.plusDays(5L));;

        //转换问题  parse()  format()都是日期时间提供的转换方法->指定转换器格式就可
        //日期转换器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化日期字符串
        LocalDateTime now2 = LocalDateTime.now();
        String nowStr = now2.format(formatter);  //放入格式器
        System.out.println(nowStr);

        String dateStr= "2020-02-25 11:23:04";
        //转成日期
        LocalDateTime date= LocalDateTime.parse(dateStr, formatter);//放入格式器
        System.out.println(date);

        //获取日
        System.out.println(date.getDayOfMonth());
        System.out.println(yourBirthDate.getYear());
        System.out.println(time.getHour());*/
        System.out.println("---------------------------------------------------------------------");
        //今年
        System.out.println("今年"+Year.now());
        System.out.println("指定年："+Year.of(2022));
        //6月
        System.out.println("月份"+Month.JULY);
        //今天不包含时分秒
        LocalDate today = LocalDate.now();
        System.out.println("今天:"+today);
        //此时此刻
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在:"+now);
        LocalTime time = LocalTime.now();
        System.out.println("当前时间:"+time);
        //此时此刻



    }
}
