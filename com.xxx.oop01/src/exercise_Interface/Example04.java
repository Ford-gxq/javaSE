package exercise_Interface;

import java.util.ArrayList;
import java.util.Random;

/**
 * 编写5星级酒店:
 * 	厨师,服务员,经理三个员工都有一些相同的属性和功能,只有厨师和服务员有vip服务,
 * 	厨师vip服务加菜,服务员嘘寒问暖,定义程序实现功能并测试
 * */
public class Example04 {
        public static void main(String[] args) {
            // 招人入酒店
            Cooker c1 = new Cooker("厨师1", 1001);
            Cooker c2 = new Cooker("厨师2", 1002);
            Cooker c3 = new Cooker("厨师3", 1003);
            Cooker c4 = new Cooker("厨师4", 1004);
            Waiter w1 = new Waiter("服务员1", 1101);
            Waiter w2 = new Waiter("服务员2", 1102);
            Waiter w3 = new Waiter("服务员3", 1103);
            Manager m1 = new Manager("经理", 1201, 10000);
            // 调用厨师的工作的VIP服务
            c1.work();
            c1.VIPservice();
            // 调用服务员的工作的VIP服务
            w1.work();
            w1.VIPservice();
            // 调用经理的工作
            m1.work();
            // 将名字放入list列表进行随机抽奖
            ArrayList<String> list = new ArrayList<String>();
            list.add(c1.getName());
            list.add(c2.getName());
            list.add(c3.getName());
            list.add(c4.getName());
            list.add(w1.getName());
            list.add(w2.getName());
            list.add(w3.getName());
            list.add(m1.getName());
            int index = new Random().nextInt(list.size());
            System.out.println("幸运儿是名字为" + list.get(index) + "的员工！恭喜你！");

    }
}
//员工姓名 编号 工作一系列共性 写在大类里
abstract class Employee {
    private String name;
    private int id;

    // 开发标准 必须写空参和全参构造器
    public Employee()
    {
    }
  //含参构造
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public abstract void work();
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

}
 //VIP服务接口
 interface Service {
    public abstract void VIPservice();
}
//厨师类
class Cooker extends Employee implements Service {
    public Cooker()
    {
    }

    public Cooker(String name, int id)
    {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("我是厨师，我的工作是煮菜。");// 重写工作方法
    }
    public void VIPservice() {
        System.out.println("我的VIP服务是做菜加量！");// 实现VIP接口方法
    }
}
//服务员类
class Waiter extends Employee implements Service {
    public Waiter()
    {
    }

    public Waiter(String name, int id)
    {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("我是服务员，我的工作是端菜。");
    }

    public void VIPservice() {
        System.out.println("我的VIP服务是花式倒酒服务！");
    }
}
//经理类
class Manager extends Employee {
    private int bonus;

    public Manager()
    {
    }

    public Manager(String name, int id, int bonus)
    {
        super(name, id);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("我是经理，我的工作是是管理厨师和服务员!");

    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }
}