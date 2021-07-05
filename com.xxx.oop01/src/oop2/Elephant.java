package oop2;

public class Elephant {
    String name;
    String type;
    //空构造
    public Elephant(){}
    //带参数的构造方法
    public Elephant(String EleName,String EleType){
        name=EleName;
        type=EleType;
    }
    public  void  run(){
        System.out.println("大象走了...");
    }
}
