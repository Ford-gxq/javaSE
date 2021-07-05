package homeWork;
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("001", "张三", "男",18,90);
        Student s2 = new Student("002", "李四", "女",16,91);
        Student s3 = new Student("003", "王五", "男",15,92);
        Student s4 = new Student("004", "赵六", "男",20,95);
        Student s5 = new Student("005", "老八", "男",18,99);

        System.out.println("\t学号\t姓名\t姓别\t年龄\t成绩");
        System.out.println("\t"+s1.getsNO()+"\t"+s1.getsName()
                +"\t"+s1.getsSex()+"\t"+s1.getsAge()+"\t"+s1.getsJava());
        System.out.println("\t"+s2.getsNO()+"\t"+s2.getsName()
                +"\t"+s2.getsSex()+"\t"+s2.getsAge()+"\t"+s2.getsJava());
        System.out.println("\t"+s3.getsNO()+"\t"+s3.getsName()
                +"\t"+s3.getsSex()+"\t"+s3.getsAge()+"\t"+s3.getsJava());
        System.out.println("\t"+s4.getsNO()+"\t"+s4.getsName()
                +"\t"+s4.getsSex()+"\t"+s4.getsAge()+"\t"+s4.getsJava());
        System.out.println("\t"+s5.getsNO()+"\t"+s5.getsName()
                +"\t"+s5.getsSex()+"\t"+s5.getsAge()+"\t"+s5.getsJava());
        int d = (s1.getsJava()+ s2.getsJava()+ s3.getsJava()
                + s4.getsJava()+ s5.getsJava())/5;
        System.out.println("java语言平均成绩："+d);
    }
}
