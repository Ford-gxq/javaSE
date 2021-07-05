package 作业;

public class CodeI {
    //    I: 不使用系统功能实现字符串内容翻转
    public static void main(String[] args) {
        String s="abcdefg";
        System.out.println(reverse(s));
    }
    //    I: 不使用系统功能实现字符串内容翻转
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        char temp;
        for(int i=0;i<=chars.length/2-1;i++){
            temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }
        String s1=new String(chars);
        return s1;
    }
}