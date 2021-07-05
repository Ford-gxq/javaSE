package homework_5_16;

public class SensitiveWord_StringDemo {
    public static void main(String[] args) {

        String [] sensibilityWord=new String  []{"性", "色情", "爆炸", "恐怖", "枪", "军火"};
        String str="美国的恐怖，爆炸、强奸、枪支军火和色情泛滥，黑人的命很卑微！";
        for (int i= 0; i < sensibilityWord.length; i++) {
            str = str.replace(sensibilityWord[i], "#");

        }
        System.out.println(str);

        //String substring​(int beginIndex) 返回一个字符串，该字符串是此字符串的子字符串。
        String str1="ABCDE";

        System.out.println(str1.substring(3));

        System.out.println(str1.concat("XYZ"));;

        System.out.print(str1);



    }

}
