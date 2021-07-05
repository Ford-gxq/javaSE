package 作业;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //创建一个文本扫描器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //定义三个变量用来统计大写字母，小写字母，数字的个数
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        //遍历字符串，对每个字符进行判断
        for (int i = 0;i<str.length();i++){
            char chs = str.charAt(i);
            //如果
            if (chs >= 'A' && chs <= 'Z'){
                bigCount++;
            }else if (chs >= 'a' && chs <= 'z'){
                smallCount++;
            }else if (chs >= '0' && chs <= '9'){
                numCount++;
            }else {
                System.out.println("该字符"+chs+"非法");
            }
        }
        //输出结果
        System.out.println("大写字符："+bigCount+"个");
        System.out.println("小写字符："+smallCount+"个");
        System.out.println("数字字符："+numCount+"个");


    }
}