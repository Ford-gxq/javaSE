package homework_5_24;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

/**
 * 1) javabean类
 * 		Trader（交易员）: 姓名 工作城市
 * 		Transaction（交易记录）: 交易员  交易年份 交易金额
 * 	2) 实现
 * 		(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
 * 		(2) 交易员都在哪些不同的城市工作过？
 * 		(3) 查找所有来自于剑桥的交易员，并按姓名排序。
 * 		(4) 返回所有交易员的姓名字符串，按字母顺序排序。
 * 		(5) 有没有交易员是在米兰工作的？
 * 		(6) 打印生活在剑桥的交易员的所有交易额。
 * 		(7) 所有交易中，最高的交易额是多少？
 * 		(8) 找到交易额最小的交易。
 * */
public class Demo01 {
    public static void main(String[] args) {
        // 创建了5个交易员对象
        Trader Tom = new Trader("Tom", "New York");
        Trader Mack= new Trader("Mack", "London");
        Trader Alan = new Trader("Alan", "Cambridge");
        Trader Brian = new Trader("Brian", "Cambridge");
        Trader Jon=new Trader("Jon","Milan");
       // 创建6条交易记录，存入list集合
        SimpleDateFormat simple=new SimpleDateFormat("yyyy-MM");
        List<Transaction> list = Arrays.asList(
        new Transaction(Tom,2011,150000),
        new Transaction(Mack,2013,180000),
        new Transaction(Alan,2011,160000),
        new Transaction(Brian,2014,150000),
        new Transaction(Jon,2013,170000)
        );
        //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）
        list.stream().filter(t->t.getYear()==2012).forEach(System.out::println);
        //(2) 交易员都在哪些不同的城市工作过？
        System.out.println("-------------------交易员都在哪些不同的城市工作过---------------------");
       list.stream().map(t -> t.getTrader().getCity()).collect(Collectors.toSet()).forEach(System.out::println);

       //3.查找来自剑桥的交易员,排序
        System.out.println("-----------查找来自剑桥的交易员,排序--------------");
        list.stream()
                .map(t->t.getTrader())//获取交易员对象
                .filter(t->"Cambridge".equals(t.getCity()))//过滤
                .distinct()//去重
                .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))//排序
                .forEach(System.out::println);
        //(4) 返回所有交易员的姓名字符串，按字母顺序排序
        System.out.println("--------------返回所有交易员的姓名字符串，按字母顺序排序-------------");
        String traderStr=
                list.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        String traderStr1 =
                list.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(joining());
        System.out.println(traderStr);
   //(5) 有没有交易员是在米兰工作的？
        boolean milanBased =
                   list.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                .getCity()
                                .equals("Milan"));
        System.out.println("有没有交易员在米兰工作过："+milanBased);
        // 6. 打印生活在剑桥的交易员的所有交易额
        System.out.println("----------打印生活在剑桥的交易员的所有交易额-------------");
               list.stream()
                       .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                       .map(Transaction::getAmount)
                       .forEach(System.out::println);
        // 7. 所有交易中，最高的交易额是多少？
        System.out.println("----------所有交易中，最高的交易额是:-----------------");
        Optional<Transaction> maxAmount= list.stream().max((t1,t2)->Double.compare(t1.getAmount(),t2.getAmount()));
        System.out.println(maxAmount);
//        list.stream().map(Transaction::getAmount)
//                        .reduce(Integer::max);

        // 8. 找到交易额最小的交易。
        Optional<Transaction> smallestTransaction =
                list.stream()
                        .reduce((t1, t2) ->
                                t1.getAmount() < t2.getAmount() ? t1 : t2);
        Optional<Transaction> smallestTransaction1 =
                list.stream()
                        .min(comparing(Transaction::getAmount));


   }
}

//交易员类  Trader（交易员）: 姓名 工作城市
//  		Transaction（交易记录）: 交易员  交易年份 交易金额
 class Trader{
    private  String name;
    private  String city;

    //构造方法
    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}

//交易数据类  Transaction（交易记录）: 交易员  交易年份 交易金额
class Transaction{
    private  Trader trader;
    private int year;
    private  int amount;

//构造器
    public Transaction(Trader trader, int year, int amount) {
        this.trader = trader;
        this.year = year;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
   }

