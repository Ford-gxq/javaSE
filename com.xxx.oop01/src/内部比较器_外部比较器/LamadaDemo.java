package 内部比较器_外部比较器;
import java.util.Comparator;
import java.util.TreeSet;


public class LamadaDemo {
    public static void main(String[] args) {
        //匿名内部类  接口多态
        Comparator<Emp> com=new Comparator<Emp>(){
            @Override
            public int compare(Emp o1, Emp o2) {
                return 0;
            }
        };
     //lambada表达式
    com = (o1,o2)-> o1.getSno()-o2.getSno();

    //直接把匿名内部类当做参数传递
        new TreeSet<Emp>(new Test());
        new TreeSet<Emp>(com);
        new TreeSet<Emp>((o1,o2)->o1.getSno()-o2.getSno());//使用lamabada表达式

    }
}
//外部比较器 : 对Emp类型数据的外部比较规则
class Test implements java.util.Comparator<Emp>{
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getSno()-o2.getSno();
    }
}