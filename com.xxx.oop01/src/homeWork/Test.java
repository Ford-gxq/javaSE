package homeWork;
/**
 * 圆类Circle，在类的内部提供一个属性：半径(r)
 * 两个 方 法 ：计算面积getArea()和 计算周长getPerimeter()
 * **/
  class Circle {
    public int r;
//    Point point;
    /** 无参构造 */
    public Circle(){}
    /** 有参构造，初始化半径*/
    public Circle(int r){
        this.r=r;
//        This.point = p;
    }
    /** 使用setR方法初始化半径 */
    public void setR(int r){
        this.r = r;
    }
    /**计算 面积 */
    public void getArea(){
        double area = Math.PI*r*r;//从Math工具类得到π的值
        System.out.println("圆的面积为："+area);
    }
    /** 计算周长 */
    public void getPerimeter(){
        double zc = Math.PI*2*r;
        System.out.println("圆的周长为："+zc);
    }
}
/** 测试 */
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5);//初始半径为4,使用构造初始化
        c.getArea();
        c.getPerimeter();
    }
}
