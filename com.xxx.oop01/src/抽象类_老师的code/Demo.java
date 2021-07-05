package 抽象类_老师的code;
//静态方法不能被重写,但是可以被继承
public class Demo {
    public static void main(String[] args) {
        //Fu fu = new Zi();
        Fu.test();
        Zi.test();
    }
}


class Fu{
    static void test(){
        System.out.println("Fu");
    }
}

class Zi extends  Fu{
    static void test(int i){
        System.out.println("Zi");
    }
}
