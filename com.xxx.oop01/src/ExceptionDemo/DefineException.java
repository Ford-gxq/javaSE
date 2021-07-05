package ExceptionDemo;
/**
    自定义异常:
        异常是类
        根据项目业务需求定义不同的异常类型
        自定义的异常类都要直接或者间接的继承自Exception
            定义运行时异常需要直接或者间接的继承自RunctimeException
        throw 制造异常
 */
public class DefineException {
    //main方法里测试自定义异常的使用
    public static void main(String[] args) {
     Student stu =new Student();
     stu.setName("牛虎");
     //此处可以进行判断处理  增强语句的
        int age=110;
     /**  if(age<0 && age>100){
            stu.setAge(age);
        }else{
            stu.setAge(18);
        }  */
    //此处使用异常捕获异常
        try{
            stu.setAge(age);
        }catch(IllegalException e){
         e.printStackTrace();
                try{  //对应使用嵌套异常捕获来处理自定义异常
                stu.setAge(18);
            }catch(Exception e1){
             e1.printStackTrace();
             }
        }

        System.out.println(stu);
    }
}


//自定义一个非法年龄的异常
 //class  Illegal  extends RuntimeException{ //运行时异常
    class IllegalException extends Exception{ //编译型异常
    public IllegalException() { }

    public IllegalException(String message) {
        super(message);
    }
}

class  Student{
    private String name;
    private String gender;
    private  int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age) throws IllegalException {
        if (age<0||age>100){
            throw new IllegalException(age+"年龄不合法");  //编译时
        }
        this.age=age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }



}
