/* Convert Decimal to Binary Number
Problem Statement: Convert decimal to binary number.

Example 1:
Input: N = 15
Output: 1111
Explanation: 15 in binary is represented as "1111".

Example 2:
Input: 18
Output: 10010
Explanation: 18 in binary is represented as "10010".
*/

package NumberSystem;

import java.util.*;

public class Q3_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int remainder, quotient = num;
        String binaryNum = "";

        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }

        System.out.println(binaryNum);

        sc.close();
    }
}
