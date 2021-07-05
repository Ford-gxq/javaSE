package A_Java复习练习;
/**
        String类--->常见构造方法:
 String四个常用构造：空参--char数组--源头和直赋
            public String() : 创建一个空白字符串对象，不含有任何内容
            public String(char[] chs) : 根据字符数组的内容，来创建字符串对象
            public String(String original) : 根据传入的字符串内容，来创建字符串对象
            String s = “abc”;  直接赋值的方式创建字符串对象，内容就是abc
         注意:
                String这个类比较特殊, 打印其对象名的时候, 不会出现内存地址
                而是该对象所记录的真实内容.-->底层重写toString()方法
                面向对象-继承, Object类
 6个常用构造方法：
    第一个：String s = new String("");
 *  第二个：String s = ""; 最常用
 *  第三个：String s = new String(char数组);
 *  第四个：String s = new String(char数组,起始下标,长度);
 *  第五个：String s = new String(byte数组);
 *  第六个：String s = new String(byte数组,起始下标,长度)
     */
public class StringDemo1 {
    public static void main(String[] args) {
        String str=new String();//创建一个空白字符串对象，不含有任何内容
        str="zhangsan";
        System.out.println(str);
        String str1=new String(new char[]{'a','b','c','d'});
        System.out.println(str1);
        String str2=new String("zhangsanhahahaha");
        System.out.println(str2);
//        **直接赋值方式创建**
//​	以""方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，
// JVM 都只会建立一个 String 对象，并在字符串池中维护
        String str4="lisisi";
        System.out.println(str4);
        String str5=new String(new byte[]{1,2,3,4,5});
        System.out.println(str5);

    }


}
