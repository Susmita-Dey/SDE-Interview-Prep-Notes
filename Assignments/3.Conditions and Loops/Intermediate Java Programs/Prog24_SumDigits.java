// Q.24. Sum Of A Digits Of Number

import java.util.Scanner;

public class Prog24_SumDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num, sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("Sum of digits of " + num + " is = " + sum);

        sc.close();
    }
}
