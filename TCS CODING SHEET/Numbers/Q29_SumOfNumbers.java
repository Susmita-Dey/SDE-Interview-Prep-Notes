/* Find the sum of numbers in the given range
Problem Statement: Find the sum of numbers in the given range.

Example 1:
Input: l=2, r=7
Output: 27
Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

Example 2:
Input: l=5, r=9
Output: 35
Explanation: 5+6+7+8+9=35. Therefore 35 is the answer.
*/

package Numbers;

import java.util.*;

public class Q29_SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;

        for (int i = l; i <= r; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
        sc.close();
    }
}
