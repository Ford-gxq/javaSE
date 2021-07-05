package 网络编程.TCP协议.练习_模拟用户登陆;
//键盘接收用户登录的信息->客户端发送到服务器->服务器处理数据(用户名:laopei,密码:1234)->服务器本地输出结果

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TowWayLoginClient {
    public static void main(String[] args) throws IOException {
        // 1.Socket定义客户端
        System.out.println("我是客户端");
        Socket client=new Socket("localhost",10000);
    /*   // 2.准备数据---> Scanner键盘输入
        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=sc.next();
        System.out.println("请输入登陆密码:");
        String password=sc.next();
        String   data=userName+"&"+password;

     */
    /*--------------------------第二种键盘输入的方式-------------------------*/
        //2.准备数据
        //键盘输入
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名:");
        String username = rd.readLine();
        System.out.println("请输入用户密码:");
        String password = rd.readLine();

        // 3.IO操作->向服务器端输出数据
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(username+"&"+password);
        //刷出
        out.flush();
        //接收服务器响应结果
        //获取从服务器端发送过来的输入流
        DataInputStream is = new DataInputStream(new BufferedInputStream(client.getInputStream()));
        String result = is.readUTF();
        System.out.println(result);
        //关闭
        is.close();
        out.close();
        client.close();
    }

}
