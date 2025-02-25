/* Reverse a given Array
Problem Statement: You are given an array. The task is to reverse the array and print it. 

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*/

public class Q4_ReverseArray {
    public static int[] reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1, temp = 0;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        System.out.println("Array Elements in Reversed Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nReversed Array By Swapping Elements:");

        int arr1[] = { 10, 20, 30, 40 };
        int res[] = reverseArray(arr1);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        System.out.println();
    }
}
