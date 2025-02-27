/* Factors of a Given Number
Problem Statement: Find all factors of a number or find all distinct divisors of a natural number.

Example 1:
Input: n = 6
Output: 1,2,3,6
Explanation: 6 is divisible by 1,2,3,6

Example 2:
Input: n = 9
Output: 1,3,9
Explanation: 9 is divisible by 1,3,9
*/

package Numbers;

import java.util.*;

public class Q20_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }

        System.out.println();
        sc.close();
    }
}