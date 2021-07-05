package homeWork;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.setSize(10);//设置初始体积
        ve.setSpeed(30);//设置初始速度
        ve.move();//调用移动方法
        ve.speedUp();//给交通工具加速
        ve.speedDown();//减速
    }

}
