/* Factorial of a Number : Iterative and Recursive
Problem Statement: Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
Note: X  is always a positive number. 

Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1

Example 2:
Input: X = 3
Output: 6
Explanation: 3!=3*2*1
*/

package Numbers;

import java.util.*;

public class Q18_Factorial {
    public static int fact(int n) {
        if (n <= 2) {
            return n;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is: " + factorial);
        System.out.println("Factorial using recursion: " + fact(num));

        sc.close();
    }
}
