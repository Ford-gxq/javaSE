package A_Java复习练习.网络编程.TCP;
/**1. ServerSocket类
 *     该类实现服务器套接字。 服务器套接字等待通过网络进入的请求。 它根据该请求执行某些操作，然后可能将结果返回给请求者
 *2. 构造器:
 *      ServerSocket() 创建未绑定的服务器套接字。
 *      ServerSocket​(int port) 创建绑定到指定端口的服务器套接字。
 *      ServerSocket​(int port, int backlog) 创建服务器套接字并使用指定的待办事项将其绑定到指定的本地端口号。
 *      ServerSocket​(int port, int backlog, InetAddress bindAddr) 创建具有指定端口的服务器，监听backlog和要绑定的本地IP地址。
 *3. TCP基于字节流传输数据
 *     TCP实现传输数据的基本流程: 发送端
 *         1.Socket定义客户端 Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
 *               IP与端口号是指服务器端的IP+端口
 *         2.准备数据
 *         3.IO->向服务器端输出数据
 *         4.关闭
 *
 * */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.DoubleToIntFunction;

public class ServerDemo {


    public static void main(String[] args) throws IOException {

    // 1.ServerSocket 定义服务端 ServerSocket(int port) 创建绑定到指定端口的服务器套接字。
        System.out.println("---------我是服务器端-----------------");
        ServerSocket  server=new ServerSocket(10086);
    // 2.阻塞式监听 Socket accept()
       Socket  client=server.accept();
        System.out.println("一个客户端连接成功！");
    // 3.获取输入流->读取客户端发送的数据
        DataInputStream  in=new DataInputStream(new BufferedInputStream(client.getInputStream()));
    // 4.处理数据
        String str=in.readUTF();
        System.out.println(str);
    // 5.关闭和端口
        in.close();
        client.close();
        server.close();

    }
}
