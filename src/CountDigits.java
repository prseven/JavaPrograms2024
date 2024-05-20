import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);

        int num= scanner.nextInt();
        int count =0;

        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println("No of digits is "+ count);
    }
}
