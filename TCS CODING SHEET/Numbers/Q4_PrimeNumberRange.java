/* Prime Numbers in a given range
Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

Examples:
Input: 2 10
Output: 2 3 5 7 
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13 
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.
*/

package Numbers;

import java.util.*;

public class Q4_PrimeNumberRange {
    public static boolean checkPrime(int num) {
        if (num <= 1)
            return false;
            
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
