package homeWork;
/*
* 交通工具(Vehicle)的类其中有: 属性： 速度(speed)、 体积(size)等，
* 方法：移动(move())、设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()
* */
public class Vehicle {
   private int speed;
   private int size;
   //车移动的方法
   public void move(){
       System.out.println("汽车的速度为："+speed+"km/h");
   }
   //设置初始体积

    public void setSize(int size) {
        this.size = size;
        System.out.println("汽车的初始体积设置为:"+size+"方");
    }

    //设置速度的方法
    public void setSpeed(int speed){
    this.speed= speed;
    System.out.println("汽车的初始速度设置为:"+speed+"km/h");

    }
   //加速度的方法
    public void speedUp(){
     this.speed+=30;
        System.out.println("汽车加速30km/后的速度为:"+speed+"km/h");
    }

    //减速的方法
    public void speedDown(){
     this.speed-=10;
        System.out.println("汽车减速10km/h后的速度为："+speed+"km/h");
    }
}
