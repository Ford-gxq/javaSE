package 递归算法小练习;

public class Demo2{
    public static void main(String[] args) {
//        getFactorial(4);
        move(4,"A","B","C");
    }
    /**
     * 汉诺塔问题
     *
     * @param dish 盘子个数(也表示名称)
     * @param from 初始塔座
     * @param temp 中介塔座
     * @param to   目标塔座
     */
    public static void move(int dish, String from, String temp, String to) {
        if (dish == 1) {//圆盘只有一个的时候 将其从a移动到c
            System.out.println("将盘子" + dish + "从塔座" + from + "移动到目标塔座" + to);
        }else {
            move(dish-1,from,to,temp);//a为初始塔座，b为目标塔座，c为中介塔座
            System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标"+to);//把a上面的最下面的一个盘子移到c上面
            move(dish-1,temp,from,to);//b为初始塔座，c为目标塔座，a为中介塔座
        }
    }

}
