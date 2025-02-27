/* Program to Add two fractions
Problem Statement: Adding two fractional numbers.

Input:  1/2 + 3/2
Output: 2/1

Input:  1/3 + 3/9
Output: 2/3

Input:  1/5 + 3/15
Output: 2/5
*/

package Numbers;

import java.util.*;

public class Q31_AddFractions {
    public static int findgcd(int a, int b) {
        if (a == 0)
            return b;
        return findgcd(b % a, a);
    }

    // Function to convert the obtained fraction
    // into it's simplest form
    static void lowest(int den3, int num3) {
        // Finding gcd of both terms
        int common_factor = findgcd(num3, den3);

        // Converting both terms into simpler
        // terms by dividing them by common factor
        den3 = den3 / common_factor;
        num3 = num3 / common_factor;
        System.out.println(num3 + "/" + den3);
    }

    // Function to add two fractions
    static void addFraction(int num1, int den1,
            int num2, int den2) {
        // Finding gcd of den1 and den2
        int den3 = findgcd(den1, den2);

        // Denominator of final fraction obtained
        // finding LCM of den1 and den2
        // LCM * GCD = a * b
        den3 = (den1 * den2) / den3;

        // Changing the fractions to have same denominator
        // Numerator of the final fraction obtained
        int num3 = (num1) * (den3 / den1) + (num2) * (den3 / den2);

        // Calling function to convert final fraction
        // into it's simplest form
        lowest(den3, num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int deno1 = sc.nextInt();
        int num2 = sc.nextInt();
        int deno2 = sc.nextInt();

        System.out.print(num1 + "/" + deno1 + " + " + num2 + "/" + deno2 + " is equal to ");
        addFraction(num1, deno1, num2, deno2);

        sc.close();
    }
}
