package 抽象类_老师的code;
/**
    抽象类  abstract
        开发部门
            java攻城狮   工作work()
            web程序猿    工作work()
    抽象方法: 被abstract修饰的方法
        没有方法体
        必须存在于抽象类中
    抽象类: 被abstract修饰的类

    注意:
        1.抽象类不能实例化-->创建对象
        2.抽象类中可以定义任意内容,具体方法 ,抽象方法,属性,构造器...
        3.使用 :
            通过具体子类对象
            具体子类 : 为抽象父类中所有的抽象方法进行重写+按需新增
            抽象子类 : 按需重写抽象方法 + 按需新增
                需要通过具体子类重写所有的抽象方法,构建对象调用
        4.抽象方法必须被重写,为方法定义方法体
        5.抽象方法一旦被重写后续无需再次重写
        6.abstract不能与private,final,native,static不能同时出现

 */
//父类  开发者类
public abstract class Developer {
    //工作
    //不知道怎么写,不确定方法体怎么定义-->不写
    public abstract void work();
    public abstract void sleep();
}

//具体子类
class Java extends Developer{

    @Override
    public void work() {
        System.out.println("服务器端开发....");
    }

    @Override
    public void sleep() {
        System.out.println("边敲代码变睡觉....");
    }

    //新增方法
    public void haha(){
        System.out.println("与产品和测试吵架!!!!");
    }
}
//抽象子类
abstract class Web extends Developer{

    @Override
    public void work() {
        System.out.println("浏览器端开发...");
    }

    //public abstract void sleep();
}

class WebWeb extends Web{

    @Override
    public void sleep() {
        System.out.println("变唱歌边休息...");
    }
}