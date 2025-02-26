package Arrays;
/* Rotate array by K elements : Block Swap Algorithm

Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.
*/

import java.util.Scanner;

public class Q8_RotateArray {
    public static void rotateArr(int arr[], int n, int k) {
        int[] temp = new int[n];
        
        if (k > n) {
            k %= n;
        }
        
        // 1,2,3,4,5
        // k=2 n-k=3 i=0 i<3 i++
        for (int i = 0; i < n - k; i++) {
            temp[i] = arr[k + i]; // arr[2+0] arr[2+1] arr[2+2] = 3 4 5
        }
        // i=0 i<2 i++
        for (int i = 0; i < k; i++) {
            temp[n - k + i] = arr[i]; // temp[5-2+0]=arr[0] -> temp[3]=1 temp[4]=2
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of K:");
        int k = sc.nextInt();

        rotateArr(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
