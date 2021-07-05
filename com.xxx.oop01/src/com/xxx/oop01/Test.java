package com.xxx.oop01;

public class Test {
    public static void main(String[] args) {
        Secretary  sec=new Secretary();
        Country country=new Country();
        country.name="杭州";
        country.hotel="维纳斯";
        sec.name="张三";
        sec.gender="男";
        sec.bookciket("马云", country);

    }
}
