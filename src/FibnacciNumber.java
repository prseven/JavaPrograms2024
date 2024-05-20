import java.util.Scanner;

public class FibnacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int n1= 0, n2= 1;
        int count=0, temp=0,sum=0;

        while( num <=0){
            temp = n2;
            n2 = n2 + n1;
            n1=temp;
            count++;

        }
          System.out.println("fib series are " + n2);
    }
}
