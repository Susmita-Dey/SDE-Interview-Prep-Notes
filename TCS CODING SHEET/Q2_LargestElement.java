/*
 Q2. Find the Largest element in an array

Problem Statement: Given an array, we have to find the largest element in the array.

Examples

Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. 
*/

public class Q2_LargestElement {
    public static void main(String[] args) {
        int[] arr = { 8, 10, 5, 7, 9 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in the array is: " + max);
    }
}
