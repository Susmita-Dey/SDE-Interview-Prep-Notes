/* Permutations in which N people can occupy R seats
Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360
*/

package Numbers;

import java.util.*;

public class Q30_Permutations {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int r = sc.nextInt();
        int permutation = fact(num) / fact(num - r);

        System.out.println(permutation);
        sc.close();
    }
}
