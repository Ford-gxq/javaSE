package 递归算法小练习;
/**
 * 阶乘
 * */
public class FactorialDemo {
    public static void main(String[] args) {

        System.out.println(factorial(10));
    }

    public static  int factorial(int m){
        //结束标志
        if(m==1){
            return 1;
        }
        return   m*factorial(m-1);//10*factorial(9)
    }

}
