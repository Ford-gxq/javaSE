package 作业;
/**
 * 把字符串的首字母转成大写，其他小写
 *
 * */
public class Exercise04 {
    public static void main(String[] args) {
        String str="abBDFdff";
        String  str1=str.substring(1,str.length());
        String str2=str1.toLowerCase();
        String str3=str.substring(0,1).toUpperCase();
        System.out.println("转换后的字符串为："+str3+str2);
    }
}
