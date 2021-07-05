package 递归算法小练习;
/**
 * 斐波那契数列
 * */
public class Demo {
    public static  void main(String[] args){
        //数列：1,1, 2，3，5，8......
        for (int i=1;i<=15;i++){    //输出15个斐波那契数列
            System.out.print(fun(i)+"\t");
        }
    }
    public  static int fun(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
}



