package PizzaExample;
/**
 * 1)	分析培根比萨和海鲜比萨
 * 2)	定义比萨类
 * 3)	属性：名称、价格、大小
 * 4)	方法：展示
 * 5)	定义培根比萨和海鲜比萨继承自比萨类
 * 6)	定义比萨工厂类，根据输入信息产生具体的比萨对象
 *
 * */
public abstract   class Pizza {
    private  String name;
    private  double price;
    private int size;
    //空参构造
 public Pizza(){}
  //三个参数构造
    public Pizza(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
//定义一个抽象的方法show()
    public  abstract  void show();

    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
