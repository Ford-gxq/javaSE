package 常用类_练习;

import java.util.Date;

/**
    Date 日期类型
 */
public class Class07_Date {

    public static void main(String[] args) {
        //Date()
        Date date = new Date();
        System.out.println(date);

        //Date(long date) 分配 Date对象并初始化它以表示自标准基准时间（称为“纪元”）以来的指定毫秒数，即1970年1月1日00:00:00 GMT。
        Date date2 = new Date(124798327489729L);
        System.out.println(date2);

        //long getTime() 返回自此 Date对象表示的1970年1月1日00:00:00 GMT以来的毫秒数。
        System.out.println(date.getTime());

        //boolean after​(Date when) 测试此日期是否在指定日期之后。
        //boolean before​(Date when) 测试此日期是否在指定日期之前。
        System.out.println(date2.after(date)); //true
        System.out.println(date2.before(date)); //false
    }
}
