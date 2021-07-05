package InterfaceExample餐馆点餐例子;
/**西餐厨师实现菜单上的菜
*/
//厨师是接口的实现者
public class AmericanCooker implements  FoodMenu{
    @Override
    public void xinhongshijidan() {
        System.out.println( "西餐厨师做了一份西红柿炒鸡蛋..");
    }

    @Override
    public void yuxiangrousi() {
        System.out.println("西餐师傅做的鱼香肉丝..");
    }
}
