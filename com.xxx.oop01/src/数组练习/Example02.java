package 数组练习;
/**
 可变参数:
 数据类型 ... 参数名
 个数可变->0~n个参数
 可变参数要存在有参数列表的最后位置
 在方法中使用可变参数,通过操作数组的方式
 */
public class Example02 {//测试
    public static void main(String[] args) {
         SumNum(1,55,20,50,856);
    }
    //定义一个静态方法
    static void SumNum(int ...x){
        int sum=0;
        for ( int i:x
             ) {
           sum+=i;
        }
        System.out.println(sum);
    }


}
