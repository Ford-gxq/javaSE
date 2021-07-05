package 数组练习;
/**
 4.
 练习: 定义员工类型,存储多个员工类型的数据
 1.展示输出所有员工信息
 2.找到所有员工的姓名存储起来
 3.找到所有薪资>10000的员工->裁员
 4.找到出现的员工年龄统计个数
 */
import java.util.Arrays;

public class EmArray {
    public static void main(String[] args) {
        Employee  [] emArr=new Employee[5];
        emArr[0]=new Employee(1001,"张三",18,10000);
        emArr[1]=new Employee(1002,"李四",19,8000);
        emArr[2]=new Employee(1003,"王五",25,7000);
        emArr[3]=new Employee(1003,"王五",25,6000);
        emArr[4]=new Employee(1003,"王五",18,5500);
        //1.展示输出所有员工信息
        System.out.println(Arrays.toString(emArr));
        //2.找到所有员工的姓名存储起来
        String [] Names =new String[5];//定义一个字符串类型的数组用于存储员工的姓名
        for (int i = 0; i <emArr.length ; i++) {
           Names[i]=emArr[i].getName();//动态存储员工的姓名
        }
        System.out.println(Arrays.toString(Names));

        String [] AgeArr=new String[2];
        for (int j = 0; j < emArr.length; j++) {
            if (emArr[j].getAge()==18){
                AgeArr[j]=emArr[j].getName();

            }
        }
    }
}
