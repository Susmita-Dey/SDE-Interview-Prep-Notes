/* Print Fibonacci Series up to Nth term
Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6
Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
*/

package Numbers;

import java.util.*;

public class Q17_FibonacciSeries {
    public static void fib(int n) {
        if (n == 0) {
            System.out.print(n + " ");
        } else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");

            int temp;
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
                System.out.print(temp + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(num);
        } else {
            int fib[] = new int[num + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= num; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            for (int i = 0; i < fib.length; i++) {
                System.out.print(fib[i] + " ");
            }
        }
        System.out.println();

        // fib(num);

        sc.close();
    }
}
