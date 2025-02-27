/* Check if the number is an abundant number or not.
Problem Statement: Check if the number is an abundant number or not.

Example 1:
Input: 18
Output: Abundant Number
Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

Example 2:
Input: 21
Output: Not Abundant Number
Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 21 is not an abundant number.

Definition: If the sum of divisors of a number is greater than the number then it is called abundant number.
*/

package Numbers;

import java.util.*;

public class Q27_AbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                // System.out.println("i = " + i);
                sum += i;
                // System.out.println("sum = " + sum);
            }
        }

        // System.out.println(num);
        // System.out.println(sum);

        if (sum > num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not Abundant Number");
        }

        sc.close();
    }
}
