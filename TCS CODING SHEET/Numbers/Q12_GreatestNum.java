/* Greatest of two numbers
Problem Statement: Given two numbers. Find the greatest of two numbers.

Example 1:
Input: 1 3
Output: 3
Explanation: Answer is 3,since 3 is greater than 1.

Input: 1.123  1.124
Output: 1.124
Explanation: Answer is 1.124,since 1.124 is greater than 1.123.
*/

package Numbers;

import java.util.*;

public class Q12_GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double greatest = Math.max(a, b);

        System.out.println(greatest);

        sc.close();
    }
}
