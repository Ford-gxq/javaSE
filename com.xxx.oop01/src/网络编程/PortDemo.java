package 网络编程;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
    端口: 区分软件
        2个字节  0~65535之间的整数
        8000以内不建议自定义使用,预留端口号
        同一协议下端口号不能冲突
        常见的端口号:
            80: http协议
            8080 : tomcat
            1521: oracle
            3306: mysql
     InetSocketAddress(套接字类) : 此类实现IP套接字地址（IP地址+端口号）
      构造方法：
     InetSocketAddress(String hostname, int port) 根据主机名和端口号创建套接字地址。
    InetSocketAddress(InetAddress addr, int port) 根据IP地址和端口号创建套接字地址。
 */
public class PortDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetSocketAddress port=new  InetSocketAddress("localhost",8080);
        System.out.println(port);
        //InetSocketAddress(InetAddress addr, int port) 根据IP地址和端口号创建套接字地址。
        InetAddress ip=InetAddress.getByName("www.baidu.com");
        InetSocketAddress Inport=new InetSocketAddress(ip,8089);
        System.out.println(Inport);
    }
}
