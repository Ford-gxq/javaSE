package homework_5_18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("请输入你要转换的数字：");
        Scanner sc=new Scanner(System.in);
        changUper(sc.next());
    }
  public static void changUper(String str){
      HashMap<Character,String> hm=new HashMap<>();
      hm.put('1',"壹");
      hm.put('2',"贰");
      hm.put('3',"叁");
      hm.put('4',"肆");
      hm.put('5',"伍");
      hm.put('6',"陆");
      hm.put('7',"柒");
      hm.put('8',"捌");
      hm.put('9',"玖");
      hm.put('0',"零");
      String str1="";
      char[] chars=str.toCharArray();//把传入的参数str转换成字符数组
      Set<Character> set=hm.keySet();//使用HashMap的keySet()方法
      //遍历
      for(char  ch:chars){
       for (Character key:set){
           if(key.equals(ch)){
               //把遍历出来的key值作为参数，获取对应的Value值，再使用字符串拼接
               str1+=hm.get(key);

           }
       }
      }
      System.out.println(str1);
  }
}
