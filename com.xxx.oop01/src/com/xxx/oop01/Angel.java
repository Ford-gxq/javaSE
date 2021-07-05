package com.xxx.oop01;

public class Angel {
//天使的特征
    String wing;
    String gender;
    String aureole;//头上有光环
    String virtuous;//善良的
    //天使的功能
    public void fly(){
        System.out.println("天使在空中飞舞...");
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAureole() {
        return aureole;
    }

    public void setAureole(String aureole) {
        this.aureole = aureole;
    }

    public String getVirtuous() {
        return virtuous;
    }

    public void setVirtuous(String virtuous) {
        this.virtuous = virtuous;
    }

}
