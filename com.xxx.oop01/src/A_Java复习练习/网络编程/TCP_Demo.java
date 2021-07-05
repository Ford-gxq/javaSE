package A_Java复习练习.网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 一、TCP发送数据【应用】
 * 1. Java中的TCP通信
 *     - Java对基于TCP协议的的网络提供了良好的封装，使用Socket对象来代表两端的通信端口，并通过Socket产生IO流来进行网络通信。
 *     - Java为客户端提供了Socket类，为服务器端提供了ServerSocket类
 * 2. Socket构造方法:
 *         |Socket(InetAddress address,int port)  | 创建流套接字并将其连接到指定IP指定端口号
 *         | Socket(String host, int port)        | 创建流套接字并将其连接到指定主机上的指定端口号
 * 3. 相关方法:
 *         | InputStream  getInputStream()            | 返回此套接字的输入流
 *         | OutputStream getOutputStream()           | 返回此套接字的输出流
 *
 *二、TCP接收数据【应用】
 *  构造方法：
 *     ServletSocket(int port)  创建绑定到指定端口的服务器套接字
 *  相关方法：
 *      Socket accept()       监听要连接到此的套接字并接受它
 *
 * */
public class TCP_Demo {

    public static void main(String[] args) throws IOException {
   //创建客户端的Socket对象(Socket)
   // Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号
        Socket s = new Socket("127.0.0.1",10000);
    //获取输出流，写数据
    //OutputStream getOutputStream() 返回此套接字的输出流
     OutputStream out=s.getOutputStream();
     out.write("hello,tcp,我来了".getBytes());
        //释放资源
        s.close();

    }


}

