package jDk8新特性.testlambda01;


/**
 * 习题二:
 * 	1)声明函数式接口,接口中声明抽象方法,public String getValue(String str)
 * 	2)声明类 TestLambda,类中编写方法使用接口作为参数,讲一个字符串转成大写,并作为方法的返回值
 *  3)再将一个字符串的第2个和第4个索引位置进行截取子串
 */
public class Class002_TestLambda {
	public static void main(String[] args) {
		System.out.println(strHandler("    zhangsan ",str ->  str.trim()));;
		System.out.println(strHandler("    zhangsan ",str ->  str.toUpperCase()));;
		System.out.println(strHandler("    hahahaha ",str ->  str.substring(2,5)));;
	}
	//封装方法: 对某个字符串进行某种处理
	public static String strHandler(String str,MyFunction my){
		return my.getValue(str);
	}
}

/**
	对字符串进行处理
 */
@FunctionalInterface
interface MyFunction{
	public String getValue(String str);
}