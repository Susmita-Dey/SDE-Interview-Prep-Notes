/* Sum of first N Natural Numbers
Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
*/

package Numbers;

import java.util.*;

public class Q9_SumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
}
