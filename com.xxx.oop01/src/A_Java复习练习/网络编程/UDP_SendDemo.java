package A_Java复习练习.网络编程;

import java.io.IOException;
import java.net.*;

/**
 * UDP发送数据【用户数据报协议(User Datagram Protocol)】
 * 1. Java中的UDP通信
 *      -- UDP协议是一种不可靠的网络协议，它在通信的两端各建立一个Socket对象，但是这两个Socket只是发送，接收数据的对象，
 *         因此对于基于UDP协议的通信双方而言，没有所谓的客户端和服务器的概念
 *      -- Java提供了DatagramSocket类作为基于UDP协议的Socket
 2.DatagramSocket类的构造方法：
 *   1)构造方法：
 *        | DatagramSocket()                                            | 创建数据报套接字并将其绑定到本机地址上的任何可用端口
 *        | DatagramPacket(byte[] buf,int len,InetAddress add,int port) | 创建数据包,发送长度为len的数据包到指定主机的指定端口
 *   2)相关方法:
 *      | void send(DatagramPacket p)    | 发送数据报包
 *      | void close()                   | 关闭数据报套接字
 *      | void receive(DatagramPacket p) | 从此套接字接受数据报包
 *
 *3. 发送数据的步骤:
 *     - 创建发送端的Socket对象(DatagramSocket)
 *     - 创建数据，并把数据打包
 *     - 调用DatagramSocket对象的方法发送数据
 *     - 关闭发送端
 *4. 接收数据的步骤:
 *        - 创建接收端的Socket对象(DatagramSocket)
 *        - 创建一个数据包，用于接收数据
 *        - 调用DatagramSocket对象的方法接收数据
 *        - 解析数据包，并把数据在控制台显示
 *        - 关闭接收端
 *  构造方法：
 *      DatagramPacket(byte[] buf, int len)创建一个DatagramPacket用于接收长度为len的数据包
 *  相关方法：
 *     | byte[]  getData()         | 返回数据缓冲区
 *     | int  getLength()          | 返回要发送的数据的长度或接收的数据的长度
 *
 * */
public class UDP_SendDemo {

    public static void main(String[] args) throws IOException {
    //创建发送端的Socket对象(DatagramSocket)
     // DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
     DatagramSocket   ds=new DatagramSocket();

    //创建数据，并把数据打包
    //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
    /*构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。*/
     byte[] bytes="hello UDP! 我来了".getBytes();
     /*
     * 注意在数据报包的构造器中给数据和地址,记忆方法：数据报包裹上给数据和地址(IP+端口)
       数据报包上左二为数据，参1字节数组，参2为长度，参数三四是地址，地址包含IP+端口
     * */
      DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9000);

     //调用DatagramSocket对象的方法发送数据
     //void send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(packet);

     //关闭发送端
        ds.close();


    }


}
