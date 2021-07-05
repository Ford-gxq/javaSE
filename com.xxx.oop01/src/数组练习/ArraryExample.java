package 数组练习;
import java.util.Scanner;
/**
 * 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *   (1)给定数组int[] arr={5,7,3,2,5}
 *   (2)要查询的元素通过键盘录入的方式确定
 *   (3)定义一个查找数组元素第一次出现位置的方法(注：要查找的元素就是键盘录入的数据)
 *分析：
 *    A:定义数组int[] arr={5,7,3,2,5};
 *    B:键盘录入一个被查询的数据
 *    C:写方法实现查找指定元素在数据中第一次出现的索引
 *                 遍历数组，依次比较元素，如果相等，就把该处的索引返回即可
 *    D：调用方法，输出结果
 *
 */
public class ArraryExample {
    public static void main(String[] args) {
        //定义1个数组
        int[] arr= {5,7,3,2,5};
        //键盘录入数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的元素:");
        int num=sc.nextInt();
        int index=getIndex(arr,num);
        System.out.println("索引是"+index);
    }
    //写方法 明确返回值int 明确参数列表int[] arr,int value
    public static int getIndex(int[] arr,int value)
    {
        //遍历数组
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==value)
            {
                return x;
            }
        }
        //没找到返回-1
        return -1;
    }
}