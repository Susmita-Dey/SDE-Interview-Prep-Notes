/*
 * Q. Write a program to check if a given number is a perfect number or not.
 * ASKED IN TCS NQT - FIRST SHIFT - 04/10/2024
 */

import java.util.*;

public class PerfectNumber {
    public static boolean isPerfectNum(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % 2 == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfectNum(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
}
