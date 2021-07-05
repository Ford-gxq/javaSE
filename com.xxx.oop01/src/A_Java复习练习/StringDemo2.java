package A_Java复习练习;

import org.w3c.dom.ls.LSOutput;

/**
 *比较基本数据类型：比较的是具体的值
 *比较引用数据类型：比较的是对象地址值
 *
 * String类常用的比较的方法 :  public boolean equals(String s)     比较两个字符串内容是否相同、区分大小写**
 * */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1="ABC";
        String s2="abc";
        String s3="abc";
// equals : 比较字符串内容, 区分大小写
        System.out.println(s1.equals(s2));//false
        System.out.println(s2.equals(s3));//true
        // equalsIgnoreCase : 比较字符串内容, 忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));

    }

}
