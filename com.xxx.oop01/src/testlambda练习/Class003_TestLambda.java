package testlambda练习;
/**
 * 习题三:
 * 	1)声明一个带两个泛型的函数式接口,发型类型为<T,R> T为参数,R为返回值
 * 	2)接口中声明对应抽象方法
 *  3)在TestLambda类中声明方法,参数三个,两个long类型的参数,接口作为参数,接口实现中计算两个long型参数的和
 *  4)再计算两个long型参数的乘积
 */
public class Class003_TestLambda {
	public static void main(String[] args) {
		System.out.println(result(100L,200L,(x,y)->x+y));
		System.out.println(result(100L,200L,(a,b)->a*b));
		System.out.println(result(200L,300L,(a,b)->a-b));
	}

//定义一个静态方法，对两个Long类型的数据进行运算,返回结果 : 运算的规则行为以接口形式作为参数传递
public static Long result(Long L1,Long L2,MyFuction2<Long,Long> my){
		return my.calculate(L1,L2);
}

}
//定义一个接口用于计算两个泛型类型的运算
interface MyFuction2<T,R>{
	public R calculate(T t1, T t2);
}