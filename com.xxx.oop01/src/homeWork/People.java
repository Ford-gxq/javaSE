package homeWork;
/**
 * 定义一个网络用户类，要处理的信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入，
 * 其中用户 ID 和用户密码必须写，如果email缺省时 email地址是用户 ID加上字符串"@gameschool.com"。
 *
 ***/
public class People {
 private String id;
 private String password;
 private  String email;
 //无参构造
    public People(){}
 //有参构造
  public People(String  Pid,String pwd,String Pemail){
        this.id=Pid;
        this.password=pwd;
        this.email=Pemail;
  }
    public People(String id,String password){
        this.id = id;
        this.password=password;
        this.email=id+"@gameschool.com";
    }
    public void show() {
        System.out.println("ID编号："+this.id);
        System.out.println("密码："+this.password);
        System.out.println("邮件："+this.email);
    }
    public static void main(String[] args) {
        //调用全参构造
        People p1 = new People("001","123456","zhangsan@163.com");
        p1.show();
        //调用无参构造
        People p2 = new People("002","123456");
        p2.show();
    }

}
