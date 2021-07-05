package A_Java复习练习;

import java.util.Date;

/**Date日期类型：
 * 构造方法：
 *   Date(long date) 分配 Date对象并初始化它以表示自标准基准时间（称为“纪元”）以来的指定毫秒数，即1970年1月1日00:00:00 GMT。
*    Date() 分配 Date对象并对其进行初始化，使其表示分配时间，测量 Date到毫秒。
 * 常用方法：
 *     boolean after​(Date when) 测试此日期是否在指定日期之后。
 *     boolean before​(Date when) 测试此日期是否在指定日期之前。
 *
* */
public class DateDemo {
    public static void main(String[] args) {
     Date date=new Date();
     System.out.println(date);//Sat May 22 16:20:09 CST 2021
   //Date(long date) 分配 Date对象并初始化它以表示自标准基准时间（称为“纪元”）以来的指定毫秒数，即1970年1月1日00:00:00 GMT。
    Date date1=new Date(1234567891012L);
    System.out.println(date1);
 //long getTime() 返回自此 Date对象表示的1970年1月1日00:00:00 GMT以来的毫秒数。
 System.out.println(date.getTime());
 //boolean after​(Date when) 测试此日期是否在指定日期之后。
 //boolean before​(Date when) 测试此日期是否在指定日期之前。
   System.out.println(date1.after(date)); //false
   System.out.println(new Date().after(date));

    }


}
