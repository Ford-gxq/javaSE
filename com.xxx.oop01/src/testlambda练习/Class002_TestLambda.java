package testlambda练习;

import 内部比较器_外部比较器.Comparator;
/**
 * 习题二:
 * 	1)声明函数式接口,接口中声明抽象方法,public String getValue(String str)
 * 	2)声明类 TestLambda,类中编写方法使用接口作为参数,将一个字符串转成大写,并作为方法的返回值
 *  3)再将一个字符串的第2个和第4个索引位置进行截取子串
 */
public class Class002_TestLambda {
	public static void main(String[] args) {
	System.out.println(operatorString("    zhangsan ",str ->  str.trim()));
	System.out.println(operatorString(" zhangsanlis",str->str.toUpperCase()));
	System.out.println(operatorString("heihei",str->str.substring(2,5)));

	}
//封装方法: 对某个字符串进行某种处理
/**
 * 操作字符串的方法：参数1是要操作的字符串类型，参数2是一个自定义的接口类型
 *     方法功能是返回一个实现接口类调用getValue()方法执行的结果
 * */
	public static String  operatorString(String str,MyFuction my){
		return  my.getValue(str);
	}
}

/**
 对字符串进行处理
 */
@FunctionalInterface
interface MyFuction {
	public String getValue(String str);
}