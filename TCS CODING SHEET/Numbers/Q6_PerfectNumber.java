package Numbers;
/*
 * Q. Write a program to check if a given number is a perfect number or not.
 * ASKED IN TCS NQT - FIRST SHIFT - 04/10/2024
 * A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason:
For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+4+7+14) is equal to the respective numbers and for 15 it is not.
*/

import java.util.*;

public class Q6_PerfectNumber {
    public static boolean isPerfectNum(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();

        if (isPerfectNum(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
}
