package 数组练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**1. 数组元素查找(查找指定元素第一次在数组中出现的索引)
 * 若存在:返回这个元素的下标
 * 若不存在:返回-1
 *
 * 参数： int[] arr,int i
 * 返回值: 索引  int
 * 2. 数组元素去除0元素
 *         原数组: 4,2,8,0,1,5,0,7,10
 *         去0之后: 4,2,8,1,5,7,10
 */
public class Example01 {
    public static void main(String[] args) {
        int [] arr={10,20,30,10,20,0};
        System.out.println(SearchNum(arr,20));
        char[] CharArr={'A','B','C','D','E'};
        System.out.println(Arrays.toString(ChangeLetter(CharArr)));
        System.out.println(Arrays.toString(CheckZero(arr)));
        testEmp();
    }
//1.定义一个方法用于查找数组元素第一次出现的索引，不存在返回-1，存在返回索引
    // 1)方法存在返回值-->返回一个索引值 2)方法的参数要查找的数组、查找的元素
    public static int SearchNum(int [] arr,int num){
        //遍历要查找的数组
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
//2.定义一个去除数组中零元素的方法
    /**思路：1)找到原数组中不为零的元素的个数
     *       2)定义一个新数组用于存储包含零的元素
     *       3)遍历原数组拷贝到新数组中
     *       4)返回新数组--->int []
     *     方法名：checkZero
     * */
  public  static int[]  CheckZero(int [] arr){
      //1. 找到原数组中不为零的元素的个数
      int counter=0;
      for (int i = 0; i <arr.length; i++) {
          if (arr[i]!=0){
         counter++;
          }
      } if(counter==arr.length){//计数器的值等于数组长度则返回原数组，说明原数组不含零
          return arr;
      }
      //2. 定义一个新数组
      int [] newArr=new int[counter];
      //3.遍历原数组,拷贝到新数组中
      //i作为原数组索引, j作为新数组的索引
      int j=0;
      for (int i = 0; i <arr.length ; i++) {
          if(arr[i]!=0){
             newArr[j++]=arr[i];
          }
      }
      //返回新数组
      return newArr;
  }
//3. 将一个存放了大写字母的数组转换成存放小写字母的数组返回
    //方法名ChangeLetter ---> 方法的参数一个字符数组，返回值一个字符数组
 public static char[] ChangeLetter(char[] arr){
      if(arr!=null && arr.length!=0){//如果原数组不为空且长度不等于零
          for (int i = 0; i < arr.length-1; i++) {
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
           new Employee(1001,"章子怡",32,15000),
            new Employee(1002,"汪峰",42,18000),
            new Employee(1003,"马云",32,5000)
        };
//1.展示输出所有员工信息
        System.out.println(Arrays.toString(emps));
// 2.找到所有员工的姓名存储起来
        // 新数组中存储所有员工的姓名
        String [] names=new String[emps.length];
        for (int i = 0; i <emps.length ; i++) {
            names[i]=emps[i].getName();
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
        //HashSet 可以根据数据去重,重复数据无法重复加入集合,最终获取集合中数据的个数
        for(Employee emp:emps){
            set.add(emp.getAge());
        }
        System.out.println(set.size());  //集合中数据的个数
    }

}
