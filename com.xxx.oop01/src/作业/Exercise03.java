package 作业;

import java.util.function.DoubleToIntFunction;

 /**
 * 统计字符串中大写，小写及数字字符的个数
 *    思路：定义一个方法用于统计大写或小写或者数字的方法
 *          参数与返回值：   传入的参数是一个字符串，然后返回值是统计的个数
 *           方法体: 先通过循环将传入的字符串使用charAt(index )方法返回对应索引处的字符
 *                   然后使用Character包装类的 isLowerCase​(char ch)和isUpperCase​(char ch)方法
 *   Character包装类的一个静态方法-->static boolean isLowerCase​(char ch)确定指定的字符是否为小写字符。
 *                         static boolean isUpperCase​(char ch) 确定指定的字符是否为大写字符。
 *                         static boolean isDigit​(char ch) 确定指定的字符是否为数字。
 * */
public class Exercise03 {
    public static void main(String[] args) {
        CountNum cn=new CountNum();
        String str="123456abcEDFGH";
        System.out.println("小写字母的个数为："+cn.getLowerCase(str));
        System.out.println("大写字母的个数为："+cn.getUpperCase(str));
        System.out.println("大写数字的个数为："+cn.getDigitCount(str));

    }

}
  class CountNum{
      /**定义一个统计小写字母个数的方法
       *  统计小写字母
       *  str 传进来的原字符串
       *  返回小写字母的个数
       */
         // Character包装类的一个静态方法-->static boolean isLowerCase​(char ch)确定指定的字符是否为小写字符。
    //定义一个统计小写字母个数的方法
   public  int getLowerCase(String str){
       int count = 0;//定义一个变量记录个数
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);//返回指定索引处的char值
           if (Character.isLowerCase(ch)) { // isLowerCase​(char ch)
               count++;
           }
       }
       return count;
   }
      /**定义一个统计大写字母个数的方法
       *  统计大写字母
       *  str传进来的原字符串
       *  返回大写字母的个数
       */
    // static boolean isUpperCase​(char ch) 确定指定的字符是否为大写字符。
      public int getUpperCase(String str){
          int count=0;
          for(int i=0;i<str.length();i++){
              char ch=str.charAt(i); //返回指定索引处的char值
              if(Character.isUpperCase(ch)){
                  count++;
              }
          }
          return  count;

      }
      /**
       * 统计数字
       * @param str 传进来的原字符串
       * @return 返回数字的个数
       */
      public int getDigitCount(String str){
          int count = 0;
          for(int i = 0; i < str.length(); i++){
              char ch = str.charAt(i);
              if (Character.isDigit(ch)) {
                  count++;
              }
          }
          return count;
      }


  }