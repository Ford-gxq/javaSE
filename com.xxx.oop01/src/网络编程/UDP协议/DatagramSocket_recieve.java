package 网络编程.UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
     UDP实现传输基本流程: 接收端
        1.定义我是接收端
        2.准备一个包裹,用来接收数据
        3.处理数据
        4.关闭

 */
public class DatagramSocket_recieve {
    public static void main(String[] args) throws IOException {
        //1.定义我是接收端-->DatagramSocket(int port)
        DatagramSocket recieve=new DatagramSocket(10000);

        //2.准备一个包裹,用来接收数据--->定义一个字节数组接受数据;
        byte[] arr = new  byte[1024];
        DatagramPacket packet = new DatagramPacket(arr,0,arr.length);
        //接收数据--->阻塞式接收，套接字对象.receive()
        recieve.receive(packet);
        //3.处理数据
        //byte[] getData() 返回数据缓冲区。
        //int getLength() 返回要发送的数据的长度或接收的数据的长度。
        byte[] data = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(data,0,len));
       // 4.关闭
       recieve.close();
    }
}
