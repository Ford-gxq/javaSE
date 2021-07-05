package A_Java复习练习;

import java.util.Scanner;

/**
 *键盘录入字符串
 *Scanner类 :
 * ​	next() : 遇到了空格, 就不再录入数据了 , 结束标记: 空格, tab键
 * ​	nextLine() : 可以将数据完整的接收过来 , 结束标记: 回车换行符
 * */
public class Scanner_Exercise01 {
    public static void main(String[] args) {
//    //Scanner
//        // 1. 创建Scanner对象
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入：");
//        // 2. 调用nextLine方法接收字符串
//        String str=sc.nextLine();
//        // ctrl + alt + v : 快速生成方法的返回值
/**
 * nextInt和nextLine方法配合使用的时候, nextLine方法就没有键盘录入的机会了
     建议: 今后键盘录入数据的时候, 如果是字符串和整数一起接受, 建议使用next方法接受字符串.
                       Scanner sc = new Scanner(System.in);
                       System.out.println("请输入整数:");
                       int num = sc.nextInt(); // 10 + 回车换行
                       System.out.println("请输入字符串:");
                       String s = sc.nextLine();
                       System.out.println(num);
                       System.out.println(s);
     */
     Scanner sc1=new Scanner(System.in);
        System.out.println("请输入整数：");
        int num=sc1.nextInt();
        System.out.println("请输入字符串：");
        String s=sc1.next();//此处需要注意，在字符串的键盘录入时，应该配合使用next(),
            // 如果使用nextLine()遇到enter就会结束关闭输入流
        System.out.println(num);
        System.out.println(s);
    }
}
