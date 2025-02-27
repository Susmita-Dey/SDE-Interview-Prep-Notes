/* Express given number as Sum of Two Prime Numbers
Problem: Given a number n, express the number as a sum of 2 prime numbers.

Example 1:
Input : N = 13
Output : True . 
Explanation: 74 can be expressed as 11 + 2 and both are prime numbers. 

Example 2:
Input : N = 11
Output : False. 
Explanation: 11 cannot be expressed as sum of two prime numbers.
*/

package Numbers;

import java.util.*;

public class Q33_SumOfPrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isPrime(num) && isPrime(num - 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
