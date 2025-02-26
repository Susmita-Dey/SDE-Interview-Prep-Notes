/* Check whether a number is positive or negative
Problem statement: Given a number n check whether it's positive or negative.

Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative
*/

package Numbers;

import java.util.*;

public class Q8_PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        sc.close();
    }
}
