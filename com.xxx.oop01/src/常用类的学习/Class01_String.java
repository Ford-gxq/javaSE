package 常用类的学习;

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
public class Class01_String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.标识字符串对象
        String str = "";

        //2.空构造
        String s1 =  new String();
        System.out.println(s1);
        System.out.println(str);

        //3.String(String original) 初始化新创建的String对象，使其表示与参数相同的字符序列; 换句话说，新创建的字符串是参数字符串的副本。
        String s2 = new String("abc");
        System.out.println(s2);

        //4.String(char[] value)
        String s3 = new String(new char[]{'w','q','s','t','d'});
        System.out.println(s3);

        //5. String(char[] value, int offset, int count)
        String s4 = new String(new char[]{'w','q','s','t','d'},1,3);
        System.out.println(s4);

        //6.String(byte[] bytes)
        //String(byte[] bytes, String charsetName)
        byte[] arr = "今天天气很好".getBytes("GBK");
        System.out.println(arr.length);
        String s5 = new String(arr,"GBK");
        System.out.println(s5);

        //7.String(byte[] bytes, int offset, int length)
        //String(byte[] bytes, int offset, int length, String charsetName)
        String s6 = new String(arr,2,4,"gbk");
        System.out.println(s6);
    }
}
