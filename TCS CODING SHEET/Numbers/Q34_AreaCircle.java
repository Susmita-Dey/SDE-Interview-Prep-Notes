/* Calculate the Area of the Circle
Problem Statement: Given the radius of the circle, calculate the area of the circle.

Example 1:
Input: N = 5
Output: 78.5
Explanation: Using formula  πr2 for finding area of circle we get area as 78.5

Example 2:
Input: N = 4
Output: 50.2
Explanation: Using formula  πr2 for finding area of circle we get area as 50.2
*/

package Numbers;

import java.util.*;

public class Q34_AreaCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        // double area = Math.PI * radius * radius;

        double area = 3.14 * radius * radius;
        System.out.format("%.1f", area);

        sc.close();
    }
}
