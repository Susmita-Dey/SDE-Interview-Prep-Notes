/* Maximum and Minimum Digit in a Number
Problem Statement: Given a number N, print the smallest and largest digits present in the number.

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.
*/

package Numbers;

import java.util.*;

public class Q16_MaxMinDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0, maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE;

        while (num > 0) {
            rem = num % 10;
            if (rem > maxNum) {
                maxNum = rem;
            }
            if (rem < minNum) {
                minNum = rem;
            }
            num = num / 10;
        }

        System.out.println("Largest digit : " + maxNum);
        System.out.println("Smallest digit : " + minNum);

        sc.close();
    }
}
