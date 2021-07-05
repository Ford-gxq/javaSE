package StringMethod_study;
/**
 String 不可变长字符序列
     StringBuilder 可变长字符序列,线程不安全|不同步,相对效率较高
     StringBuffer  可变长字符序列,线程安全|同步,相对效率较低
     扩容机制: 原容量的2倍+2    int newCapacity = (oldCapacity << 1) + 2;
     效率: StringBuilder>StringBuffer>String
 */
public class StringBuilder_StringBufferDemo {
    public static void main(String[] args) {
         //初始容量为16个字符。
        StringBuilder sb  = new StringBuilder();
        //StringBuilder append(String str) 将指定的字符串追加到此字符序列。
        sb.append("zhangsan");
        sb.append(123);
        sb.append(false);

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(4567);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(1);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        //StringBuilder delete(int start, int end) 删除此序列的子字符串中的字符  结束索引不包含
       //删除从索引开始的位置到结束索引的位置的字符
        System.out.println(new StringBuilder("zhangsande").delete(5,8));

        //StringBuilder insert​(int offset, String str) 将字符串插入此字符序列。
        System.out.println(new StringBuilder("zhangsan").insert(5,"李四"));

       //StringBuilder replace(int start, int end, String str)
        StringBuffer sb1=new StringBuffer("http://www.baidu.com");
        System.out.println( sb1.replace(0,4,"https"));
        //StringBuilder reverse()  字符串翻转
        System.out.println(new StringBuilder("张三丰").reverse());

        //String 与 StringBuffer|StringBuilder转换

        //StringBuffer|StringBuilder->toString()  转为字符串
        StringBuffer sb2=new StringBuffer("李师师");
        System.out.println(sb2.toString());

        //new String(StringBuffer|StringBuilder) 转为字符串
        String str=new String(new StringBuilder("张三的zhangsanlisi李四"));
        System.out.println(str.substring(3,15));
        //new StringBuffer|StringBuilder(String) 转为StringBuffer|StringBuilder
        StringBuffer sb3=new StringBuffer("武则天");
        System.out.println(sb3);
    }
}