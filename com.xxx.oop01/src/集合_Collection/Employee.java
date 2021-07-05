package 集合_Collection;

import java.util.Objects;

public class Employee {
    private  int Empno;
    private  String name;
    private  int age;
   private  double salary;

    public Employee(int empno, String name, int age, double salary) {
        Empno = empno;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//set和get方法
    public int getEmpno() {
        return Empno;
    }

    public void setEmpno(int empno) {
        Empno = empno;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    重写equals和toString

    @Override
    public String toString() {
        return "Employee{" +
                "Empno=" + Empno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Empno == employee.Empno &&
                age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Empno, name, age, salary);
    }

}
