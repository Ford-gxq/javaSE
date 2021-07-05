package 常用类_练习;

import java.util.Date;

public class EmployeeDemo {
    private  String name;
    private  int age;
    private int id;
    private Date hireDate;
    private  double Salary;
    private   JobStatus  jobStatus;

    //定义空构造
    public EmployeeDemo() {
    }
    //含参构造

    public EmployeeDemo(String name, int age, int id, Date hireDate, double salary, JobStatus jobStatus) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.hireDate = hireDate;
        this.Salary = salary;
        this.jobStatus = jobStatus;
    }
    //set和get方法

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", hireDate=" + hireDate +
                ", Salary='" + Salary + '\'' +
                ", jobStatus=" + jobStatus +
                '}';
    }

}
 enum JobStatus {
    busy,leisure,normal;

  private  int  id;
  private   String  name;
    //定义空参构造

     JobStatus() { }

     JobStatus(int id, String name) {
         this.id = id;
         this.name = name;
     }

     @Override
     public String toString() {
         return "jobStatus{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }