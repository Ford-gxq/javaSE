package 作业;

/**
 * 字符串反转
 * 1. 利用 StringBuffer 或 StringBuilder 的 reverse 成员方法
 * 2. 利用 String 的 toCharArray 方法先将字符串转化为 char 类型数组，然后将各个字符进行重新拼接
 * 3. 利用 String 的 CharAt 方法取出字符串中的各个字符
 *
 * */
class Excercise05 {
    //使用 StringBuilder
    public static void main(String[] args) {
       Excercise05 m = new Excercise05();
        m.reverseMethod("javaguides");
    }
    public String reverseMethod(String string) {
        final StringBuilder builder = new StringBuilder(string);
        display(string, builder.reverse().toString());
        return builder.reverse().toString();
    }
    private void display(String input, String output) {
        System.out.println(" input string :: " + input);
        System.out.println(" output string :: " + output);
    }
}