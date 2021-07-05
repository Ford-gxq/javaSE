package A_Java复习练习.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
    UDP接收数据：
        因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class UDP_Receive_02{
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10000);
        while (true) {
            //创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys,0,bys.length);
            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);
            //解析数据包，并把数据在控制台显示
            //byte[] getData() 返回数据缓冲区。
            //int getLength() 返回要发送的数据的长度或接收的数据的长度。
            System.out.println("接收到的数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端
//        ds.close();
    }
}