/* Check whether a given number is even or odd
Problem Statement: Given a number n, check whether a given number is even or odd.

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2.
*/

package Numbers;

import java.util.*;

public class Q7_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}
