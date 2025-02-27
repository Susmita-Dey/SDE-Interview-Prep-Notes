/* Replace all the 0’s with 1 in a given integer
Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

Example 1:
Input: N = 102003
Output: 112113
Explanation: The 2nd, 4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

Example 2:
Input:  204
Output: 214
Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.
*/

package Numbers;

import java.util.*;

public class Q32_ZeroesToOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int rem = 0, ans = 0, tmp = 1;
        while (num > 0) {
            rem = num % 10;
            if (rem == 0) {
                rem = 1;
            }
            ans += rem * tmp;
            // System.out.println(ans);
            num = num / 10;
            tmp = tmp * 10;
        }

        System.out.println(ans);

        sc.close();
    }
}
