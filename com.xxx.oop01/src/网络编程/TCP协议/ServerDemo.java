package 网络编程.TCP协议;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 TCP协议下的Socket编程
        TCP实现传输数据的基本流程: 服务端
        1.ServerSocket 定义服务端 ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
        2.阻塞式监听 Socket accept()
        3.获取输入流->读取客户端发送的数据
        4.处理数据
        5.关闭
 */

public class ServerDemo {
    public static void main(String[] args) throws IOException {
    // 1.ServerSocket 定义服务端 ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
        System.out.println("------------我是服务端---------------");
        ServerSocket server=new ServerSocket(8989);
   // 2.阻塞式监听 Socket accept()
       Socket  client= server.accept();
        System.out.println("一个客户端连接成功!!!!");
   // 3.获取输入流->读取客户端发送的数据
        DataInputStream in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
   // 4.处理数据
       String str=in.readUTF();
        System.out.println(str);
   // 5.关闭
        in.close();
        client.close();
        server.close();
    }

}
