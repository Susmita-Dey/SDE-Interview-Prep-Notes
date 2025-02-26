/* Check if a number is Armstrong Number or not
Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
Example 2:
Input:N = 371
Output: True
Explanation: 3^3+5^3+1^3 = 27 + 343 + 1 = 371
*/

package Numbers;

import java.util.*;

public class Q5_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = num, rev = 0, count = 0, sum = 0;

        count = String.valueOf(num).length();
        // while (n > 0) {
        // n = n / 10;
        // count++;
        // }

        // n = num;
        while (n > 0) {
            rev = n % 10;
            sum += Math.pow(rev, count);
            n = n / 10;
        }

        if (num == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
