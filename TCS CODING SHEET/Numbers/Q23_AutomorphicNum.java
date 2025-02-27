/* Check if a number is Automorphic Number
Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number.
*/

package Numbers;

import java.util.*;

public class Q23_AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = num * num, n = num;
        boolean isAutomorphic = true;
        
        while (n > 0) {
            if ((n % 10) != (square % 10)) {
                isAutomorphic = false;
            }
            square = square / 10;
            n = n / 10;
        }

        if (isAutomorphic) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}
