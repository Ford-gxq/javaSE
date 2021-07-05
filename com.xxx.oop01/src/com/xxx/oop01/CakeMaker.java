package com.xxx.oop01;

public class CakeMaker {
    String name;
    int level;
    String gender;

    public  Cake  MakeCake(String cakeColor,String cakeMaterials,int cakeSize,String cakeTaste ){
        Cake cake=new Cake();

        cake.setColor(cakeColor);
        cake.setMaterials(cakeMaterials);
        cake.setSize(cakeSize);
        cake.setTaste(cakeTaste);
        cake.show();
       return cake;
    }
}
