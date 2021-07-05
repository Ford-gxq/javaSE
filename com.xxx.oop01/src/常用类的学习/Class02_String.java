package 常用类的学习;
import java.util.Arrays;

/**
    String 常用方法
 */
public class Class02_String {
    public static void main(String[] args) {
        String  str = "haha123hehe123heihei123";
        String  str2 = "Haha123hehe123heihei123";
        //char charAt(int index) 返回指定索引处的 char值。
        System.out.println(str.charAt(3));;

        //int compareTo(String anotherString) 按字典顺序比较两个字符串。
        System.out.println(str.compareTo(str2));
        //int compareToIgnoreCase​(String str) 按字典顺序比较两个字符串，忽略大小写差异。
        System.out.println(str.compareToIgnoreCase(str2));
        //String concat​(String str) 将指定的字符串连接到此字符串的末尾。
        System.out.println(str.concat(str2));
        //boolean contains​(CharSequence s) 当且仅当此字符串包含指定的char值序列时，才返回true。
        if(str.contains("haha123")){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }

        //static String copyValueOf​(char[] data) 相当于 valueOf(char[]) 。
        System.out.println(String.copyValueOf(new char[]{'1','2','3'}));

        //boolean endsWith​(String suffix) 测试此字符串是否以指定的后缀结尾。
        //boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。
        System.out.println(str.endsWith("123"));
        System.out.println(str.startsWith("123"));

        //byte[] getBytes()
        //byte[] getBytes(String charsetName)

        //void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 将此字符串中的字符复制到目标字符数组中。
        char[] chs = new char[15];
        str.getChars(7,14,chs,1);
        System.out.println(chs);

        //int indexOf(String str) 返回指定子字符串第一次出现的字符串中的索引。
        System.out.println(str.indexOf("123"));

        //int indexOf(String str, int fromIndex)
        System.out.println(str.indexOf("123",5));

        //int lastIndexOf​(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        System.out.println(str.lastIndexOf("123"));

        String s1 = new String("zhangsan");
        String s2 = new String("zhangsan");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.intern() == s2.intern());

        //boolean isBlank()
        System.out.println("".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("    ".isBlank());
        System.out.println("abc".isBlank());

        //boolean isEmpty() 返回 true ，当且仅当， length()是 0 。
        System.out.println("".isEmpty());
        //str = null;
        //System.out.println(str.isEmpty());  //空指针异常

        //String repeat​(int count) 返回一个字符串，其值为此字符串的串联重复 count次。
        System.out.println("你好".repeat(3));

        //String replace​(CharSequence target, CharSequence replacement)
        System.out.println(str.replace("haha","HAHA"));

        //String[] split(String regex) 分隔
        String str3 = "name=zhangsan&pwd=123";
        System.out.println(Arrays.toString(str3.split("&")));

        //以下三个可以去除全角半角空格  -->jdk11新增
        //String strip() 返回一个字符串，其值为此字符串，并删除了所有前导和尾随 white space 。
        //String stripLeading() 返回一个字符串，其值为此字符串，并删除了所有前导 white space 。
        //String stripTrailing() 返回一个字符串，其值为此字符串，并删除所有尾随 white space 。

        //String trim() 返回一个字符串，其值为此字符串，删除了所有前导和尾随空格，只针对于半角空格
        System.out.println(" 123    ");
        System.out.println(" 123    ".trim());
        System.out.println("　123    ".trim());
        System.out.println("　123    ".strip());
        System.out.println("　123    ".stripLeading());

        //String substring(int beginIndex) 返回一个字符串，该字符串是此字符串的子字符串。
        //String substring(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,7)); //结束索引不包含

        //char[] toCharArray() 转为字符数组
        System.out.println(str.toCharArray());

        //String toLowerCase() 转小写
        //String toUpperCase() 转大写
        System.out.println(str.toUpperCase());

        //static String valueOf(int i)
        System.out.println(String.valueOf(123));

    }
}
