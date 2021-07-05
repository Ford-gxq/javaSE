package A_Java复习练习.网络编程;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 *InetSocketAddress(套接字类) : 此类实现IP套接字地址（IP地址+端口号）
 *    构造方法：
 *       InetSocketAddress(String hostname, int port)根据主机名和端口号创建套接字地址。
 *       InetSocketAddress(InetAddress addr, int port)根据IP地址和端口号创建套接字地址。
 *
 * */
public class InetScoketAddress_Demo {

    public static void main(String[] args) throws UnknownHostException {
        InetSocketAddress port=new  InetSocketAddress("localhost",8088);
        System.out.println(port);
        //InetSocketAddress(InetAddress addr, int port) 根据IP地址和端口号创建套接字地址。
        InetAddress ip=InetAddress.getByName("www.baidu.com");
        InetSocketAddress Inport=new InetSocketAddress(ip,8089);
        System.out.println(Inport);
    }

}
