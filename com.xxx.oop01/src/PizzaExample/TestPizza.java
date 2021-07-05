package PizzaExample;

import java.util.Scanner;

//测试类
public class TestPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要制作的Pizza\n\t1.培根披萨\n\t2.海鲜披萨");
        int num = sc.nextInt();
        System.out.println("请输入pizza大小");
        int size = sc.nextInt();
        System.out.println("请输入pizza价格");
        double price = sc.nextDouble();

        //多态
        Pizza pizza = null;
        if(num==1){
            System.out.println("请输入培根克数：");
            int weight = sc.nextInt();
            pizza = new PgPizza("培根披萨",price,size,weight);
        }else{
            System.out.println("请输入配料信息");
            String info = sc.next();
            pizza = new SeaPizza("海鲜披萨",price,size,info);
        }
        pizza.show();
    }
}
