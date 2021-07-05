package StringMethod_study;
/**
 * StringBulider类继承于Object类，实现于可序列化接口等 -->
 *                public final class StringBuilder  extends Object
 *                   implements Serializable, Comparable<StringBuilder>, CharSequence
 *    一个可变的字符序列, StringBuilder上的主要操作是append和insert方法，它们被重载以便接受任何类型的数据。
 *
   String 不可变长字符序列
   StringBuilder 可变长字符序列,线程不安全|不同步,相对效率较高
   StringBuffer  可变长字符序列,线程安全|同步,相对效率较低
     效率: StringBuilder>StringBuffer>String
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        //StringBuilder() 其中不包含任何字符，初始容量为16个字符。
        StringBuilder Sb  = new StringBuilder();
        //内部数组的大小
        System.out.println(Sb.length());
        //字符串中字符的个数
        System.out.println(Sb.capacity());

        //StringBuilder(int capacity) 指定初始容量
        Sb=new StringBuilder(20);
        System.out.println(Sb.capacity());//打印StringBuilder对象的容量

        //StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器
         StringBuilder  sb1=new StringBuilder("abacus");
         System.out.println(sb1.capacity());
         System.out.println(sb1.length());

    }

}
