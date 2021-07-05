package 包_This关键字和super关键字;
/**
 * super与this区别：
        1. this的三个作用：
            1)this指代当前对象
            2)this()在构造器的首行调用本类中的其他构造器
            3)可以用于区分同名的成员变量与局部变量的问题
        2. super 指代父类对象-->使用在子类中
            1) 在子类构造器的首行,可以通过super(实参)指定调用父类的指定构造器
            2) 子类构造器的首行默认调用父类的空构造,如果父类不存在空构造,需要显示指定调用父类的哪一个带参构造
                注意：在子类构造器首行调用其他构造器时候,super与this不能同时存在
            3) 区分子类与父类中的同名成员问题
       3. 继承关系下: 创建子类对象-->先父类后子类
         成员是属于对象的,需要通过对象调用
        子类一旦继承父类,就有权使用父类的成员
        先静态后成员
        注意: super与this关键字都只能使用在成员环境内
 */
public class This_superDemo{
    public static void main(String[] args) {
       Son son=new Son();
       son.j=5;
       son.i=10;
       son.test();
    }
}
//定义一个父类
class Father{
    String name = "父类名字";
    int i;
    static int j;

    //无参构造
    public Father(){
        System.out.println("我是无参构造");
    }
    //有参构造
    public Father(String name){
        System.out.println("我是父类一个参数构造器");
    }

    public Father(String name,int i){
        System.out.println("我是父类2个参数构造"+name+i);
    }
}

//子类继承父类
class Son extends Father{
    String name = "子类名字";
    //子类空参构造
    public Son(){
        super("父name",2);//调用父类的两参构造
        System.out.println("我是子类空构造");
        System.out.println(this);
    }
   //父类的含参数构造
    public Son(String name){
        this();
        System.out.println("我是子类1个参数构造");
    }

    public void  test(){
        String name = "局部名字";
        System.out.println(name);  //就近原则  局部
        System.out.println(this.name);  //本类成员
        System.out.println(super.name);  //父类成员
    }
}