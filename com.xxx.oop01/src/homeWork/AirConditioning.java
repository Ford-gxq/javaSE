package homeWork;
public class AirConditioning {
    // 空调属性
    String name;
    String brand;
    String hp;// 匹数(horsepower)
    int tempeture;
    // 定义制冷行为
    void cool() {
        tempeture--;
    }
    // 定义加热行为
    void hot() {
        tempeture += 7;
    }
    //通风功能
    void ventilate(){
        System.out.println("空气通畅，温度不变");
    }
    // 主函数
    public static void main(String[] args) {
        AirConditioning kt = new AirConditioning();
        kt.hp = "2匹";
        kt.tempeture = 20;
        kt.brand = "格力";
        kt.cool();
        System.out.println("空调的温度是" + kt.tempeture);
        kt.hot();
        System.out.println("空调的温度是" + kt.tempeture);
        kt.ventilate();
    }
}
