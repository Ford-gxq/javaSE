package parameter_可变参数;
import java.util.Arrays;

/**
    可变参数:
        数据类型 ... 参数名
        个数可变->0~n个参数
        可变参数要存在有参数列表的最后位置
        在方法中使用可变参数,通过操作数组的方式
 */
public class ParamDemo {
    public static void main(String[] args) {
        sum(1,1,1,10);
        test(1,2,4,5,6,7);
    }

    //求和
    static void sum(int ... x){
        int sum = 0;
        for(int i:x){
            sum+=i;
        }
        System.out.println(sum);
    }
    static void test(int name,int ...i){
        System.out.println(Arrays.toString(i));
    }
}
