/* Program to Find Roots of a quadratic equation
Problem Statement: The standard form of a quadratic equation is:
ax2 + bx + c = 0, where a, b and c are real numbers and a != 0

You have given a, b, c of the equation, you have found the roots of the equation.

Example 1:
Input: a = 1, b = -3, c = -10
Output: Roots are real and different, i.e(5 , -2).

Example 2:
Input: a = 1, b = 1, c = 1
Output: Roots are complex, i.e-(-0.5+i1.732 , -0.5-i1.732).
*/

package Numbers;

import java.util.*;

public class Q35_QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = (b * b) - (4 * a * c);
        double root1, root2;

        if (a == 0) {
            System.out.println("Invalid");
        } else {
            if (d > 0) {
                root1 = (double) ((-b + Math.sqrt(d)) / (2 * a));
                root2 = (double) ((-b - Math.sqrt(d)) / (2 * a));
                System.out.println("The roots are real and different, i.e " + root1 + ", " + root2);
            } else if (d == 0) {
                root1 = root2 = (double) (-b / (2 * a));
                System.out.println("The roots are real and equal, i.e " + root1 + ", " + root2);
            } else {
                double realPart = (double) (-b / (2 * a));
                double imaginaryPart = (double) (Math.sqrt(-d) / (2 * a));
                System.out.println("The roots are complex, i.e " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
            }
        }

        sc.close();
    }
}
