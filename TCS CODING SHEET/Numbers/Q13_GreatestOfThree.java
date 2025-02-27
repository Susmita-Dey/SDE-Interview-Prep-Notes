/* Greatest of three numbers
Problem Statement: Given three numbers. Find the greatest of three numbers.

Example 1:
Input: 1 3 5
Output: 5
Explanation: Answer is 5.Since 5 is greater than 1 and 3.

Example 2:
Input: 1.123 1.124 1.125
Output: 1.125
Explanation: Answer is 1.125. Since 1.125 is greater than 1.123 and 1.124
*/

package Numbers;

import java.util.*;

public class Q13_GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double greatest = Math.max(Math.max(a, b), c);

        System.out.println(greatest);

        sc.close();
    }
}
