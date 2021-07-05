package 网络编程.TCP协议;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
    TCP协议下的Socket编程
    TCP基于字节流传输数据
    TCP实现传输数据的基本流程: 发送端
        1.Socket定义客户端    Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
              IP与端口号是指服务器端的IP+端口
        2.准备数据
        3.IO->向服务器端输出数据
        4.关闭
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
       // 1.Socket定义客户端
        System.out.println("--------------------------我是客户端-------------------------");
        Socket client=new Socket("localhost",8989);
        System.out.println("一个客户端产生了！");
      // 2.准备数据
     String  str="我的兄弟是顺溜！";

      // 3.IO操作->向服务器端输出数据
        DataOutputStream  out=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(str);
        //刷出
        out.flush();
        //关闭
        out.close();

    }





}
