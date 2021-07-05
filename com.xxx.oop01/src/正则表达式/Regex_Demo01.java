package 正则表达式;

import java.util.Arrays;

/**
    正则表达式是用来描述具有一定特征的字符串的特殊字符串。Regular Expression。
    作用:
        验证、查找、替换、分割 。
 */
public class Regex_Demo01 {
    public static void main(String[] args) {
        String str = "fasd1llkhj4ljlkjkl5jkljlk2ljlk";

        //根据数字分隔
        String[] arr = str.split("\\d");
        Arrays.stream(arr).forEach(System.out::println);

    }
}
