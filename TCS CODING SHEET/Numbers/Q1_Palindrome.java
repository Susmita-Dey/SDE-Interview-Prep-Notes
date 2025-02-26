package Numbers;

import java.util.Scanner;

public class Q1_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = num, rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        if (rev == num) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        sc.close();
    }
}
