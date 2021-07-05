package com.xxx.oop01;

public class AngelTest {
    public static void main(String[] args) {
        Angel angel=new Angel();
        angel.setGender("女孩");
        angel.setWing("一双翅膀");
        angel.setAureole("头顶有光环");
        angel.setVirtuous("善良的");
        System.out.println(angel.getGender()+angel.getVirtuous()+ angel.getWing()+angel.getAureole());

    }
}
