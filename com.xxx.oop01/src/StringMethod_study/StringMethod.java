package StringMethod_study;

import java.io.UnsupportedEncodingException;

/**
 常用类:
        String 不可变长的字符序列
        String类表示字符串。 Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例。
 API类型学习:
        1.类的作用
        2.类 的继承实现体系
        3.类的构造器
        4.方法
 */
public class StringMethod {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //String​(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组构造新的String
        String str="";//String类表示字符串。 Java程序中的所有字符串文字（例如"abc" ）都实现为此类的实例。
        //2.空构造
        String  str1=new String();
        System.out.println(str1);

     //3.String(String original) 初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。
     String str2=new String("abcdef");
        System.out.println(str2);

     //4.String(char[] value) --->分配新的 String ，使其表示当前包含在字符数组参数中的字符序列。
       String  str3=new String(new char[]{'h','i','j','k','l'});
        System.out.println(str3);

    //5. String(char[] value, int offset, int count)-->分配一个新的 String ，其中包含字符数组参数的子数组中的字符
        String str4=new String(new char[] {'1','2','3','4','5'},1,4);
        System.out.println(str4);

    //6.String(byte[] bytes)-->通过使用平台的默认字符集解码指定的字节数组构造新的String
    // String(byte[] bytes, String charsetName)-->构造一个新的String由指定用指定的字节的数组解码charset
       byte [] bytes="今天心情很好".getBytes("utf-8");
        System.out.println(bytes.length);
        String str5=new String(bytes,"utf-8");
        System.out.println(str5);

      //utf-8下一个汉字占3字节，GBK下一个汉字占2字节
      //7.String(byte[] bytes, int offset, int length)
     //String(byte[] bytes, int offset, int length, String charsetName)
     String tr6=new String(bytes,6,6);
        System.out.println(tr6);
        String tr7=new String(bytes,3,6,"utf-8");
        System.out.println(tr7);

    }

}
