/* Rearrange array in increasing-decreasing order

Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Examples:

Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
*/

import java.util.*;

public class Q6_ArrayIncDecOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take space-separated integers as input
        System.out.println("Enter the array elements (space-separated):");
        String[] input = sc.nextLine().split(" ");

        // Convert input strings to integers
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
