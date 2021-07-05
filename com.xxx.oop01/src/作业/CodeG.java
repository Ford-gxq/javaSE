package 作业;

public class CodeG {
    public static void main(String[] args) {
        //G:统计大串中小串出现的次数
        String bigger = "sdfsdfdhg";
        String smaller = "sdf";
        System.out.println("大串中小串出现的次数为："+countString(bigger,smaller));
    }
    //G:统计大串中小串出现的次数的方法
    public static int countString(String bigger,String smaller){
        int count=0;
        int index=0;
        if(bigger.contains(smaller)){//String的一个成员方法  int indexOf​(int ch) 返回指定字符第一次出现的字符串中的索引
            while (bigger.indexOf(smaller,index)>=0&&index<bigger.length()){
                count++;
                index+=smaller.length();
            }
            return count;
        }else {
            return 0;
        }
    }
}
