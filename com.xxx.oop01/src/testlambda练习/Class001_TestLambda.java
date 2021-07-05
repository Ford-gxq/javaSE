package testlambda练习;

import 内部比较器_外部比较器.Emp;
import java.security.PrivateKey;
import java.util.*;
/**
 * 题一:调用Collections.sort()方法,通过定值排序比较两个Employee(先按年龄比,年龄相同按姓名比),使用Lambda作为参数传递
 * 分析:
 * 	1.定制排序:指自定义比较器|定制排序
 * 	      自然排序:内部比较器|自然排序
 *  2.先比较年龄,年龄相同才比较姓名
 */
public class Class001_TestLambda {
	public static void main(String[] args) {
	List<Employee> employeeList = Arrays.asList(
			new Employee("张三", 17),
			new Employee("张三", 17),
			new Employee("李三", 12),
			new Employee("李四", 18)
	);
	System.out.println(employeeList);

		//排序,默认升序排序
		Collections.sort(employeeList,(o1, o2) -> {
			int num = Integer.compare(o1.getAge(), o2.getAge());
		    int num2 = num==0?o1.getName().compareTo(o2.getName()):num;
		    return  num2;
		});

		System.out.println(employeeList);
	}


}
class Employee {
  private int Eno;
  private  String  name;
  private  int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getEno() {
		return Eno;
	}

	public void setEno(int eno) {
		Eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//重写equals方法

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Eno == employee.Eno &&
				age == employee.age &&
				Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Eno, name, age);
	}

	@Override
	public String toString() {
		return "Employere{" +
				"Eno=" + Eno +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

//	@Override
//	public int compareTo(Employee o) {
//		int num = Integer.compare(this.age, o.age);
//		int num2 = num==0?this.name.compareTo(o.name):num;
//		return  num2;
//
//	}

}
