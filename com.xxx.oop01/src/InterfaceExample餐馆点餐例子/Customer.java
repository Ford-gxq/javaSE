package InterfaceExample餐馆点餐例子;
/**
 * 顾客手里有一个菜单
 *
 * */

/**
     Cat is a Animal,但凡满足is a的表示都可以设置为继承。
      Customer has a FoodMenu,但凡是满足has a的表示都以属性的形式存在。
*/
//这个接口有什么用呢?
        //这个饭馆的"菜单"，让“顾客"和"后厨"解耦合了。
        //顾客不用找后厨，后厨不用找顾客。他们之间完全依靠这个抽象的菜单沟邇。
        //总结一句话:面向接口编程，可以降低程序的耦合度，提高程序的扩展力.
        //符合oCp开发原则。
/**
class Address {
string city;
string street;
string zipcode ;
class User {
string id;
String name ;
Address addr ;
*/
//Customer has a FoodMenu! ( 这句话什么意思:顾客有一个菜单)
//记住:以后凡是能够使用has a来描述的，统一以属性的方式存在。
//实例变量，属性
public class Customer {
    //面向抽象编程，面向接口编程。降低程序的耦合度，提高程序的扩展力.
 private FoodMenu foodMenu;

    public Customer() { }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
 //set和get方法
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的方法
    public void order(){
        this.getFoodMenu().xinhongshijidan();
        this.getFoodMenu().yuxiangrousi();

    }

}
