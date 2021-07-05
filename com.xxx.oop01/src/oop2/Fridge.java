package oop2;

public class Fridge {
    String brand;
    String color;
    int size;
    //空构造方法
    public Fridge(){}
    public Fridge(String fName,String fColor,int fSize){
        brand=fName;
        color=fColor;
        size=fSize;
    }
    public void openDoor(){//开门
        System.out.println("冰箱门已经打开");
    }
    public void closeDoor(){//关门
        System.out.println("冰箱已经关闭");
    }
    //存储的方法
    public void storage(){
        System.out.println("存储大象");
    }
}
