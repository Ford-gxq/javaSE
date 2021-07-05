package exercise_Interface;

import java.util.Scanner;

/**
 * 按如下要求编写Java程序：
 * 创建Person接口，它有setData()和getData()方法对“人”属性name、sex和birthday赋值和获得这些属性组成的字符串信息。
 * 创建类Student实现Person接口，并对自己的“学生”属性的成员变量sID、speciality设置值和获得它们值所组成的字符串信息。
 * 通过Scanner（键盘输入）得到属性，再进行赋值。
 * */
//测试类
public class Example03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("姓名：");
        String name1=input.next();
        System.out.println("性别：");
        String sex=input.next();
        System.out.println("生日：");
        String birthday=input.next();
        input.close();
        Person s = new Student();
        s.setData(name1, sex,birthday);
        String info  = s.getData();
        System.out.println(info);

    }

}

//定义一个person接口
 interface Person{
    //赋值: 属性包括name,sex,birthday--> String类型
    void setData(String name,String sex,String birthady);
    //取值 返回值为String类型的 name,sex, birthday
    String getData();
}
//定义一个学生类实现Person接口
class Student implements Person{
 private String name;
 private  String gender;
 private  String birthday;
 private  int sID=1001;
 private  String speciality="计算机科学与技术";
 @Override
    public void setData(String name,String sex,String birthday){
     this.name=name;
     this.gender=sex;
     this.birthday=birthday;
 }
@Override
    public String getData(){
   return "姓名："+name+"性别："+gender+"生日："+"\t"+
           birthday+"\t"+"学号:"+ sID +"专业："+speciality;
 }
}