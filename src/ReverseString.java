import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("enter the String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String rev="";
        int len=str.length();

        for (int i = len-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is " + rev);
    }
}
