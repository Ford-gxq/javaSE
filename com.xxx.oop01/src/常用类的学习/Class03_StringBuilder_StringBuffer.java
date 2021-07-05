package 常用类的学习;
/**  StringBuilder是一个类
    String 不可变长字符序列
    StringBuilder 可变长字符序列,线程不安全|不同步,相对效率较高
    StringBuffer  可变长字符序列,线程安全|同步,相对效率较低
    效率: StringBuilder>StringBuffer>String
 */
public class Class03_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        //StringBuilder() 其中不包含任何字符，初始容量为16个字符。
        StringBuilder sb  = new StringBuilder();
        System.out.println(sb.capacity()); //内部数组的大小
        System.out.println(sb.length());  //字符串中字符的个数

        //StringBuilder(int capacity) 指定初始容量
        sb = new StringBuilder(100);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器。
        StringBuilder sb1  = new StringBuilder("abc");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

    }
}
