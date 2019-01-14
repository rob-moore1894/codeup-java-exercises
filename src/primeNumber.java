
import java.math.*;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");


        System.out.println("****** We'll check the Prime Numbers within a Range *****");
        System.out.println("Please enter a start number (Positive only): ");
        long low = scan.nextInt();
        System.out.println("Thanks.  Now enter an ending number: ");
        long high = scan.nextInt();

        while (low < high) {
            if (primeRange(low))
                System.out.print(low + " ");

            ++low;
        }

        System.out.println();
        System.out.println("***** Check to see if a number is Prime using the AKS Test *****");
        System.out.println("Please enter a number for me to check: ");
        int input = scan.nextInt();
        if (checkPrime(input)){
            System.out.println("\"" + input + "\" is Prime");
        } else {
            System.out.println("\"" + input + "\" is not Prime");
        }

    } // End of main()

    public static boolean primeRange(long num) {
        boolean flag = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    } // End of primeRange()

    public static final long[] c = new long[1000];

    public static void coef(int n) {
        {
            c[0] = 1;
            for (int i = 0; i < n; c[0] = -c[0], i++) {
                c[1 + i] = 1;

                for (int j = i; j > 0; j--)
                    c[j] = c[j - 1] - c[j];
            }
        }
    }// End of coef()

    // Method to check whether the number is prime or not
    public static boolean checkPrime(int n) {
//        // Calculating all the coefficients by the function coef and storing all the coefficients in c array .
        coef(n);
//        // subtracting c[n] and adding c[0] by 1 as ( x - 1 )^n - ( x^n - 1), here we are subtracting c[n] by 1 and adding 1 in expression.
        c[0]++;
        c[n]--;
//        // checking all the coefficients whether they are divisible by n or not.
//        // if n is not prime, then loop breaks and (i > 0).
        int i = n;
        while ((i--) > 0 && c[i] % n == 0);
//
//        //Return true if all coefficients are divisible by n.
        return i < 0;
    } // End of checkPrime


} // End of class