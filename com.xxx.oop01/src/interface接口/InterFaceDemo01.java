package interface接口;
/**
    接口->抽象  使用
        接口是一个引用数据类型
        特殊的抽象类
        定义规范
        功能的集合(抽象方法的集合)
        解耦(降低耦合度)
        类的单继承机制  接口可以多实现
     定义:
        interface 定义接口
        jdk1.7及之前:
            公共的静态的常量  public static final 数据类型 常量名  = 赋值;
                public static final可以任意省略
            公共的抽象的方法
                public abstract 返回值类型|void 方法名(参数列表);
                public abstract 任意省略
       注意:
            1.接口不能实例化
            2.类需要通过extends关键字继承,接口implements实现
            3.使用:
                具体的实现类的对象调用重写后的抽象方法
                具体的实现类:  重写接口中的所有抽象方法+按需新增
                抽象的实现类:  按需重写+按需新增
            4.类是单继承,接口是多实现
            5.一个类可以同时实现多个接口
            6.一个类如果同时实现接口,继承父类,要求先继承后实现
            7.类与类之间只能继承,单继承
              类与接口之间,只能类实现接口,可以多实现
              接口与接口之间,可以多继承
       普通的父类,抽象父类,接口:
        继承 : 父类中可以属性,功能..
        实现-->功能实现
        不冲突
        推荐使用接口
 */
class InterFaceDemo1 {
    public static void main(String[] args) {
        //测试接抠内容的使用
        System.out.println(InterfaceDemo.PI);

        //实现类对象
        ImplDemo impl = new ImplDemo();
        impl.haha();
        impl.hehe();
    }
}

//接口
interface InterfaceDemo{
    public static final double PI = 3.14;

    //抽象 方法
    public abstract void test();
    public abstract void haha();
    public abstract void hehe();

}

//抽象实现类
abstract class ImplDemo2 implements InterfaceDemo{
    @Override
    public void test() {
        System.out.println("抽象 实现类");
    }
    //public abstract void haha();
    //public abstract void hehe();
}

//具体实现类
class ImplDemo implements InterfaceDemo{
    @Override
    public void test() {
        System.out.println("具体实现类");
    }

    @Override
    public void haha() {
        System.out.println("聊天止于微笑");
    }

    @Override
    public void hehe() {
        System.out.println("聊天止于呵呵");
    }
}