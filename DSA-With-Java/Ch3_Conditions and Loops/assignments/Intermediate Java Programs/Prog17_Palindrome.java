// Q.17. Find if a number is palindrome or not 

import java.util.Scanner;

public class Prog17_Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num, sum = 0;
        while (n > 0) {
            sum = (sum * 10) + (n % 10);
            n = n / 10;
        }

        if (num == sum) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        sc.close();
    }
}