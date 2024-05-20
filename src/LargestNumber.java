import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the First Number");
        int n1 =  scanner.nextInt();
        System.out.println("enter the Second Number");
        int n2 = scanner.nextInt();
        System.out.println("enter the Third Number");
        int n3 = scanner.nextInt();
/*
        if(n1>n2 && n1>n3){
            System.out.println("Number 1 i.e. "+n1 +" is Largest");
        }
        else if(n2>n1 && n2>n3){
            System.out.println("number 2 i.e. "+n2+" is largest");
        }
        else {
            System.out.println("number 3 i.e. "+n3+" is largest");
        } */

        //using ternary operator
        int largest = n3 > (n1 > n2 ? n1 : n2) ? n3 : (n1 > n2 ? n1:n2);
        System.out.println("lasrgest num is " + largest);
    }



}
