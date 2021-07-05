package 网络编程.TCP协议.练习_模拟用户登陆;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TowWayLoginServer {
    public static void main(String[] args) throws IOException {
        System.out.println("------------我是服务端---------------");
        // 1.ServerSocket 定义服务端 ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
        ServerSocket server=new ServerSocket(10000);
        // 2.阻塞式监听 Socket accept()-->服务器套接字类对象的接收方法
        Socket  client=server.accept();
        // 3.获取输入流--->读取客户端发送的数据
        System.out.println("一个客户端连接成功!");
        DataInputStream  in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
        String str=in.readUTF();
        System.out.println(str);
        // 4.处理数据
        /*分隔字符串获取到想要用户名与密码的值*/
        String username = null;
        String password = null;
        //laopei&1234
        String [] arr=str.split("&");
         username=arr[0];
         password=arr[1];

        //获取输出流-->向客户端响应结果
        DataOutputStream os = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        //校验
        if("laopei".equals(username) && "1234".equals(password)){
//            System.out.println("登录成功");
            os.writeUTF("登录成功");
        }else{
//            System.out.println("用户名或密码错误!");
            os.writeUTF("用户名或密码错误!");
        }
        //刷出
        os.flush();
        // 5.关闭
        os.close();
        in.close();
        client.close();
        server.close();

    }
}
