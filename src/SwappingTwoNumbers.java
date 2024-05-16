public class SwappingTwoNumbers {
    public static void main(String[] args) {

        int a=100, b=20;

        // 1. Swapping using temp variable
        System.out.println( "Before Swapping using temp a="+a + " & b=" +b);
        int temp = a;
        a=b;
        b=temp;

        System.out.println( "After Swapping a="+a + " & b=" +b);

        // 2. Swapping using + & -
       System.out.println( "Before Swapping using + & - a="+a + " & b=" +b);
        a = a+b;  //10+20=30
        b = a-b;//30-20=10
        a = a-b;  //30-10=20
        System.out.println( "After Swapping a="+a + " & b=" +b);

        //3. Swapping using * & /

        System.out.println( "Before Swapping using * & / a="+a + " & b=" +b);
        a = a*b;
        b= a/b;
        a = a/b;
        System.out.println( "After Swapping using * & / a="+a + " & b=" +b);

        // Swapping using bitwise XOR operator
        System.out.println( "Before Swapping using XOR a="+a + " & b=" +b);
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println( "After Swapping using XOR a="+a + " & b=" +b);

       // 5. Swapping uisng a single statment of line
        // a=10, b= 20 ,  operation is done from right to left  so (a=b) is 20 i.e. a=20, then next a+b is
        b= a + b - (a=b);
        System.out.println( "After Swapping using single statement a="+a + " & b=" +b);

    }
}
