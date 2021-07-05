package A_Java复习练习;
/**  StringBuilder 是一个可变的字符串类，StringBuilder 对象中的内容是可变的
 *1. StringBuffer类的构造方法：
 *         public StringBuilder()创建一个空白可变字符串对象，不含有任何内容；初始容量为16个字符。
 *         public StringBuilder(String   str)根据字符串的内容，来创建可变字符串对象
 *         StringBuffer​(int capacity) 构造一个字符串缓冲区，其中没有字符和指定的初始容量。
 *         StringBuffer​(CharSequence seq) 构造一个字符串缓冲区，其中包含与指定的 CharSequence相同的字符。
 *2. StringBuffer的常用方法：
 *      1) StringBuilder append(String str) 将指定的字符串追加到此字符序列。
 *      2) StringBuilder delete(int start, int end) 删除此序列的子字符串中的字符,结束索引不包含
 *      3) StringBuilder insert​(int offset, String str) 将字符串插入此字符序列。
 *      4) StringBuilder replace(int start, int end, String str)
 *      5) StringBuilder reverse()  字符串翻转
 *      6) String 与 StringBuffer|StringBuilder转换:
 *         StringBuffer|StringBuilder->toString()  转为字符串
 *         new String(StringBuffer|StringBuilder) 转为字符串
 *         new StringBuffer|StringBuilder(String) 转为StringBuffer|StringBuilder
 *3.      String 不可变长字符序列
 *        StringBuilder 可变长字符序列,线程不安全|不同步,相对效率较高
 *        StringBuffer  可变长字符序列, 线程安全|同步,相对效率较低
 *        扩容机制: 原容量的2倍+2    int newCapacity = (oldCapacity << 1) + 2;
 *        效率: StringBuilder>StringBuffer>String
 *
 * */
public class StringBufferDemo4 {

    public static void main(String[] args) {
        //1. public StringBuilder()创建一个空白可变字符串对象，不含有任何内容；初始容量为16个字符。
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.length()); //内部数组的大小 -->0
        System.out.println(sb.capacity());//初始容量为16个字符 -->16
        //2. StringBuilder(int capacity) 指定初始容量的构造方法
        sb=new StringBuffer(20);
        System.out.println(sb.capacity());
        //3. StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器
        StringBuffer sb1=new StringBuffer("zhangsandehahaha");
        /*源码：
        *  @HotSpotIntrinsicCandidate
           public StringBuilder(String str) {
                super(str.length() + 16);
                append(str);
               }
        *
        * */

        System.out.println(sb1.capacity());  //字符串的长度+StringBuffer的容量
        System.out.println(sb1.length());    //内部数组的长度-->16个字符长度
       /**------------------------------------------常用方法--------------------------------------------------*/
        //1) StringBuilder append(String str) 将指定的字符串追加到此字符序列。
        //初始容量为16个字符。
        StringBuilder sb2  = new StringBuilder();
        sb2.append("张三");//append(String str)
        sb2.append(11);//添加int类型数据
        sb2.append('a');//添加char类型
        sb2.append(10.1);//浮点数
        sb2.append(false);//添加布尔
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        //2) StringBuilder delete(int start, int end) 删除此序列的子字符串中的字符  结束索引不包含
        //删除从索引开始的位置到结束索引的位置的字符
        System.out.println(new StringBuilder("zhangsande").delete(5,8));

        //3) StringBuilder insert​(int offset, String str) 将字符串插入此字符序列。
        System.out.println(new StringBuilder("zhangsan").insert(5,"李四"));

        //4) StringBuilder replace(int start, int end, String str)
        StringBuffer sb3=new StringBuffer("http://www.baidu.com");
        System.out.println( sb3.replace(0,4,"https"));
        //5) StringBuilder reverse()  字符串翻转
        System.out.println(new StringBuilder("张三丰").reverse());

        //6) String 与 StringBuffer|StringBuilder转换

        //StringBuffer|StringBuilder->toString()  转为字符串
        StringBuffer sb4=new StringBuffer("李师师");
        System.out.println(sb4.toString());

        //new String(StringBuffer|StringBuilder) 转为字符串
        String str=new String(new StringBuilder("张三的zhangsanlisi李四"));
        System.out.println(str.substring(3,15));
        //new StringBuffer|StringBuilder(String) 转为StringBuffer|StringBuilder
        StringBuffer sb5=new StringBuffer("武则天");
        System.out.println(sb5);


    }
}
