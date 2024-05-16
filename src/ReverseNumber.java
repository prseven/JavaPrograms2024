import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rev=0;
        while(num!=0)
        {
            rev = rev*10 + num % 10;
            num = num /10;
        }
        System.out.println("Reverse of number = " + rev);

    }
}
