package objectExample;

public class Student extends Person {
      int id;
 public  Student(int id,String name,int age){
     this.id=id;
     this.setName(name);
     this.setAge(age);
 }
    public static void main(String[] args) {
        Student stu=new Student(1001,"王五",22);
        stu.setName("张三");
        stu.setAge(18);
        stu.id=001;
        System.out.println(stu.toString());
    }




}
