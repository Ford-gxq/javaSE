package 作业;

public class CodeH {
    //    H: 判断一个字符串是否对称
    public static void main(String[] args) {
        String s="abccba";
        System.out.println(symmetry(s));
    }
    //    H: 判断一个字符串是否对称
    public static boolean symmetry(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s2= sb.toString();
        if(s.compareTo(s2)==0){
            return true;
        }else {
            return false;
        }
    }
}
