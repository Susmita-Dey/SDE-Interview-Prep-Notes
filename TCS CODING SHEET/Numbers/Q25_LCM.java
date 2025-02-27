/* Find LCM of two numbers
Problem Statement: Find lcm of two numbers.

Example 1:
Input: num1 = 4,num2 = 8
Output: 8

Example 2:
Input: num1 = 3,num2 = 6
Output: 6
*/

package Numbers;

import java.util.*;

public class Q25_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = 0, lcm = 0, a = num1, b = num2;

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (b == 0) {
            gcd = a;
        } else {
            gcd = b;
        }

        lcm = (num1 * num2) / gcd;
        System.out.println(lcm);
        sc.close();
    }
}
