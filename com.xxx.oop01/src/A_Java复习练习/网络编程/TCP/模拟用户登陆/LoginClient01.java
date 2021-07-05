package A_Java复习练习.网络编程.TCP.模拟用户登陆;
/**
 * 键盘接收用户登录的信息->客户端发送到服务器->服务器处理数据(用户名:laopei,密码:1234)->服务器本地输出结果
*
* */
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient01 {

    public static void main(String[] args) throws IOException {
        // 1.Socket定义客户端
        System.out.println("-----------------客户端--------------------");
        Socket  client=new Socket("localhost",8888);
        // 2.准备数据---> Scanner键盘输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name=sc.next();
        System.out.println("请输入密码:");
        String password=sc.next();
        String data=name+"&"+password;
        // 3.IO操作->向服务器端输出数据
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        // void writeUTF​(String str) 使用 modified UTF-8编码以与机器无关的方式将字符串写入基础输出流。
        out.writeUTF(data);
        //刷出
       out.flush();

        //关闭输出流和客户端
       out.close();
       client.close();

    }

}
