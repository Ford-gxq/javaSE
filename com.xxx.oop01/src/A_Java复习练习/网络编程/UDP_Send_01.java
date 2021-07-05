package A_Java复习练习.网络编程;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**练习1：
 *  UDP发送数据：
 *         数据来自于键盘录入，直到输入的数据是886，发送数据结束
 * */
public class UDP_Send_01{

    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds=new DatagramSocket();
        //键盘录入数据
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入你要输入内容：");
            String str=sc.next();
            //输入的数据是886，发送数据结束
            if ("886".equals(str)){
                break;
            }else {
              //创建数据，并把数据打包
              byte[] data=str.getBytes();
              DatagramPacket dp=new DatagramPacket(data,data.length, new InetSocketAddress("localhost",10000));
                //调用DatagramSocket对象的方法发送数据
              ds.send(dp);
                //发送完毕关闭发送端
   //        ds.close();
            }
        }

    }

}
