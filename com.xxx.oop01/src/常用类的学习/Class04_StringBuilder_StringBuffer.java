package 常用类的学习;
/**
    String 不可变长字符序列
    StringBuilder 可变长字符序列,线程不安全|不同步,相对效率较高
    StringBuffer  可变长字符序列,线程安全|同步,相对效率较低
    扩容机制: 原容量的2倍+2    int newCapacity = (oldCapacity << 1) + 2;
    效率: StringBuilder>StringBuffer>String
 */
public class Class04_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        //初始容量为16个字符。
        StringBuilder sb  = new StringBuilder();
        //StringBuilder append(String str) 将指定的字符串追加到此字符序列。
        sb.append("ha");
        sb.append(123);
        sb.append(false);

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(123456);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(1);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //StringBuilder delete(int start, int end) 删除此序列的子字符串中的字符  结束索引不包含
        sb.delete(2,4);
        System.out.println(sb);

        //StringBuilder insert​(int offset, String str) 将字符串插入此字符序列。
        sb.insert(8,"hei");
        System.out.println(sb);

        //StringBuilder replace(int start, int end, String str)
        sb.replace(3,8,"true");
        System.out.println(sb);

        //StringBuilder reverse()  字符串翻转
        System.out.println(sb.reverse());

        //String 与 StringBuffer|StringBuilder转换
        //StringBuffer|StringBuilder->toString()  转为字符串
        //new String(StringBuffer|StringBuilder) 转为字符串
        //new StringBuffer|StringBuilder(String) 转为StringBuffer|StringBuilder
        System.out.println(sb.toString());

        //分析一下是否创建了对象,创建了几个对象,在哪里?
        String ss = "abc";
        String sss = new String("abc");
        /**
         *
         *
         * */
    }
}
