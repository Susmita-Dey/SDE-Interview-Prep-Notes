/* Check if a number is a Strong Number or not
Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

Note : When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
Strong number is also known as Krishnamurthi number/Peterson Number.

Examples 1:
Input: N = 145
Output: Yes
Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

Example 2:
Input:  26
Output: No
Explanation: 2! + 6! = 722. Hence 26 is not a strong number.
*/

package Numbers;

import java.util.*;

public class Q22_StrongNum {
    public static int fact(int n) {
        if (n <= 2) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num, rev = 0, sum = 0;
        while (n > 0) {
            rev = n % 10;
            sum += fact(rev);
            n = n / 10;
        }

        if (sum == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
