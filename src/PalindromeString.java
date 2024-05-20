import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.next();

        //String originalString = str;
        String rev = "";
        int len = str.length()-1;

        for (int i = len; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Rev "+ rev);
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        } else{
            System.out.println("String is not palindrome");
        }
    }


}
