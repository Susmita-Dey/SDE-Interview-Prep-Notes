/* Program to find Sum of GP Series
Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

a, first term
r, common ratio
n, number of terms
Write a program to find the sum of the geometric Progression Series.

Example 1:
Input: a=1 , r=0.5 , n=3
Output: 1.75
Explanation: The sum of given GP Series is 1.75

Example 2:
Input: a=3 , r=5 , n=2
Output: 18
Explanation: The sum of the given GP Series is 18
*/

package Numbers;

import java.util.*;

public class Q11_GP_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double r = sc.nextDouble();
        double n = sc.nextDouble();

        double gpSum = (a * (Math.pow(r, n) - 1)) / (r - 1);

        System.out.println(gpSum);

        sc.close();
    }
}
