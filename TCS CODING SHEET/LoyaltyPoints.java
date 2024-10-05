/*
 * TCS NQT - 05/10/2024
 *  Q.1 write a code you are given an integer return true if sum of the digits is multiple of 3 else return false.
 * Input: 123
 * Output: True
 * Input: 235
 * Output: False
 */

import java.util.Scanner;

public class LoyaltyPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your loyalty points: ");
        int points = sc.nextInt();

        int sum = 0;
        while (points != 0) {
            sum = sum + points % 10;
            points = points / 10;
        }

        if (sum % 3 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
