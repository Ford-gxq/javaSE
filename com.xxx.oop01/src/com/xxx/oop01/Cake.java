package com.xxx.oop01;

public class Cake {
    String color;
    String  materials;
    int  size;
    String taste;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void show(){
        System.out.println(getColor()+getMaterials()+"食材的"+getSize()+"尺寸"+getTaste()+"蛋糕");
    }
}
