import java.util.Scanner;

public class OddnEvenDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int oddCount =0 ,evenCount=0;
        int evenSum = 0, oddSum=0;

        while(num > 0)
        {
         int rem = num % 10;
         if(rem % 2 == 0){
             evenCount++;
             evenSum += rem;
         }else {
             oddCount++;
             oddSum += rem;
         }
         num = num/10;
        }
        System.out.println("EvenCount is " + evenCount);
        System.out.println("OddCount is " + oddCount);

        System.out.println("EvenSum is " + evenSum);
        System.out.println("OddSum is " + oddSum);
    }

}
