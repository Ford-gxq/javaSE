package homeWork;
public class Calculaion {
    private double a;
    private double b;
    //有参构造
    public Calculaion(double a,double b){
        this.a=a;
        this.b=b;
    }
    //加法运算
    public void add(){
        System.out.println("a加b ："+(a+b));
    }
    //减法运算
    public void sub(){
        System.out.println("a减b ："+(a-b));
    }
    //减法运算
    public void times(){
        System.out.println("a乘b ："+(a*b));
    }
    //减法运算
    public void div(){
        System.out.println("a除以b ："+(a/b));
    }

    public static void main(String[] args) {
        Calculaion c = new Calculaion(8.0,2.0);
        c.add();
        c.sub();
        c.times();
        c.div();
    }
}
