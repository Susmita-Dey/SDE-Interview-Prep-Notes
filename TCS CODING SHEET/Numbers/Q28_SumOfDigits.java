/* Sum Of Digits of A Number
Problem Statement: Given an integer, find the sum of digits of that integer.

Example 1:
Input: N = 472
Output: 13
Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

Example 2:
Input: N = 102
Output: 3
Explanation: The digits in the number are 0, 1, and 2. Summing them up gives us a value of 3
*/

package Numbers;

import java.util.*;

public class Q28_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
        sc.close();
    }
}
