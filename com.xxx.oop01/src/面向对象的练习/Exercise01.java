package 面向对象的练习;

import java.util.ArrayList;
import java.util.Random;

/**
 * 编写5星级酒店:
 * 	厨师,服务员,经理三个员工都有一些相同的属性和功能,只有厨师和服务员有vip服务,
 * 	厨师vip服务加菜,服务员嘘寒问暖,定义程序实现功能并测试
 * */
public class Exercise01 {
    //main方法测试
    public static void main(String[] args) {
        //招聘员工入酒店
        Cooker c1=new Cooker("厨师1",20,"男");
        Cooker c2=new Cooker("厨师2",25,"女");
        Cooker c3=new Cooker("厨师3",26,"男");
        Waiter w1=new Waiter("服务员1",18,"女");
        Waiter w2=new Waiter("服务员2",20,"女");
        Waiter w3=new Waiter("服务员3",19,"男");
       Manager m=new Manager("Tom",30,"男");
        // 调用厨师的工作的VIP服务
        c1.work();
        c1.VipService();
        // 调用服务员的工作的VIP服务
         w1.VipService();
         w1.work();
        // 调用经理的工作
        m.VipService();
        m.work();
        // 将名字放入list列表进行随机抽奖-->定义一个集合类
        ArrayList<String> list = new ArrayList<String>();
        list.add(c1.getName());
        list.add(c2.getName());
        list.add(c3.getName());
        list.add(w1.getName());
        list.add(w2.getName());
        list.add(m.getName());
        int index = new Random().nextInt(list.size());
        System.out.println("幸运儿是名字为" + list.get(index) + "的员工！恭喜你！");
    }


}
//定义一个员工抽象类：属性-->姓名 编号 性别
// 抽象方法：工作抽象方法
 abstract  class EmployeeA{
    private  String name;
    private  int id;
    private String gender;
    //空参构造
    public EmployeeA() { }
    //三参构造
    public EmployeeA(String name, int id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }
    //set、get方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //抽象方法work
    public abstract void work();
}

//VIP服务接口
  interface  VipService{
    public abstract  void VipService();
}

//厨师类继承员工类并重写work()和实现Vip接口
 class Cooker extends  EmployeeA implements VipService{
    //厨师类生成构造器并调用父类的构造器
    public Cooker(String name, int id, String gender) {
        super(name, id, gender);
    }

    @Override//重写work方法
    public void work() {
        System.out.println("我是厨师，我的工作是烧菜..");
    }

    @Override//抽象vip服务
    public void VipService() {
        System.out.println("我可以为顾客提供加菜服务..");
    }
}

//定义服务员类继承员工类并实现VIP服务接口
 class Waiter  extends EmployeeA implements VipService{
    //服务员构造器
    public Waiter(String name, int id, String gender) {
        super(name, id, gender);
    }

    @Override
    public void work() {
        System.out.println("我是服务员，我的工作是为客户提供点餐和上菜服务..");
    }

    @Override
    public void VipService() {
        System.out.println("我可以为客户提供送菜服务,嘘寒问暖..");
    }
}

//定义经理类Manager继承员工类
class Manager extends EmployeeA implements  VipService{
    public Manager(String name, int id, String gender) {
        super(name, id, gender);
    }

    public Manager() {
        super();
    }

    @Override
    public void work() {
        System.out.println("我是经理，我的工作是管理厨师和服务员..");
    }

    @Override
    public void VipService() {
        System.out.println("我可以为客户提供打折服务..");
    }
}
