package 网络编程.UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 1. 传输层协议:  数据在网络中进行传输满足的要求,规范
        UDP : 相当于写信,邮包裹  非面向连接   协议简单,开销小,效率高   大小由限制 一般 不超过60k    发送端与接收端平等的
        TCP : 相当于打电话   面向连接    数据安全可靠  但是效率较低    基于三次握手   大小没有限制   客户端与服务器端
 2.  Socket : 套接字
            传输层为应用层开辟的一个小口子
            不同的协议下Socket的实现不同
            面向Socket编程
 3.  UDP实现Socket编程:
        DatagramSocket 此类表示用于发送和接收数据报包的套接字。
        DatagramPacket 数据报包
        基于字节数组进行传输

 4.  UDP实现传输基本流程: 发送端
        1.定义我是发送端  DatagramSocket(int port)
        2.准备数据
        3.打包  DatagramPacket(byte[] buf, int offset, int length, SocketAddress address)
        4.发送  void send(DatagramPacket p)
        5.关闭

 */
public class DatagramSocket_Send {
    public static void main(String[] args) throws IOException {
        //  1.定义发送端  DatagramSocket(int port)
        DatagramSocket clinet=new DatagramSocket(9000);
        //  2.准备数据-->数据发送是基于字节数组的
        byte[] bytes="我是一个中国人".getBytes();

        //  3.打包  DatagramPacket(byte[] buf, int offset, int length, SocketAddress address)
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",10000));
        //   4.发送  void send(DatagramPacket p)
        clinet.send(packet);
        //   5.关闭
        clinet.close();
    }

}
