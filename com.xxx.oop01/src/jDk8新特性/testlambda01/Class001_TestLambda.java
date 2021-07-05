package jDk8新特性.testlambda01;


import jDk8新特性.bean.Employee;

import java.util.*;

/**
 * 题一:调用Collections.sort()方法,通过定值排序比较两个Employee(先按年龄比,年龄相同按姓名比),使用Lambda作为参数传递
 * 分析:
 * 	1.定制排序:指自定义比较器|定制排序
 * 	      自然排序:内部比较器|自然排序
 *  2.先比较年龄,年龄相同才比较姓名
 * 注意:
 * 	Lambda表达式可以把行为作为参数传递-->抽象方法的重写
 * 	方法的形参: 函数型接口类型作为形参类型-->Lambda作为实参
 *  可以让方法的封装,调用变得灵活,简单,功能强大
 */
public class Class001_TestLambda {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("lisi", 20, 10000),
				new Employee("wangwu", 19, 15000),
				new Employee("zhaoliu", 18, 13000),
				new Employee("tainqi", 18, 20000)
		);

		System.out.println(list);


		//排序,默认升序排序
		Collections.sort(list, (o1,o2)-> {
			//判断年龄是否相等
			if(o1.getAge()==o2.getAge()){
				//返回姓名的比较
				return o1.getName().compareTo(o2.getName());
			}
			//返回年龄的比较
			return Integer.compare(o1.getAge(),o2.getAge());
		});


		System.out.println(list);
	}
}

