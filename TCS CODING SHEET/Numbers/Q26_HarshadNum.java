/* Check if the given number is Harshad(Or Niven) Number
Problem Statement: Check if the number is a Harshad(or Niven) number or not.

Example 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No
 it is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.
*/

package Numbers;

import java.util.*;

public class Q26_HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        if (num % sum == 0) {
            System.out.println("Yes, it is a Harshad number.");
        } else {
            System.out.println("No, it is not a Harshad number.");
        }

        sc.close();
    }
}
