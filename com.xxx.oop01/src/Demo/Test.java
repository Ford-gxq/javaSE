package Demo;
public class Test {
    int count=9; //成员变量
    public void count1(){
        count=10;
        System.out.println("count1="+count);
    }
    public void count2(){
        System.out.println("count2="+count);
    }
    public static void main(String[] args) {
        Test t=new Test();//实例化对象
        t.count1();
        t.count2();
    }
}
