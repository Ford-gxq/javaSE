package PizzaExample;
/**培根披萨:
    新增培根的克数
 * */
public class PgPizza extends Pizza {
    private int Pgweight;

    //构造器
    public PgPizza(String name, double price, int size, int pgweight) {
        super(name, price, size);
       this.Pgweight = pgweight;
    }
    //生成set  get方法

    public int getPgweight() {
        return Pgweight;
    }

    public void setPgweight(int pgweight) {
        Pgweight = pgweight;
    }

    @Override
    public void show(){
        System.out.println(getName());
        System.out.println("价格:"+getPrice());
        System.out.println("大小"+getSize());
        System.out.println("培根克数:"+getPgweight());

    }
  //重写toString  方法
    @Override
    public String toString() {
        return "PgPizza{" +
                "Pgweight=" + Pgweight +
                '}';
    }
}
