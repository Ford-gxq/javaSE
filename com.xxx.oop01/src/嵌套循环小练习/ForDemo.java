package 嵌套循环小练习;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + '\t');
            }
            System.out.println();
        }
        System.out.println("----------------------");
        /**九九乘法表先打印一行：
         *  1*2=2  2*2=4  2*3=6  2*4=8  2*5=10  2*6=12  2*7=14  2*8=16  2*9=18
         *
         *  for (int i=1;i<=9;i++){
         *      System.out.print(i+"*"+2+"="+(i*2)+"\t");
         *
         *  }
         *
         */
        for (int n = 1; n <= 9; n++) {//n控制列
            for (int i = 1; i <= n; i++) {//i控制行
                System.out.print(i + "*" + n + "=" + (i * n) + "\t");
            }
            System.out.println();
        }
        //1到100以内的奇数和、偶数和
        int oddSum = 0, evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;

            }

        }
        System.out.println("100以内的奇数和为：" + oddSum);
        System.out.println("100以内的偶数和为：" + evenSum);
        System.out.println("-----------------");
        //1到1000中被5整除的数，每行输出5个数
        int count=0;//定义一个计数器
        for (int m= 0; m <=1000; m++) {
             if (m%5==0){
                 System.out.print(m+"\t");
                 count++;
             }
/**            if (m%25==0){//满足每5个输出一行的要求
               System.out.println();
 *           }
*/
             if(count==5){
                 System.out.println();
                 count=0;
            }
        }
    }


}

