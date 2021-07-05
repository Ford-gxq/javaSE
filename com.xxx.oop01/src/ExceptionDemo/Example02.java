package ExceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
    异常一旦出现,程序无法继续执行
    但是异常如果捕获处理,不会影响程序执行
    异常处理方案:
        1.异常抛出  throws
        2.异常捕获
            try{
                有可能出现异常的代码;
            }catch(FileNotFoundException e){
                遇到对应类型 的异常执行的代码
            }catch(NullPointerException e){
                遇到对应类型 的异常执行的代码
            }....
            catch(Exception e){
                接盘侠: 不为以上catch捕获的异常执行的代码
            }finally{
                无论是否出现异常,都会执行的代码;
                一般为一些资源的关闭
            }
            一个try后面可以跟1~n个catch
            捕获大范围类型的catch应该放在最后
            如果try中一旦出现异常,try后面的代码不会执行,直接执行对应的catch
            finally : 无论是否出现异常都会执行
 */
public class Example02 {
    public static void main(String[] args) {
        System.out.println("方法开始执行");
        //异常捕获
        try{
            System.out.println("try开始执行！！");
            System.out.println(10/0);
            test();
            System.out.println("try执行结束！");
        }catch(FileNotFoundException e){
         e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("分母为0");
        }finally {
            System.out.println("finally中的代码块");
        }
        System.out.println("方法执行完毕！！");
        div(3,0);
    }

    //定义一个静态的方法test使用编译异常抛出
    static void test() throws FileNotFoundException,NullPointerException {
        //编译时异常
        InputStream is = new FileInputStream("D://README.txt");
    }
  //静态方法
    static int div(int a, int b) {
        try {
            if (b!=0) {
                return  a/b;
            }
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            System.out.println("我是finally中的代码");
        }
        return a;
    }
}
