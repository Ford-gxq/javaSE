package 作业;
/**
 * 字符串遍历
 *    1).length()， charAt()-->返回指定索引处的char值。
 *    2).length()， substring(i ,i+1)
 *    3).toCharArray()
 * */
public class Exercise02 {
    public static void main(String[] args) {
        String str="abcdefgh";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
       //substring(i ,i+1)--->返回一个字符串，该字符串是此字符串的子字符串。

        System.out.println(str.substring(1,7));
        //toCharArray()--->将此字符串转换为新的字符数组。
        System.out.println(str.toCharArray());

    }
}
