package 网络编程.TCP协议.练习_模拟用户登陆;
/**
 * Java对基于TCP协议的的网络提供了良好的封装，使用Socket对象来代表两端的通信端口，
 *       并通过Socket产生IO流来进行网络通信。
 * Java为客户端提供了Socket类，为服务器端提供了ServerSocket类

 * */
import java.io.*;
import java.net.Socket;
import java.sql.ResultSet;

public class TowWayLoginClient01 {
    public static void main(String[] args) throws IOException {
        // 1.使用Socket类，定义客户端通讯端口
        System.out.println("---------我是客户端--------");
        Socket client=new Socket("localhost",9000);
        System.out.println("----一个客户端产生！-----");
        //2.准备数据
        //键盘输入
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String username=rd.readLine();
        System.out.println("请输入密码:");
        String  password=rd.readLine();
        // 3.IO操作->向服务器端输出数据
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(username+"&"+password);
        //刷出
        out.flush();
        //接收服务器响应结果
        //获取从服务器端发送过来的输入流
        DataInputStream in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
        String result =in.readUTF();
        System.out.println(result);
        //关闭
        in.close();
        out.close();
        client.close();


    }
}
