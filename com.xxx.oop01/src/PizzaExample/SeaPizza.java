package PizzaExample;
/**海鲜披萨:
 独有新增配料信息属性
 * */
public class SeaPizza  extends  Pizza{
   private  String info ;

   //空构造
    public SeaPizza(){}
    //有参构造
    public SeaPizza(String name, double price, int size, String info) {
        super(name, price, size);//继承调用父类有参构造
        this.info = info;
    }

    //生成get、set方法

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//重写父类的show()方法
    @Override
    public  void show(){
        System.out.println(getName());
        System.out.println("价格:"+getPrice());
        System.out.println("尺寸"+getSize());
        System.out.println("配料信息:"+getInfo());
    }
//重写父类的toString方法
    @Override
    public String toString() {
        return "SeaPizza{" +
                "info='" + info + '\'' +
                '}'+super.toString();
    }
}
