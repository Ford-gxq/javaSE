package A_Java复习练习;

/**
 * String的常用方法：
 * 1（掌握）.char charAt(int index)
 * 2（了解）.int compareTo(String anotherString)字符串之间比较大小不能直接使用 > < ，需要使用compareTo方法。
 *    返回值是-1,0，1
 * 3（掌握）.boolean contains(CharSequence s) 判断前面的字符串中是否包含后面的子字符串。
 * 4（掌握）. boolean endsWith(String suffix) 判断当前字符串是否以某个子字符串结尾。
 * 5（掌握）.boolean equals(Object anObject)
 * 比较两个字符串必须使用equals方法，不能使用“==”
 * equals方法有没有调用compareTo方法？ 老版本可以看一下。JDK13中并没有调用compareTo()方法。
 * equals只能看出相等不相等。
 * compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
 * 6（掌握）.boolean equalsIgnoreCase(String anotherString)判断两个字符串是否相等，并且同时忽略大小写。
 * 7（掌握）.byte[] getBytes() 将字符串对象转换成字节数组
 * 8（掌握）.int indexOf(String str) 判断某个子字符串在当前字符串中第一次出现处的索引（下标）。
 * 9（掌握）.boolean isEmpty()判断某个字符串是否为“空字符串”。底层源代码调用的应该是字符串的length()方法。tring s = "";
 *10（掌握）. int length()
 *    面试题：判断数组长度和判断字符串长度不一样
 *   判断数组长度是length属性，判断字符串长度是length()方法。
 *11（掌握）.int lastIndexOf(String str) 判断某个子字符串在当前字符串中最后一次出现的索引（下标）
 *12（掌握）. String replace(CharSequence target, CharSequence replacement) String的父接口就是：CharSequence
 *13（掌握）.String[] split(String regex) 拆分字符串
 *14（掌握）、boolean startsWith(String prefix) 判断某个字符串是否以某个子字符串开始。
 *15（掌握）、 String substring(int beginIndex) 参数是起始下标。截取字符串
 *16（掌握）、String substring(int beginIndex, int endIndex) beginIndex起始位置（包括） endIndex结束位置（不包括）
 *17(掌握)、char[] toCharArray() 将字符串转换成char数组
 *18（掌握）、String toLowerCase() 转换为小写。
 *19（掌握）、String toUpperCase();
 *20（掌握）. String trim(); 去除字符串前后空白
 *21（掌握）. String中只有一个方法是静态的，不需要new对象这个方法叫做valueOf；作用： 将“非字符串”转换成“字符串”
 *
 * */
public class StringDemo3 {
    public static void main(String[] args) {
        // String类当中常用方法。
        //1（掌握）.char charAt(int index)
        char ch = "我是中国人".charAt(2);
        System.out.println(ch);
        // 2（了解）.int compareTo(String anotherString)
        // 字符串之间比较大小不能直接使用 > < ，需要使用compareTo方法。
        int result = "abc".compareTo("abc");
        System.out.println(result);//相等返回0
        int res = "abcdf".compareTo("abcde");
        System.out.println(res);//大于返回正数
        int res2 = "abcde".compareTo("abcdfg");
        System.out.println(res2);//小于返回-1
        // 3（掌握）.boolean contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串。
        System.out.println("zhangsan".endsWith("san"));//返回true
        System.out.println("test.txt".endsWith(".java"));//返回false
        // 5（掌握）.boolean equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用“==”
        // equals方法有没有调用compareTo方法？ 老版本可以看一下。JDK13中并没有调用compareTo()方法。
        // equals只能看出相等不相等。
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        System.out.println("zhangsan ".equals("zhangsan"));//false
        // 6（掌握）.boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("English".equalsIgnoreCase("english"));//忽略大小写返回true
        // 7（掌握）.byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] bytes = "zhangsanhaha".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        // 8（掌握）.int indexOf(String str)--->判断子串在当前字符串中出现的首次索引
        // 判断某个子字符串在当前字符串中第一次出现处的索引（下标）。
        System.out.println("zhongguo".indexOf("on"));//首次出现的索引为2
        // 9（掌握）.boolean isEmpty()
        // 判断某个字符串是否为“空字符串”。底层源代码调用的应该是字符串的length()方法。
        //String s = "";
        System.out.println("".isEmpty());
        // 10（掌握）. int length()
        System.out.println("abc".length()); // 3
        // 11（掌握）.int lastIndexOf(String str) 判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("zhangsanhahaha".lastIndexOf("haha"));
        //12（掌握）. String replace(CharSequence target, CharSequence replacement)替换。
        String newString = "http://www.baidu.com".replace("http://", "https://");
        System.out.println(newString);
        String news = "name=zhangsan&pwd=1234".replace("=", "&");
        System.out.println(news);
        // 13（掌握）.String[] split(String regex) 拆分字符串
        String[] ymd = "1992-12-28".split("-");  //得到的是一个数组
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }
        // 14（掌握）、boolean startsWith(String prefix) 判断某个字符串是否以某个前缀字符串开始。
        System.out.println("http://taobao.com".startsWith("http://"));
        // 15（掌握）、 String substring(int beginIndex) 参数是起始下标。截取字符串
        System.out.println("http://taobao.com".substring(14));
        //16（掌握）、String substring(int beginIndex, int endIndex)
        // beginIndex起始位置（包括）
        // endIndex结束位置（不包括）
        // 17(掌握)、char[] toCharArray() 将字符串转换成char数组
        char[] chars="我是中国人".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
        // 18（掌握）、String toLowerCase()转换为小写。
        System.out.println("zhangSAN".toLowerCase());
        // 19（掌握）、String toUpperCase();

        System.out.println("zhnagsan".toUpperCase());

        // 20（掌握）. String trim();
        System.out.println("   zhangsan".trim());

        // 21（掌握）. String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf 作用：将“非字符串”转换成“字符串”
        String s1 = String.valueOf(new char[]{'a','b','c'});
        System.out.println(s1);

    }
}
