package homework_5_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        //34 9 -1 78 3 22  -->要排序必须是类实现了Comparable接口
        String str = "34 9 -1 78 3 22" ;
        sort(str);
    }
    private static void sort(String str) {
        String  [] a = str.split(" ") ;//使用字符串的分割方法，按照空格分割
        //System.out.println(Arrays.toString(a));
        int [] b  = new int [a.length] ;
        //遍历
        for (int i = 0; i <a.length ; i++) {
           Integer in=Integer.valueOf(a[i]);//此处定义一个Integer包装类，并调用valueOf()把遍历出来的数字传给Integer包装类
           b[i]=in;
        }
        //Arrays.sort(int [])方法--->static void sort​(int[] a) 将指定的数组按升序排序
       Arrays.sort(b);//排序
     //再将排好序的int数组，转换为字符串
        String[] str1=new String [b.length];
        for (int i = 0; i < b.length; i++) {
            str1[i]=b[i]+"";
            System.out.print(str1[i]+" ");
        }

    }

}
