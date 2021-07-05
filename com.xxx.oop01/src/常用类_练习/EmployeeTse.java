package 常用类_练习;

import java.awt.print.Pageable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
   定义一个员工类,
    员工姓名,年龄,工号,入职时间,薪资,员工工作状态(忙碌,空间,正常)
    找到找到2021年入职的员工,打印
    找到工作状态忙碌的员工,薪资涨%6
    java是值传递:
        基本数据类型->数据值传递
        引用数据类型->地址值传递
 */
public class EmployeeTse {
 //  SimpleDateFormat simple2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS SSS E");
 //    SimpleDateFormat  日期格式转换类
 //        日期对象转字符串(指定格式)  format()
 //        字符串转日期对象  parse()

    public static void main(String[] args) throws ParseException {
        EmployeeDemo [] eps={
           new EmployeeDemo("张三",19,1001,new Date(),15000,JobStatus.busy),
           new EmployeeDemo("李四",20,1002,new Date(),20000,JobStatus.leisure),
           new EmployeeDemo("王五", 25,1003,new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"),15000,JobStatus.normal),
           new EmployeeDemo("赵六",35,1005,new Date(),12000,JobStatus.busy)
        };
        //找到找到2021年入职的员工,打印
        for (EmployeeDemo employee: eps) {
            if(new SimpleDateFormat("yyyy").format(employee.getHireDate()).equals("2021")){
                System.out.println(employee);
            }
            //找到工作状态忙碌的员工,薪资涨%6
            if(employee.getJobStatus().equals(JobStatus.busy)){
                employee.setSalary(employee.getSalary()*1.06);
               // employee.setJobStatus(JobStatus.leisure);
            }
            System.out.println(employee);
        }
    }
}
