package 作业;
/**
 * 练习题
 * 	    A:模拟用户登录
 *  	B:字符串遍历
 *  	C:统计字符串中大写，小写及数字字符的个数
 *  	D:把字符串的首字母转成大写，其他小写
 *  	F:字符串反转
 *  	G:统计大串中小串出现的次数
 *  	H: 判断一个字符串是否对称
 *  	I: 不使用系统功能实现字符串内容翻转
 */
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/**
 * 模拟用户登录，键盘录入Scanner；
 * 给三次机会用循环，for；
 * 提示还有多少机会用判断，if…...else。
 * 注：如果常量与字符串变量比较，通常都是字符串常量调用方法，将变量作为参数传递，防止空指针异常
 * 如 “admin”.equals (userName) && “admin”.equals (password)
 *
 * */
public class Exercise1 {
    public static void main(String[] args) {
        //1.模拟用户登录
        //创建键盘录入对象
        Scanner sc=new Scanner(System.in);

        //如果常量与字符串变量比较，通常都是字符串常量调用方法，将变量作为参数传递，防止空指针异常
    for (int i=0;i<3;i++){
        //将键盘录入的用户名存储在userName
        System.out.println("请输入姓名：");
        String  userName=sc.nextLine();
        //将键盘录入的密码存储在password
        System.out.println("请输入密码：");
        String password=sc.nextLine();
        if("admin".equals(userName)&& "password".equals(password)){
            System.out.println("欢迎"+userName+"登陆成功！");
            break; //跳出循环
        }else
        if (i == 2){
            System.out.println ("本次机会已经用完请明天再来");
        }
        else{
            System.out.println ("录入错误，还剩下" + (2 - i) + "次机会");//剩下机会提示
        }

    }


   }

}
