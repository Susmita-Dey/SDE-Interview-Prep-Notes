/* Check if given year is a leap year or not
Problem Statement: Check if the given year is a leap year or not.

Example 1:
Input: 1996
Output: Yes
Explanation: Since 1996 is a leap year answer is “Yes”.

Example 2:
Input: 2000
Output: Yes
Explanation: Since 2000 is a leap year answer is “Yes”.
*/

package Numbers;

import java.util.*;

public class Q14_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
