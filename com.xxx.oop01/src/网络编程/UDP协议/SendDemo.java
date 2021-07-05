package 网络编程.UDP协议;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //  1.定义发送端  DatagramSocket(int port)
        DatagramSocket send1=new DatagramSocket(8888);

        //  2.准备数据-->数据发送是基于字节数组的
        byte [] data=new byte[1024];
        FileInputStream fi=new FileInputStream("D://haha.txt");
        //定义一个变量记录每次读取的数据的长度
        int len=-1;
        while ((len=fi.read(data))!=-1){
           fi.read(data);
        }
        //  3.打包  DatagramPacket(byte[] buf, int offset, int length, SocketAddress address)
        DatagramPacket packet=new DatagramPacket(data,0,data.length,new InetSocketAddress("localhost",10000));
        //   4.发送  void send(DatagramPacket p)
        send1.receive(packet);
        //   5.关闭
        send1.close();
    }
}
