import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str= "Welcome to Group Chinh sensei và những người bạn";
        // tr về độ dài
        System.out.println(str.length());
        // trả về kí tự tại vị trí index
        System.out.println(str.charAt(4));
        String str2 = " hihi";
        String newStr = str.concat(str2);
        System.out.println(newStr);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        //so sánh chuỗi
        String string1 = "helo các bạn";
        String string2 ="Helo Các bạn";
        boolean match = string1.equals(string2);
        boolean match1 = string1.equalsIgnoreCase(string2);
        System.out.println(match);
        System.out.println(match1);
        // compareTo
        String char1 = "Abbcdbvd";
        String char2 = "Abjsdbjvsbd";
        System.out.println(char1.compareTo(char2));
        System.out.println(char1.startsWith("b"));
        System.out.println(str.toLowerCase().contains("cHinH sEnsei".toLowerCase()));
        StringBuilder stringBuilder = new StringBuilder("đi học muộn");
//        StringBuilder append = stringBuilder.append(" quá 15p, phạt chống đẩy 100 cái",0,10);
//        System.out.println(append);
//        System.out.println(stringBuilder.insert(stringBuilder.length()-1," rồi đây"));
        System.out.println(stringBuilder.delete(0,5));


        //Regular expression
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        // cách 3
        boolean bool = Pattern.matches(".s","as");
        System.out.println(bool);


    }
}