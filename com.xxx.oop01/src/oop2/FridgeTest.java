package oop2;

public class FridgeTest {
    public static void main(String[] args) {
        Fridge  fridge= new Fridge("海尔","白色",10000);
        Elephant ele=new Elephant("马云","非洲象");
        //第一步：打开冰箱门
        fridge.openDoor();
        //第二步把大象装进冰箱
        ele.run();
        fridge.storage();
        //第三步 关门
        fridge.closeDoor();
    }
}
