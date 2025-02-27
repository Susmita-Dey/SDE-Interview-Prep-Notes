/* Reverse digits of a number
Problem Statement: Given an integer. Write a program to reverse digits of a number.

Example 1:
Input: N = 472
Output: 274
Explanation: Reading the number from back to front, we see that the output should be 274

Example 2:
Input: N = 470
Output: 74
Explanation: Reading the number from back to front, we get 074. For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74.
*/

package Numbers;

import java.util.*;

public class Q15_ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }

        System.out.println(rev);
        sc.close();
    }
}
