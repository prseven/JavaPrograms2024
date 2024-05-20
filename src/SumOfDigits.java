import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit=0;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num /10;
        }
        System.out.println("sum of digits of number is " + sum);
    }
}
