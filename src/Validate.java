

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
       // nhập vào email
        while (true){
            System.out.println("Nhập email của bạn");
            String email = new Scanner(System.in).nextLine();
            if(!checkEmail(email)){
                System.err.println("nhập email không đúng định dạng , vui lòng nhập lại");
            }else {
                System.out.println(email);
                break;
            }
        }
    }
    public static boolean checkEmail(String email){
        String pattern ="^[a-zA-Z0-9_!#$%&'*+/=?``{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return Pattern.matches(pattern,email);
//        return email.matches(pattern);
    }
}
