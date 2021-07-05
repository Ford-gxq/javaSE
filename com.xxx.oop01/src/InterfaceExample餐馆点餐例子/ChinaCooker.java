package InterfaceExample餐馆点餐例子;
/**
 * 中餐厨师实现菜单上的菜
 * */
//厨师是接口的实现者
public class ChinaCooker implements FoodMenu {
    @Override//西餐师傅做的西红柿炒鸡蛋
    public void xinhongshijidan() {
        System.out.println("中餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void yuxiangrousi() {
        System.out.println("中餐师傅做的鱼香肉丝");
    }
}
