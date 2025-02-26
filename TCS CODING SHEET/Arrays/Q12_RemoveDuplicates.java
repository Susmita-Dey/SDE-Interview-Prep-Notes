package Arrays;
/* Remove Duplicates From an Unsorted Array
Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements
*/

import java.util.*;

public class Q12_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        HashMap<Integer, Integer> hmp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hmp.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                hmp.put(arr[i], 1);
            }
        }

        System.out.println();
        sc.close();
    }
}
