package 数组;
import 数组练习.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr =  {4,2,8,0,1,5,0,7,10,0,11};
        System.out.println( search(arr,0));;

        System.out.println(Arrays.toString(checkZero(arr)));;

        char[] chs = {'A','B','C'};
        System.out.println(Arrays.toString(change(chs)));

        testEmp();
    }

    /**1.数组元素查找(查找指定元素第一次在数组中出现的索引)
     * 若存在:返回这个元素的下标
     * 若不存在:返回-1
     *
     * 参数： int[] arr,int i
     * 返回值: 索引  int
     */
    //方法名
    //参数 : int[] arr,int value
    //返回值 : 第一次出现的索引 int
    public static int search(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    /**
        2.
        数组元素去0
        原数组: 4,2,8,0,1,5,0,7,10
        去0之后: 4,2,8,1,5,7,10
     */
    public static int[] checkZero(int[] arr){
        //1.找到原数组中不为0数据的个数
        int count = 0; //计数器
        for(int i:arr){
            if(i!=0){
                count++;
            }
        }
        //原数组中不存在0
        if(count==arr.length){
            return arr;
        }
        //2.构建新数组
        int[] newArr = new int[count];
        //3.遍历原数组,拷贝到新数组中
        //i作为原数组索引
        int j = 0; //j作为新数组的索引
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                newArr[j++] = arr[i];
            }
        }
        //4.返回新数组
        return newArr;
    }

    //3.将一个存放了大写字母的数组转换成存放小写字母的数组返回
    public static char[] change(char[] arr){
        if(arr!=null && arr.length!=0){
            for(int i=0;i<=arr.length-1;i++){
                if(arr[i]>='A' && arr[i]<='Z'){
                    arr[i]  += 32;
                }
            }
        }
        return arr;
    }


    /**
        4.
            练习: 定义员工类型,存储多个员工类型的数据
            1.展示输出所有员工信息
            2.找到所有员工的姓名存储起来
            3.找到所有薪资>10000的员工->裁员
            4.找到出现的员工年龄统计个数
     */
    public static void testEmp(){
        Employee[] emps = {
                new Employee(1001,"张三",18,18000),
                new Employee(1002,"李四",17,1800),
                new Employee(1003,"王五",19,20000),
        };

        //1.展示输出所有员工信息
        System.out.println(Arrays.toString(emps));

        //2.找到所有员工的姓名存储起来
        //新数组中存储所有员工能姓名
        String[] names = new String[emps.length];
        for(int i=0;i<emps.length;i++){
            names[i] = emps[i].getName();
        }
        System.out.println(Arrays.toString(names));

        // 3.找到所有薪资>10000的员工->裁员
        //ArrayList 动态根据数据的多少做增删 存储多个数据,存储任意类型的数据
        //1)常见一个集合,用来多态数据
        ArrayList ls = new ArrayList();
        //2)遍历原数组,找到所有薪资<=10000的员工放入集合ls
        for(Employee emp:emps){
            if(emp.getSalary()<=10000){
                ls.add(emp);
            }
        }
        //3)打印ls中的数据
        System.out.println(ls);

        //4.找到出现的员工年龄统计个数
        HashSet set = new HashSet();  //存储出现的员工年龄
        //HashSet 可以根据数据做去重,重复数据无法重复加入集合,最终获取集合中数据的个数
        for(Employee emp:emps){
            set.add(emp.getAge());
        }
        System.out.println(set.size());  //集合中数据的个数
    }



}