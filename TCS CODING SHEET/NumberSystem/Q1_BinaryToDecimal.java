/* Convert Binary to Decimal
Problem Statement: Convert a binary number to a decimal number.

Example 1:
Input: N = 1011
Output: 11
Explanation: 1011 when converted to decimal number is “11”.

Example 2:
Input: 100
Output: 4
Explanation: 100 when converted to decimal number is “4”.
*/

package NumberSystem;

import java.util.*;

public class Q1_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        System.out.println(dec_value);

        sc.close();
    }
}
