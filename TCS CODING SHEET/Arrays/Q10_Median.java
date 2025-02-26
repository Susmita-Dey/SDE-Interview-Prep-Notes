package Arrays;
/* Find Median of the given Array
Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5

Median is defined as the value which is present in the middle for a series of values. Note, in order to find the median of an array of integers, we must make sure they are sorted.
*/

import java.util.*;

public class Q10_Median {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        bubbleSort(arr);

        int len = arr.length;
        double median = 0;

        if (len % 2 != 0) {
            median = arr[len / 2];
        } else {
            median = (arr[(len - 1) / 2] + arr[len / 2]) / 2.0;
        }

        System.out.println(median);

        sc.close();
    }
}
