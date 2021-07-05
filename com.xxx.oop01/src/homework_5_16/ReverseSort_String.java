package homework_5_16;
import java.util.*;

/**
 * Class String
 *   --java.lang.Object
 *      --java.lang.String
 * 实现的所有接口
 *    Serializable , CharSequence, Comparable<String>
 *
 * */
public class ReverseSort_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要输入的字符串：");
        String str=sc.next();
        sort(str);

    }
 public static  void sort(String s){
     //char[] toCharArray()   将此字符串转换为新的字符数组。
        char[] ch= s.toCharArray();
       Arrays.sort(ch);//static void sort​(char[] a) 将指定的数组按升序排序。
     System.out.println("升序排序：");
     for(char chs : ch) {
         System.out.print(chs+" ");
     }
     System.out.println();
     System.out.println("输入字符串的倒序排列为：");
     for (int i = ch.length - 1; i >= 0; i--) {
         System.out.print(ch[i] + " ");
     }

 }


}
