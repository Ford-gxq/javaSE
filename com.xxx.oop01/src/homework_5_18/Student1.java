package homework_5_18;

import java.util.Date;
import java.util.Objects;

/**
   Map 中存储键值对的数据
    一个key对应一个value
 */
        //学生编号,与学生对象信息
        //编号做key,学生对象作为value

        //班级编号做key,value对应每个班级的班长
        //班级编号做key,一个班级对应多个学生-->value是一个list集合(学生对象)
        //遍历
public class Student1  {
    private int Sno;
    private  String name;
    private  int age;
    private  String mintor;
    private Date  date;
    public Student1(String name,Date date) {
        this.name = name;
        this.date=date;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
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

    public String getMintor() {
        return mintor;
    }

    public void setMintor(String mintor) {
        this.mintor = mintor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return Sno == student.Sno &&
                age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(mintor, student.mintor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Sno, name, age, mintor);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mintor='" + mintor + '\'' +
                '}';
    }

}

