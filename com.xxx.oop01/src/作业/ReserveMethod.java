package 作业;

public class ReserveMethod {
    public static void main(String[] args) {
        ReserveMethod r = new ReserveMethod();
        r.reverseChatAt("javaguides");
    }
    public String reverseChatAt(String string) {
        final StringBuilder builder = new StringBuilder();
        for (int i = (string.length() - 1); i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        display(string, builder.toString());
        return builder.toString();
    }
    private void display(String input, String output) {
        System.out.println(" input string : " + input);
        System.out.println(" output string : " + output);
    }
}
