/* Calculate the Power of a Number : Binary Exponentiation
Problem Statement: Given a number N, return all primes till N.

Example 1:
Input:x = 2, n = 5
Output:32
Explanation: Calculate pow(2, 5) = 25 = 2*2*2*2*2 = 32
Example 2:
Input:x = 21, n = 2
Output: 441
Explanation:  Calculate pow(21, 2) = 212 = 21*21 = 441
*/

package Numbers;

import java.util.Scanner;

public class Q19_PowerOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int power = sc.nextInt();

        int res = 1;
        for (int i = 0; i < power; i++) {
            res = res * num;
        }
        System.out.println(res);

        sc.close();
    }
}
