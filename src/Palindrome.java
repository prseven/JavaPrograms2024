import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the nummber to check if it is palindrome!!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int originalNumber =num;
        int rev =0;

        while(num!=0){
            rev = rev*10 + num % 10;
            num = num/10;

        }
        System.out.println("rev is "+ rev);

        if(originalNumber == rev){
            System.out.println("Number is palindrome!!");

        } else {
            System.out.println("Number is not a palindrome!!");
        }
    }

}
