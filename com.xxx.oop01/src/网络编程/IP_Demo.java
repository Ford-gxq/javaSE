package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
    网络编程:
        关注底层数据的传输
    网页编程:
        关注上层的应用
    节点: 定位电子设备(手机,电脑,路由器,平板...)
    节点与节点之间组成网络,分大网络小网络, 分内网,外网,公网,局域网..
    IP: 表示定义节点,定位电子设备(手机,电脑,路由器,平板...)
        IPV4(4个字节)   IPV6
        非注册IP : 供组织内部使用  192.168.0.0~192.168.255.255
        本地IP: 127.0.0.1 | localhost
        域名: 人对字符敏感
            IP与域名之间通过DNS解析器进行解析
    java提供了一个net包:
        InetAddress(类) : 定义IP
            static InetAddress getLocalHost() 返回本地主机的地址。
            static InetAddress getByName(String host) 根据主机名称确定主机的IP地址。
            String getHostAddress() 返回文本表示中的IP地址字符串。
            String getHostName() 获取此IP地址的主机名。
    端口: port 区分软件
    url : 同一资源定位符
    传输层协议: 规范,标准,相当于合同  *****
        UDP: 写信|邮快递  效率高,不安全 无需连接即可通讯
        TCP: 打电话      安全,效率低   面向连接的传输协议
 */
public class IP_Demo {
    public static void main(String[] args) throws UnknownHostException {
        //获取本地直接的IP  static InetAddress getLocalHost() 获取本地主机的IP地址。
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println(ip.getAddress());
        System.out.println(ip.getHostName());
        //获取之指定域名|IP的InetAddress对象  static InetAddress getByName​(String host) 根据主机名称确定主机的IP地址
        InetAddress ip2=InetAddress.getByName("www.taobao.com");
        System.out.println(ip2);
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
    }


}
